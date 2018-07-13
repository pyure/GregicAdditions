package gregicadditions.machines;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gregicadditions.GATextures;
import gregicadditions.item.GAMetaBlocks;
import gregicadditions.item.GAMultiblockCasing;
import gregicadditions.recipes.GARecipeMaps;
import gregtech.api.capability.impl.FluidTankList;
import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.ModularUI;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.gui.widgets.SlotWidget;
import gregtech.api.gui.widgets.TankWidget;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.MetaTileEntityHolder;
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase;
import gregtech.api.multiblock.BlockPattern;
import gregtech.api.multiblock.FactoryBlockPattern;
import gregtech.api.render.ICubeRenderer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.ItemStackHandler;

import java.util.ArrayList;
import java.util.List;

public class TileEntityCokeOven extends MultiblockControllerBase {
    private int maxProgressDuration;
    private int currentProgress;
    private NonNullList<ItemStack> outputsList;
    private List<FluidStack> outputFluids;
    private boolean isActive;
    private boolean wasActiveAndNeedUpdate;

    public TileEntityCokeOven(String metaTileEntityId) {
        super(metaTileEntityId);
    }

    @Override
    protected void updateFormedValid() {
        if (maxProgressDuration == 0) {
            if (tryPickNewRecipe()) {
                if (wasActiveAndNeedUpdate) {
                    this.wasActiveAndNeedUpdate = false;
                } else setActive(true);
            }
        } else if (++currentProgress >= maxProgressDuration) {
            finishCurrentRecipe();
            this.wasActiveAndNeedUpdate = true;
            return;
        }
        if (wasActiveAndNeedUpdate) {
            this.wasActiveAndNeedUpdate = false;
            setActive(false);
        }
    }

    private void finishCurrentRecipe() {
        this.maxProgressDuration = 0;
        this.currentProgress = 0;
        MetaTileEntity.addItemsToItemHandler(exportItems, false, outputsList);
        MetaTileEntity.addFluidsToFluidHandler(exportFluids, false, outputFluids);
        this.outputsList = null;
        this.outputFluids = null;
        markDirty();
    }

    private boolean tryPickNewRecipe() {
        ItemStack inputStack = importItems.getStackInSlot(0);
        if (inputStack.isEmpty()) return false;
        CokeOvenRecipe recipe = GARecipeMaps.COKE_OVEN_RECIPES.stream()
                .filter(recipe1 -> recipe1.getInput().getIngredient().apply(inputStack) &&
                        inputStack.getCount() >= recipe1.getInput().getCount())
                .findFirst().orElse(null);
        if (recipe == null) return false;
        NonNullList<ItemStack> outputs = NonNullList.create();
        outputs.add(recipe.getOutput().copy());
        List<FluidStack> fluidOutputs = new ArrayList();
        fluidOutputs.add(recipe.getOutputFluid().copy());
        if (MetaTileEntity.addItemsToItemHandler(exportItems, true, outputs) &&
                MetaTileEntity.addFluidsToFluidHandler(exportFluids, true, fluidOutputs)) {
            inputStack.shrink(recipe.getInput().getCount());
            importItems.setStackInSlot(0, inputStack);
            this.maxProgressDuration = recipe.getDuration();
            this.currentProgress = 0;
            this.outputsList = outputs;
            this.outputFluids = fluidOutputs;
            markDirty();
            return true;
        }
        return false;
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound data) {
        super.writeToNBT(data);
        data.setBoolean("Active", isActive);
        data.setBoolean("WasActive", wasActiveAndNeedUpdate);
        data.setInteger("MaxProgress", maxProgressDuration);
        if (maxProgressDuration > 0) {
            data.setInteger("Progress", currentProgress);
            NBTTagList itemOutputs = new NBTTagList();
            for (ItemStack itemStack : outputsList) {
                itemOutputs.appendTag(itemStack.writeToNBT(new NBTTagCompound()));
            }
            data.setTag("Outputs", itemOutputs);
            NBTTagList fluidOutputs = new NBTTagList();
            for (FluidStack fluidStack : outputFluids) {
                fluidOutputs.appendTag(fluidStack.writeToNBT(new NBTTagCompound()));
            }
            data.setTag("FluidOutputs", fluidOutputs);
        }
        return data;
    }

    @Override
    public void readFromNBT(NBTTagCompound data) {
        super.readFromNBT(data);
        this.isActive = data.getBoolean("Active");
        this.wasActiveAndNeedUpdate = data.getBoolean("WasActive");
        this.maxProgressDuration = data.getInteger("MaxProgress");
        if (maxProgressDuration > 0) {
            this.currentProgress = data.getInteger("Progress");
            NBTTagList itemOutputs = data.getTagList("Outputs", Constants.NBT.TAG_COMPOUND);
            this.outputsList = NonNullList.create();
            for (int i = 0; i < itemOutputs.tagCount(); i++) {
                this.outputsList.add(new ItemStack(itemOutputs.getCompoundTagAt(i)));
            }
            NBTTagList fluidOutputs = data.getTagList("FluidOutputs", Constants.NBT.TAG_COMPOUND);
            this.outputFluids = new ArrayList();
            for (int i = 0; i < fluidOutputs.tagCount(); i++) {
                this.outputFluids.add(FluidStack.loadFluidStackFromNBT(fluidOutputs.getCompoundTagAt(i)));
            }
        }
    }

    @Override
    public void writeInitialSyncData(PacketBuffer buf) {
        super.writeInitialSyncData(buf);
        buf.writeBoolean(isActive);
    }

    @Override
    public void receiveInitialSyncData(PacketBuffer buf) {
        super.receiveInitialSyncData(buf);
        this.isActive = buf.readBoolean();
    }

    @Override
    public void receiveCustomData(int dataId, PacketBuffer buf) {
        super.receiveCustomData(dataId, buf);
        if (dataId == -100) {
            this.isActive = buf.readBoolean();
        }
    }

    public void setActive(boolean active) {
        this.isActive = active;
        if (!getWorld().isRemote) {
            writeCustomData(-100, b -> b.writeBoolean(isActive));
        }
    }

    public boolean isActive() {
        return isActive;
    }

    public double getProgressScaled() {
        return maxProgressDuration == 0 ? 0.0 : (currentProgress / (maxProgressDuration * 1.0));
    }

    protected IBlockState getCasingState() {
        return GAMetaBlocks.MUTLIBLOCK_CASING.getState(GAMultiblockCasing.CasingType.COKE_OVEN_BRICKS);
    }

    @Override
    public ICubeRenderer getBaseTexture() {
        return GATextures.COKE_OVEN_BRICKS;
    }

    @Override
    public void renderMetaTileEntity(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
        super.renderMetaTileEntity(renderState, translation, pipeline);
        GATextures.COKE_OVEN_OVERLAY.render(renderState, translation, pipeline, getFrontFacing(), isActive());
    }

    @Override
    protected IItemHandlerModifiable createImportItemHandler() {
        return new ItemStackHandler(1);
    }

    @Override
    protected IItemHandlerModifiable createExportItemHandler() {
        return new ItemStackHandler(1);
    }

    @Override
    protected FluidTankList createExportFluidHandler() {
        return new FluidTankList(new FluidTank(4000));
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("XXX", "XXX", "XXX")
                .aisle("XXX", "X#X", "XXX")
                .aisle("XXX", "XYX", "XXX")
                .where('X', statePredicate(getCasingState()))
                .where('#', blockPredicate(Blocks.AIR))
                .where('Y', selfPredicate())
                .build();
    }

    @Override
    public MetaTileEntity createMetaTileEntity(MetaTileEntityHolder holder) {
        return new TileEntityCokeOven(metaTileEntityId);
    }

    @Override
    protected ModularUI createUI(EntityPlayer entityPlayer) {
        return ModularUI.builder(GuiTextures.BRONZE_BACKGROUND, 176, 166)
                //.image(11, 12, 17, 50, GuiTextures.PATTERN_BRONZE_BLAST_FURNACE)
                .widget(new SlotWidget(importItems, 0, 33, 24, true, true)
                        .setBackgroundTexture(GuiTextures.BRONZE_SLOT, GuiTextures.BRONZE_FURNACE_OVERLAY))
                .progressBar(this::getProgressScaled, 58, 24, 20, 15, GuiTextures.BRONZE_BLAST_FURNACE_PROGRESS_BAR, ProgressWidget.MoveType.HORIZONTAL)
                .widget(new SlotWidget(exportItems, 0, 85, 24, true, false)
                        .setBackgroundTexture(GuiTextures.BRONZE_SLOT, GuiTextures.BRONZE_INGOT_OVERLAY))
                .widget(new TankWidget(exportFluids.getTankAt(0), 102, 23, 18, 18)
                        .setBackgroundTexture(GuiTextures.FLUID_SLOT))
                .bindPlayerInventory(entityPlayer.inventory, GuiTextures.BRONZE_SLOT)
                .build(getHolder(), entityPlayer);
    }
}