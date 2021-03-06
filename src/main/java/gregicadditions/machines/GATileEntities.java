package gregicadditions.machines;

import gregicadditions.GAConfig;
import gregicadditions.GATextures;
import gregicadditions.recipes.GARecipeMaps;
import gregtech.api.GregTechAPI;
import gregtech.api.metatileentity.SimpleGeneratorMetaTileEntity;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.render.Textures;
import gregtech.api.unification.material.Materials;
import gregtech.common.metatileentities.electric.MetaTileEntityAirCollector;
import gregtech.common.metatileentities.electric.MetaTileEntityPump;

public class GATileEntities {
    public static SimpleMachineMetaTileEntity[] CIRCUITASSEMBLER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] CLUSTERMILL = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] ELECTRIC_FURNACE = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] MACERATOR = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] ALLOY_SMELTER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] ARC_FURNACE = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] ASSEMBLER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] AUTOCLAVE = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] BENDER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] BREWERY = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] CANNER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] CENTRIFUGE = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] CHEMICAL_BATH = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] CHEMICAL_REACTOR = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] COMPRESSOR = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] CUTTER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] DISTILLERY = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] ELECTROLYZER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] ELECTROMAGNETIC_SEPARATOR = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] EXTRACTOR = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] EXTRUDER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] FERMENTER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] FLUID_CANNER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] FLUID_EXTRACTOR = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] FLUID_HEATER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] FLUID_SOLIDIFIER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] FORGE_HAMMER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] FORMING_PRESS = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] LATHE = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] MICROWAVE = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] MIXER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] ORE_WASHER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] PACKER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] UNPACKER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] PLASMA_ARC_FURNACE = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] POLARIZER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] LASER_ENGRAVER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] SIFTER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] THERMAL_CENTRIFUGE = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] WIREMILL = new SimpleMachineMetaTileEntity[8];
    public static SimpleGeneratorMetaTileEntity[] NAQUADAH_REACTOR = new SimpleGeneratorMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] REPLICATOR = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] MASS_FAB = new SimpleMachineMetaTileEntity[8];
    public static TileEntityFusionReactor[] FUSION_REACTOR = new TileEntityFusionReactor[3];

    public static TileEntityDistillTower DISTILL_TOWER;
    public static TileEntityAssemblyLine ASSEMBLY_LINE;
    public static TileEntityCrackerUnit CRACKER_UNIT;

    public static TileEntityCokeOven COKE_OVEN;
    public static TileEntityCokeFluidHatch COKE_FLUID_HATCH;
    public static TileEntityCokeItemBus COKE_ITEM_BUS;

    public static TileEntityDrum WOODEN_DRUM;
    public static TileEntityDrum BRONZE_DRUM;
    public static TileEntityDrum STEEL_DRUM;
    public static TileEntityDrum STAINLESS_STEEL_DRUM;
    public static TileEntityDrum TITANIUM_DRUM;
    public static TileEntityDrum TUNGSTENSTEEL_DRUM;

    public static TileEntityCrate WOODEN_CRATE;
    public static TileEntityCrate BRONZE_CRATE;
    public static TileEntityCrate STEEL_CRATE;
    public static TileEntityCrate STAINLESS_STEEL_CRATE;
    public static TileEntityCrate TITANIUM_CRATE;
    public static TileEntityCrate TUNGSTENSTEEL_CRATE;

    public static MetaTileEntityPump[] PUMP = new MetaTileEntityPump[8];
    public static MetaTileEntityAirCollector[] AIR_COLLECTOR = new MetaTileEntityAirCollector[8];

    public static void init() {
        CIRCUITASSEMBLER[0] = GregTechAPI.registerMetaTileEntity(2000, new SimpleMachineMetaTileEntity("circuit_assembler.lv", GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 1));
        CIRCUITASSEMBLER[1] = GregTechAPI.registerMetaTileEntity(2001, new SimpleMachineMetaTileEntity("circuit_assembler.mv", GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 2));
        CIRCUITASSEMBLER[2] = GregTechAPI.registerMetaTileEntity(2002, new SimpleMachineMetaTileEntity("circuit_assembler.hv", GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 3));
        CIRCUITASSEMBLER[3] = GregTechAPI.registerMetaTileEntity(2003, new SimpleMachineMetaTileEntity("circuit_assembler.ev", GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 4));
        if (GAConfig.GT5U.highTierCircuitAssemblers == true) {
            CIRCUITASSEMBLER[4] = GregTechAPI.registerMetaTileEntity(2004, new SimpleMachineMetaTileEntity("circuit_assembler.iv", GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 5));
            CIRCUITASSEMBLER[5] = GregTechAPI.registerMetaTileEntity(2005, new SimpleMachineMetaTileEntity("circuit_assembler.luv", GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 6));
            CIRCUITASSEMBLER[6] = GregTechAPI.registerMetaTileEntity(2006, new SimpleMachineMetaTileEntity("circuit_assembler.zpm", GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 7));
            CIRCUITASSEMBLER[7] = GregTechAPI.registerMetaTileEntity(2007, new SimpleMachineMetaTileEntity("circuit_assembler.uv", GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierClusterMills == true) {
            CLUSTERMILL[0] = GregTechAPI.registerMetaTileEntity(2008, new SimpleMachineMetaTileEntity("cluster_mill.lv", GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 1));
            CLUSTERMILL[1] = GregTechAPI.registerMetaTileEntity(2009, new SimpleMachineMetaTileEntity("cluster_mill.mv", GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 2));
            CLUSTERMILL[2] = GregTechAPI.registerMetaTileEntity(2010, new SimpleMachineMetaTileEntity("cluster_mill.hv", GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 3));
            CLUSTERMILL[3] = GregTechAPI.registerMetaTileEntity(2011, new SimpleMachineMetaTileEntity("cluster_mill.ev", GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 4));
            CLUSTERMILL[4] = GregTechAPI.registerMetaTileEntity(2012, new SimpleMachineMetaTileEntity("cluster_mill.iv", GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 5));
            CLUSTERMILL[5] = GregTechAPI.registerMetaTileEntity(2013, new SimpleMachineMetaTileEntity("cluster_mill.luv", GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 6));
            CLUSTERMILL[6] = GregTechAPI.registerMetaTileEntity(2014, new SimpleMachineMetaTileEntity("cluster_mill.zpm", GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 7));
            CLUSTERMILL[7] = GregTechAPI.registerMetaTileEntity(2015, new SimpleMachineMetaTileEntity("cluster_mill.uv", GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierElectricFurnace == true) {
            ELECTRIC_FURNACE[4] = GregTechAPI.registerMetaTileEntity(2016, new SimpleMachineMetaTileEntity("electric_furnace.iv", RecipeMaps.FURNACE_RECIPES, Textures.FURNACE_OVERLAY, 5));
            ELECTRIC_FURNACE[5] = GregTechAPI.registerMetaTileEntity(2017, new SimpleMachineMetaTileEntity("electric_furnace.luv", RecipeMaps.FURNACE_RECIPES, Textures.FURNACE_OVERLAY, 6));
            ELECTRIC_FURNACE[6] = GregTechAPI.registerMetaTileEntity(2018, new SimpleMachineMetaTileEntity("electric_furnace.zpm", RecipeMaps.FURNACE_RECIPES, Textures.FURNACE_OVERLAY, 7));
            ELECTRIC_FURNACE[7] = GregTechAPI.registerMetaTileEntity(2019, new SimpleMachineMetaTileEntity("electric_furnace.uv", RecipeMaps.FURNACE_RECIPES, Textures.FURNACE_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierMacerators == true) {
            MACERATOR[4] = GregTechAPI.registerMetaTileEntity(2020, new SimpleMachineMetaTileEntity("macerator.iv", RecipeMaps.MACERATOR_RECIPES, Textures.MACERATOR_OVERLAY, 5));
            MACERATOR[5] = GregTechAPI.registerMetaTileEntity(2021, new SimpleMachineMetaTileEntity("macerator.luv", RecipeMaps.MACERATOR_RECIPES, Textures.MACERATOR_OVERLAY, 6));
            MACERATOR[6] = GregTechAPI.registerMetaTileEntity(2022, new SimpleMachineMetaTileEntity("macerator.zpm", RecipeMaps.MACERATOR_RECIPES, Textures.MACERATOR_OVERLAY, 7));
            MACERATOR[7] = GregTechAPI.registerMetaTileEntity(2023, new SimpleMachineMetaTileEntity("macerator.uv", RecipeMaps.MACERATOR_RECIPES, Textures.MACERATOR_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierAlloySmelter == true) {
            ALLOY_SMELTER[4] = GregTechAPI.registerMetaTileEntity(2024, new SimpleMachineMetaTileEntity("alloy_smelter.iv", RecipeMaps.ALLOY_SMELTER_RECIPES, Textures.ALLOY_SMELTER_OVERLAY, 5));
            ALLOY_SMELTER[5] = GregTechAPI.registerMetaTileEntity(2025, new SimpleMachineMetaTileEntity("alloy_smelter.luv", RecipeMaps.ALLOY_SMELTER_RECIPES, Textures.ALLOY_SMELTER_OVERLAY, 6));
            ALLOY_SMELTER[6] = GregTechAPI.registerMetaTileEntity(2026, new SimpleMachineMetaTileEntity("alloy_smelter.zpm", RecipeMaps.ALLOY_SMELTER_RECIPES, Textures.ALLOY_SMELTER_OVERLAY, 7));
            ALLOY_SMELTER[7] = GregTechAPI.registerMetaTileEntity(2027, new SimpleMachineMetaTileEntity("alloy_smelter.uv", RecipeMaps.ALLOY_SMELTER_RECIPES, Textures.ALLOY_SMELTER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierArcFurnaces == true) {
            ARC_FURNACE[4] = GregTechAPI.registerMetaTileEntity(2032, new SimpleMachineMetaTileEntity("arc_furnace.iv", RecipeMaps.ARC_FURNACE_RECIPES, Textures.ARC_FURNACE_OVERLAY, 5));
            ARC_FURNACE[5] = GregTechAPI.registerMetaTileEntity(2033, new SimpleMachineMetaTileEntity("arc_furnace.luv", RecipeMaps.ARC_FURNACE_RECIPES, Textures.ARC_FURNACE_OVERLAY, 6));
            ARC_FURNACE[6] = GregTechAPI.registerMetaTileEntity(2034, new SimpleMachineMetaTileEntity("arc_furnace.zpm", RecipeMaps.ARC_FURNACE_RECIPES, Textures.ARC_FURNACE_OVERLAY, 7));
            ARC_FURNACE[7] = GregTechAPI.registerMetaTileEntity(2035, new SimpleMachineMetaTileEntity("arc_furnace.uv", RecipeMaps.ARC_FURNACE_RECIPES, Textures.ARC_FURNACE_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierAssemblers == true) {
            ASSEMBLER[4] = GregTechAPI.registerMetaTileEntity(2036, new SimpleMachineMetaTileEntity("assembler.iv", RecipeMaps.ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 5));
            ASSEMBLER[5] = GregTechAPI.registerMetaTileEntity(2037, new SimpleMachineMetaTileEntity("assembler.luv", RecipeMaps.ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 6));
            ASSEMBLER[6] = GregTechAPI.registerMetaTileEntity(2038, new SimpleMachineMetaTileEntity("assembler.zpm", RecipeMaps.ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 7));
            ASSEMBLER[7] = GregTechAPI.registerMetaTileEntity(2039, new SimpleMachineMetaTileEntity("assembler.uv", RecipeMaps.ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierAutoclaves == true) {
            AUTOCLAVE[4] = GregTechAPI.registerMetaTileEntity(2040, new SimpleMachineMetaTileEntity("autoclave.iv", RecipeMaps.AUTOCLAVE_RECIPES, Textures.AUTOCLAVE_OVERLAY, 5));
            AUTOCLAVE[5] = GregTechAPI.registerMetaTileEntity(2041, new SimpleMachineMetaTileEntity("autoclave.luv", RecipeMaps.AUTOCLAVE_RECIPES, Textures.AUTOCLAVE_OVERLAY, 6));
            AUTOCLAVE[6] = GregTechAPI.registerMetaTileEntity(2042, new SimpleMachineMetaTileEntity("autoclave.zpm", RecipeMaps.AUTOCLAVE_RECIPES, Textures.AUTOCLAVE_OVERLAY, 7));
            AUTOCLAVE[7] = GregTechAPI.registerMetaTileEntity(2043, new SimpleMachineMetaTileEntity("autoclave.uv", RecipeMaps.AUTOCLAVE_RECIPES, Textures.AUTOCLAVE_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierBenders == true) {
            BENDER[4] = GregTechAPI.registerMetaTileEntity(2044, new SimpleMachineMetaTileEntity("bender.iv", RecipeMaps.BENDER_RECIPES, Textures.BENDER_OVERLAY, 5));
            BENDER[5] = GregTechAPI.registerMetaTileEntity(2045, new SimpleMachineMetaTileEntity("bender.luv", RecipeMaps.BENDER_RECIPES, Textures.BENDER_OVERLAY, 6));
            BENDER[6] = GregTechAPI.registerMetaTileEntity(2046, new SimpleMachineMetaTileEntity("bender.zpm", RecipeMaps.BENDER_RECIPES, Textures.BENDER_OVERLAY, 7));
            BENDER[7] = GregTechAPI.registerMetaTileEntity(2047, new SimpleMachineMetaTileEntity("bender.uv", RecipeMaps.BENDER_RECIPES, Textures.BENDER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierBreweries == true) {
            BREWERY[4] = GregTechAPI.registerMetaTileEntity(2048, new SimpleMachineMetaTileEntity("brewery.iv", RecipeMaps.BREWING_RECIPES, Textures.BREWERY_OVERLAY, 5));
            BREWERY[5] = GregTechAPI.registerMetaTileEntity(2049, new SimpleMachineMetaTileEntity("brewery.luv", RecipeMaps.BREWING_RECIPES, Textures.BREWERY_OVERLAY, 6));
            BREWERY[6] = GregTechAPI.registerMetaTileEntity(2050, new SimpleMachineMetaTileEntity("brewery.zpm", RecipeMaps.BREWING_RECIPES, Textures.BREWERY_OVERLAY, 7));
            BREWERY[7] = GregTechAPI.registerMetaTileEntity(2051, new SimpleMachineMetaTileEntity("brewery.uv", RecipeMaps.BREWING_RECIPES, Textures.BREWERY_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierCanners == true) {
            CANNER[4] = GregTechAPI.registerMetaTileEntity(2052, new SimpleMachineMetaTileEntity("canner.iv", RecipeMaps.CANNER_RECIPES, Textures.CANNER_OVERLAY, 5));
            CANNER[5] = GregTechAPI.registerMetaTileEntity(2053, new SimpleMachineMetaTileEntity("canner.luv", RecipeMaps.CANNER_RECIPES, Textures.CANNER_OVERLAY, 6));
            CANNER[6] = GregTechAPI.registerMetaTileEntity(2054, new SimpleMachineMetaTileEntity("canner.zpm", RecipeMaps.CANNER_RECIPES, Textures.CANNER_OVERLAY, 7));
            CANNER[7] = GregTechAPI.registerMetaTileEntity(2055, new SimpleMachineMetaTileEntity("canner.uv", RecipeMaps.CANNER_RECIPES, Textures.CANNER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierCentrifuges == true) {
            CENTRIFUGE[4] = GregTechAPI.registerMetaTileEntity(2056, new SimpleMachineMetaTileEntity("centrifuge.iv", RecipeMaps.CENTRIFUGE_RECIPES, Textures.CENTRIFUGE_OVERLAY, 5));
            CENTRIFUGE[5] = GregTechAPI.registerMetaTileEntity(2057, new SimpleMachineMetaTileEntity("centrifuge.luv", RecipeMaps.CENTRIFUGE_RECIPES, Textures.CENTRIFUGE_OVERLAY, 6));
            CENTRIFUGE[6] = GregTechAPI.registerMetaTileEntity(2058, new SimpleMachineMetaTileEntity("centrifuge.zpm", RecipeMaps.CENTRIFUGE_RECIPES, Textures.CENTRIFUGE_OVERLAY, 7));
            CENTRIFUGE[7] = GregTechAPI.registerMetaTileEntity(2059, new SimpleMachineMetaTileEntity("centrifuge.uv", RecipeMaps.CENTRIFUGE_RECIPES, Textures.CENTRIFUGE_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierChemicalBaths == true) {
            CHEMICAL_BATH[4] = GregTechAPI.registerMetaTileEntity(2060, new SimpleMachineMetaTileEntity("chemical_bath.iv", RecipeMaps.CHEMICAL_BATH_RECIPES, Textures.CHEMICAL_BATH_OVERLAY, 5));
            CHEMICAL_BATH[5] = GregTechAPI.registerMetaTileEntity(2061, new SimpleMachineMetaTileEntity("chemical_bath.luv", RecipeMaps.CHEMICAL_BATH_RECIPES, Textures.CHEMICAL_BATH_OVERLAY, 6));
            CHEMICAL_BATH[6] = GregTechAPI.registerMetaTileEntity(2062, new SimpleMachineMetaTileEntity("chemical_bath.zpm", RecipeMaps.CHEMICAL_BATH_RECIPES, Textures.CHEMICAL_BATH_OVERLAY, 7));
            CHEMICAL_BATH[7] = GregTechAPI.registerMetaTileEntity(2063, new SimpleMachineMetaTileEntity("chemical_bath.uv", RecipeMaps.CHEMICAL_BATH_RECIPES, Textures.CHEMICAL_BATH_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierChemicalReactors == true) {
            CHEMICAL_REACTOR[4] = GregTechAPI.registerMetaTileEntity(2064, new SimpleMachineMetaTileEntity("chemical_reactor.iv", RecipeMaps.CHEMICAL_RECIPES, Textures.CHEMICAL_REACTOR_OVERLAY, 5));
            CHEMICAL_REACTOR[5] = GregTechAPI.registerMetaTileEntity(2065, new SimpleMachineMetaTileEntity("chemical_reactor.luv", RecipeMaps.CHEMICAL_RECIPES, Textures.CHEMICAL_REACTOR_OVERLAY, 6));
            CHEMICAL_REACTOR[6] = GregTechAPI.registerMetaTileEntity(2066, new SimpleMachineMetaTileEntity("chemical_reactor.zpm", RecipeMaps.CHEMICAL_RECIPES, Textures.CHEMICAL_REACTOR_OVERLAY, 7));
            CHEMICAL_REACTOR[7] = GregTechAPI.registerMetaTileEntity(2067, new SimpleMachineMetaTileEntity("chemical_reactor.uv", RecipeMaps.CHEMICAL_RECIPES, Textures.CHEMICAL_REACTOR_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierCompressors == true) {
            COMPRESSOR[4] = GregTechAPI.registerMetaTileEntity(2068, new SimpleMachineMetaTileEntity("compressor.iv", RecipeMaps.COMPRESSOR_RECIPES, Textures.COMPRESSOR_OVERLAY, 5));
            COMPRESSOR[5] = GregTechAPI.registerMetaTileEntity(2069, new SimpleMachineMetaTileEntity("compressor.luv", RecipeMaps.COMPRESSOR_RECIPES, Textures.COMPRESSOR_OVERLAY, 6));
            COMPRESSOR[6] = GregTechAPI.registerMetaTileEntity(2070, new SimpleMachineMetaTileEntity("compressor.zpm", RecipeMaps.COMPRESSOR_RECIPES, Textures.COMPRESSOR_OVERLAY, 7));
            COMPRESSOR[7] = GregTechAPI.registerMetaTileEntity(2071, new SimpleMachineMetaTileEntity("compressor.uv", RecipeMaps.COMPRESSOR_RECIPES, Textures.COMPRESSOR_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierCutters == true) {
            CUTTER[4] = GregTechAPI.registerMetaTileEntity(2072, new SimpleMachineMetaTileEntity("cutter.iv", RecipeMaps.CUTTER_RECIPES, Textures.CUTTER_OVERLAY, 5));
            CUTTER[5] = GregTechAPI.registerMetaTileEntity(2073, new SimpleMachineMetaTileEntity("cutter.luv", RecipeMaps.CUTTER_RECIPES, Textures.CUTTER_OVERLAY, 6));
            CUTTER[6] = GregTechAPI.registerMetaTileEntity(2074, new SimpleMachineMetaTileEntity("cutter.zpm", RecipeMaps.CUTTER_RECIPES, Textures.CUTTER_OVERLAY, 7));
            CUTTER[7] = GregTechAPI.registerMetaTileEntity(2075, new SimpleMachineMetaTileEntity("cutter.uv", RecipeMaps.CUTTER_RECIPES, Textures.CUTTER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierDistilleries == true) {
            DISTILLERY[4] = GregTechAPI.registerMetaTileEntity(2076, new SimpleMachineMetaTileEntity("distillery.iv", RecipeMaps.DISTILLERY_RECIPES, Textures.DISTILLERY_OVERLAY, 5));
            DISTILLERY[5] = GregTechAPI.registerMetaTileEntity(2077, new SimpleMachineMetaTileEntity("distillery.luv", RecipeMaps.DISTILLERY_RECIPES, Textures.DISTILLERY_OVERLAY, 6));
            DISTILLERY[6] = GregTechAPI.registerMetaTileEntity(2078, new SimpleMachineMetaTileEntity("distillery.zpm", RecipeMaps.DISTILLERY_RECIPES, Textures.DISTILLERY_OVERLAY, 7));
            DISTILLERY[7] = GregTechAPI.registerMetaTileEntity(2079, new SimpleMachineMetaTileEntity("distillery.uv", RecipeMaps.DISTILLERY_RECIPES, Textures.DISTILLERY_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierElectrolyzers == true) {
            ELECTROLYZER[4] = GregTechAPI.registerMetaTileEntity(2080, new SimpleMachineMetaTileEntity("electrolyzer.iv", RecipeMaps.ELECTROLYZER_RECIPES, Textures.ELECTROLYZER_OVERLAY, 5));
            ELECTROLYZER[5] = GregTechAPI.registerMetaTileEntity(2081, new SimpleMachineMetaTileEntity("electrolyzer.luv", RecipeMaps.ELECTROLYZER_RECIPES, Textures.ELECTROLYZER_OVERLAY, 6));
            ELECTROLYZER[6] = GregTechAPI.registerMetaTileEntity(2082, new SimpleMachineMetaTileEntity("electrolyzer.zpm", RecipeMaps.ELECTROLYZER_RECIPES, Textures.ELECTROLYZER_OVERLAY, 7));
            ELECTROLYZER[7] = GregTechAPI.registerMetaTileEntity(2083, new SimpleMachineMetaTileEntity("electrolyzer.uv", RecipeMaps.ELECTROLYZER_RECIPES, Textures.ELECTROLYZER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierElectromagneticSeparators == true) {
            ELECTROMAGNETIC_SEPARATOR[4] = GregTechAPI.registerMetaTileEntity(2084, new SimpleMachineMetaTileEntity("electromagnetic_separator.iv", RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES, Textures.ELECTROMAGNETIC_SEPARATOR_OVERLAY, 5));
            ELECTROMAGNETIC_SEPARATOR[5] = GregTechAPI.registerMetaTileEntity(2085, new SimpleMachineMetaTileEntity("electromagnetic_separator.luv", RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES, Textures.ELECTROMAGNETIC_SEPARATOR_OVERLAY, 6));
            ELECTROMAGNETIC_SEPARATOR[6] = GregTechAPI.registerMetaTileEntity(2086, new SimpleMachineMetaTileEntity("electromagnetic_separator.zpm", RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES, Textures.ELECTROMAGNETIC_SEPARATOR_OVERLAY, 7));
            ELECTROMAGNETIC_SEPARATOR[7] = GregTechAPI.registerMetaTileEntity(2087, new SimpleMachineMetaTileEntity("electromagnetic_separator.uv", RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES, Textures.ELECTROMAGNETIC_SEPARATOR_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierExtractors == true) {
            EXTRACTOR[4] = GregTechAPI.registerMetaTileEntity(2088, new SimpleMachineMetaTileEntity("extractor.iv", RecipeMaps.EXTRACTOR_RECIPES, Textures.EXTRACTOR_OVERLAY, 5));
            EXTRACTOR[5] = GregTechAPI.registerMetaTileEntity(2089, new SimpleMachineMetaTileEntity("extractor.luv", RecipeMaps.EXTRACTOR_RECIPES, Textures.EXTRACTOR_OVERLAY, 6));
            EXTRACTOR[6] = GregTechAPI.registerMetaTileEntity(2090, new SimpleMachineMetaTileEntity("extractor.zpm", RecipeMaps.EXTRACTOR_RECIPES, Textures.EXTRACTOR_OVERLAY, 7));
            EXTRACTOR[7] = GregTechAPI.registerMetaTileEntity(2091, new SimpleMachineMetaTileEntity("extractor.uv", RecipeMaps.EXTRACTOR_RECIPES, Textures.EXTRACTOR_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierExtruders == true) {
            EXTRUDER[4] = GregTechAPI.registerMetaTileEntity(2092, new SimpleMachineMetaTileEntity("extruder.iv", RecipeMaps.EXTRUDER_RECIPES, Textures.EXTRUDER_OVERLAY, 5));
            EXTRUDER[5] = GregTechAPI.registerMetaTileEntity(2093, new SimpleMachineMetaTileEntity("extruder.luv", RecipeMaps.EXTRUDER_RECIPES, Textures.EXTRUDER_OVERLAY, 6));
            EXTRUDER[6] = GregTechAPI.registerMetaTileEntity(2094, new SimpleMachineMetaTileEntity("extruder.zpm", RecipeMaps.EXTRUDER_RECIPES, Textures.EXTRUDER_OVERLAY, 7));
            EXTRUDER[7] = GregTechAPI.registerMetaTileEntity(2095, new SimpleMachineMetaTileEntity("extruder.uv", RecipeMaps.EXTRUDER_RECIPES, Textures.EXTRUDER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierFermenters == true) {
            FERMENTER[4] = GregTechAPI.registerMetaTileEntity(2096, new SimpleMachineMetaTileEntity("fermenter.iv", RecipeMaps.FERMENTING_RECIPES, Textures.FERMENTER_OVERLAY, 5));
            FERMENTER[5] = GregTechAPI.registerMetaTileEntity(2097, new SimpleMachineMetaTileEntity("fermenter.luv", RecipeMaps.FERMENTING_RECIPES, Textures.FERMENTER_OVERLAY, 6));
            FERMENTER[6] = GregTechAPI.registerMetaTileEntity(2098, new SimpleMachineMetaTileEntity("fermenter.zpm", RecipeMaps.FERMENTING_RECIPES, Textures.FERMENTER_OVERLAY, 7));
            FERMENTER[7] = GregTechAPI.registerMetaTileEntity(2099, new SimpleMachineMetaTileEntity("fermenter.uv", RecipeMaps.FERMENTING_RECIPES, Textures.FERMENTER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierFluidCanners == true) {
            FLUID_CANNER[4] = GregTechAPI.registerMetaTileEntity(2100, new SimpleMachineMetaTileEntity("fluid_canner.iv", RecipeMaps.FLUID_CANNER_RECIPES, Textures.FLUID_CANNER_OVERLAY, 5));
            FLUID_CANNER[5] = GregTechAPI.registerMetaTileEntity(2101, new SimpleMachineMetaTileEntity("fluid_canner.luv", RecipeMaps.FLUID_CANNER_RECIPES, Textures.FLUID_CANNER_OVERLAY, 6));
            FLUID_CANNER[6] = GregTechAPI.registerMetaTileEntity(2102, new SimpleMachineMetaTileEntity("fluid_canner.zpm", RecipeMaps.FLUID_CANNER_RECIPES, Textures.FLUID_CANNER_OVERLAY, 7));
            FLUID_CANNER[7] = GregTechAPI.registerMetaTileEntity(2103, new SimpleMachineMetaTileEntity("fluid_canner.uv", RecipeMaps.FLUID_CANNER_RECIPES, Textures.FLUID_CANNER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierFluidExtractors == true) {
            FLUID_EXTRACTOR[4] = GregTechAPI.registerMetaTileEntity(2104, new SimpleMachineMetaTileEntity("fluid_extractor.iv", RecipeMaps.FLUID_EXTRACTION_RECIPES, Textures.FLUID_EXTRACTOR_OVERLAY, 5));
            FLUID_EXTRACTOR[5] = GregTechAPI.registerMetaTileEntity(2105, new SimpleMachineMetaTileEntity("fluid_extractor.luv", RecipeMaps.FLUID_EXTRACTION_RECIPES, Textures.FLUID_EXTRACTOR_OVERLAY, 6));
            FLUID_EXTRACTOR[6] = GregTechAPI.registerMetaTileEntity(2106, new SimpleMachineMetaTileEntity("fluid_extractor.zpm", RecipeMaps.FLUID_EXTRACTION_RECIPES, Textures.FLUID_EXTRACTOR_OVERLAY, 7));
            FLUID_EXTRACTOR[7] = GregTechAPI.registerMetaTileEntity(2107, new SimpleMachineMetaTileEntity("fluid_extractor.uv", RecipeMaps.FLUID_EXTRACTION_RECIPES, Textures.FLUID_EXTRACTOR_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierFluidHeaters == true) {
            FLUID_HEATER[4] = GregTechAPI.registerMetaTileEntity(2108, new SimpleMachineMetaTileEntity("fluid_heater.iv", RecipeMaps.FLUID_HEATER_RECIPES, Textures.FLUID_HEATER_OVERLAY, 5));
            FLUID_HEATER[5] = GregTechAPI.registerMetaTileEntity(2109, new SimpleMachineMetaTileEntity("fluid_heater.luv", RecipeMaps.FLUID_HEATER_RECIPES, Textures.FLUID_HEATER_OVERLAY, 6));
            FLUID_HEATER[6] = GregTechAPI.registerMetaTileEntity(2110, new SimpleMachineMetaTileEntity("fluid_heater.zpm", RecipeMaps.FLUID_HEATER_RECIPES, Textures.FLUID_HEATER_OVERLAY, 7));
            FLUID_HEATER[7] = GregTechAPI.registerMetaTileEntity(2111, new SimpleMachineMetaTileEntity("fluid_heater.uv", RecipeMaps.FLUID_HEATER_RECIPES, Textures.FLUID_HEATER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierFluidSolidifiers == true) {
            FLUID_SOLIDIFIER[4] = GregTechAPI.registerMetaTileEntity(2112, new SimpleMachineMetaTileEntity("fluid_solidifier.iv", RecipeMaps.FLUID_SOLIDFICATION_RECIPES, Textures.FLUID_SOLIDIFIER_OVERLAY, 5));
            FLUID_SOLIDIFIER[5] = GregTechAPI.registerMetaTileEntity(2113, new SimpleMachineMetaTileEntity("fluid_solidifier.luv", RecipeMaps.FLUID_SOLIDFICATION_RECIPES, Textures.FLUID_SOLIDIFIER_OVERLAY, 6));
            FLUID_SOLIDIFIER[6] = GregTechAPI.registerMetaTileEntity(2114, new SimpleMachineMetaTileEntity("fluid_solidifier.zpm", RecipeMaps.FLUID_SOLIDFICATION_RECIPES, Textures.FLUID_SOLIDIFIER_OVERLAY, 7));
            FLUID_SOLIDIFIER[7] = GregTechAPI.registerMetaTileEntity(2115, new SimpleMachineMetaTileEntity("fluid_solidifier.uv", RecipeMaps.FLUID_SOLIDFICATION_RECIPES, Textures.FLUID_SOLIDIFIER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierForgeHammers == true) {
            FORGE_HAMMER[4] = GregTechAPI.registerMetaTileEntity(2116, new SimpleMachineMetaTileEntity("forge_hammer.iv", RecipeMaps.FORGE_HAMMER_RECIPES, Textures.FORGE_HAMMER_OVERLAY, 5));
            FORGE_HAMMER[5] = GregTechAPI.registerMetaTileEntity(2117, new SimpleMachineMetaTileEntity("forge_hammer.luv", RecipeMaps.FORGE_HAMMER_RECIPES, Textures.FORGE_HAMMER_OVERLAY, 6));
            FORGE_HAMMER[6] = GregTechAPI.registerMetaTileEntity(2118, new SimpleMachineMetaTileEntity("forge_hammer.zpm", RecipeMaps.FORGE_HAMMER_RECIPES, Textures.FORGE_HAMMER_OVERLAY, 7));
            FORGE_HAMMER[7] = GregTechAPI.registerMetaTileEntity(2119, new SimpleMachineMetaTileEntity("forge_hammer.uv", RecipeMaps.FORGE_HAMMER_RECIPES, Textures.FORGE_HAMMER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierFormingPresses == true) {
            FORMING_PRESS[4] = GregTechAPI.registerMetaTileEntity(2120, new SimpleMachineMetaTileEntity("forming_press.iv", RecipeMaps.FORMING_PRESS_RECIPES, Textures.FORMING_PRESS_OVERLAY, 5));
            FORMING_PRESS[5] = GregTechAPI.registerMetaTileEntity(2121, new SimpleMachineMetaTileEntity("forming_press.luv", RecipeMaps.FORMING_PRESS_RECIPES, Textures.FORMING_PRESS_OVERLAY, 6));
            FORMING_PRESS[6] = GregTechAPI.registerMetaTileEntity(2122, new SimpleMachineMetaTileEntity("forming_press.zpm", RecipeMaps.FORMING_PRESS_RECIPES, Textures.FORMING_PRESS_OVERLAY, 7));
            FORMING_PRESS[7] = GregTechAPI.registerMetaTileEntity(2123, new SimpleMachineMetaTileEntity("forming_press.uv", RecipeMaps.FORMING_PRESS_RECIPES, Textures.FORMING_PRESS_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierLathes == true) {
            LATHE[4] = GregTechAPI.registerMetaTileEntity(2124, new SimpleMachineMetaTileEntity("lathe.iv", RecipeMaps.LATHE_RECIPES, Textures.LATHE_OVERLAY, 5));
            LATHE[5] = GregTechAPI.registerMetaTileEntity(2125, new SimpleMachineMetaTileEntity("lathe.luv", RecipeMaps.LATHE_RECIPES, Textures.LATHE_OVERLAY, 6));
            LATHE[6] = GregTechAPI.registerMetaTileEntity(2126, new SimpleMachineMetaTileEntity("lathe.zpm", RecipeMaps.LATHE_RECIPES, Textures.LATHE_OVERLAY, 7));
            LATHE[7] = GregTechAPI.registerMetaTileEntity(2127, new SimpleMachineMetaTileEntity("lathe.uv", RecipeMaps.LATHE_RECIPES, Textures.LATHE_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierMicrowaves == true) {
            MICROWAVE[4] = GregTechAPI.registerMetaTileEntity(2128, new SimpleMachineMetaTileEntity("microwave.iv", RecipeMaps.MICROWAVE_RECIPES, Textures.MICROWAVE_OVERLAY, 5));
            MICROWAVE[5] = GregTechAPI.registerMetaTileEntity(2129, new SimpleMachineMetaTileEntity("microwave.luv", RecipeMaps.MICROWAVE_RECIPES, Textures.MICROWAVE_OVERLAY, 6));
            MICROWAVE[6] = GregTechAPI.registerMetaTileEntity(2130, new SimpleMachineMetaTileEntity("microwave.zpm", RecipeMaps.MICROWAVE_RECIPES, Textures.MICROWAVE_OVERLAY, 7));
            MICROWAVE[7] = GregTechAPI.registerMetaTileEntity(2131, new SimpleMachineMetaTileEntity("microwave.uv", RecipeMaps.MICROWAVE_RECIPES, Textures.MICROWAVE_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierMixers == true) {
            MIXER[4] = GregTechAPI.registerMetaTileEntity(2132, new SimpleMachineMetaTileEntity("mixer.iv", RecipeMaps.MIXER_RECIPES, Textures.MIXER_OVERLAY, 5));
            MIXER[5] = GregTechAPI.registerMetaTileEntity(2133, new SimpleMachineMetaTileEntity("mixer.luv", RecipeMaps.MIXER_RECIPES, Textures.MIXER_OVERLAY, 6));
            MIXER[6] = GregTechAPI.registerMetaTileEntity(2134, new SimpleMachineMetaTileEntity("mixer.zpm", RecipeMaps.MIXER_RECIPES, Textures.MIXER_OVERLAY, 7));
            MIXER[7] = GregTechAPI.registerMetaTileEntity(2135, new SimpleMachineMetaTileEntity("mixer.uv", RecipeMaps.MIXER_RECIPES, Textures.MIXER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierOreWashers == true) {
            ORE_WASHER[4] = GregTechAPI.registerMetaTileEntity(2136, new SimpleMachineMetaTileEntity("ore_washer.iv", RecipeMaps.ORE_WASHER_RECIPES, Textures.ORE_WASHER_OVERLAY, 5));
            ORE_WASHER[5] = GregTechAPI.registerMetaTileEntity(2137, new SimpleMachineMetaTileEntity("ore_washer.luv", RecipeMaps.ORE_WASHER_RECIPES, Textures.ORE_WASHER_OVERLAY, 6));
            ORE_WASHER[6] = GregTechAPI.registerMetaTileEntity(2138, new SimpleMachineMetaTileEntity("ore_washer.zpm", RecipeMaps.ORE_WASHER_RECIPES, Textures.ORE_WASHER_OVERLAY, 7));
            ORE_WASHER[7] = GregTechAPI.registerMetaTileEntity(2139, new SimpleMachineMetaTileEntity("ore_washer.uv", RecipeMaps.ORE_WASHER_RECIPES, Textures.ORE_WASHER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierPackers == true) {
            PACKER[4] = GregTechAPI.registerMetaTileEntity(2140, new SimpleMachineMetaTileEntity("packer.iv", RecipeMaps.PACKER_RECIPES, Textures.PACKER_OVERLAY, 5));
            PACKER[5] = GregTechAPI.registerMetaTileEntity(2141, new SimpleMachineMetaTileEntity("packer.luv", RecipeMaps.PACKER_RECIPES, Textures.PACKER_OVERLAY, 6));
            PACKER[6] = GregTechAPI.registerMetaTileEntity(2142, new SimpleMachineMetaTileEntity("packer.zpm", RecipeMaps.PACKER_RECIPES, Textures.PACKER_OVERLAY, 7));
            PACKER[7] = GregTechAPI.registerMetaTileEntity(2143, new SimpleMachineMetaTileEntity("packer.uv", RecipeMaps.PACKER_RECIPES, Textures.PACKER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierUnpackers == true) {
            UNPACKER[4] = GregTechAPI.registerMetaTileEntity(2144, new SimpleMachineMetaTileEntity("unpacker.iv", RecipeMaps.UNPACKER_RECIPES, Textures.UNPACKER_OVERLAY, 5));
            UNPACKER[5] = GregTechAPI.registerMetaTileEntity(2145, new SimpleMachineMetaTileEntity("unpacker.luv", RecipeMaps.UNPACKER_RECIPES, Textures.UNPACKER_OVERLAY, 6));
            UNPACKER[6] = GregTechAPI.registerMetaTileEntity(2146, new SimpleMachineMetaTileEntity("unpacker.zpm", RecipeMaps.UNPACKER_RECIPES, Textures.UNPACKER_OVERLAY, 7));
            UNPACKER[7] = GregTechAPI.registerMetaTileEntity(2147, new SimpleMachineMetaTileEntity("unpacker.uv", RecipeMaps.UNPACKER_RECIPES, Textures.UNPACKER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierPlasmaArcFurnaces == true) {
            PLASMA_ARC_FURNACE[4] = GregTechAPI.registerMetaTileEntity(2148, new SimpleMachineMetaTileEntity("plasma_arc_furnace.iv", RecipeMaps.PLASMA_ARC_FURNACE_RECIPES, Textures.PLASMA_ARC_FURNACE_OVERLAY, 5));
            PLASMA_ARC_FURNACE[5] = GregTechAPI.registerMetaTileEntity(2149, new SimpleMachineMetaTileEntity("plasma_arc_furnace.luv", RecipeMaps.PLASMA_ARC_FURNACE_RECIPES, Textures.PLASMA_ARC_FURNACE_OVERLAY, 6));
            PLASMA_ARC_FURNACE[6] = GregTechAPI.registerMetaTileEntity(2150, new SimpleMachineMetaTileEntity("plasma_arc_furnace.zpm", RecipeMaps.PLASMA_ARC_FURNACE_RECIPES, Textures.PLASMA_ARC_FURNACE_OVERLAY, 7));
            PLASMA_ARC_FURNACE[7] = GregTechAPI.registerMetaTileEntity(2151, new SimpleMachineMetaTileEntity("plasma_arc_furnace.uv", RecipeMaps.PLASMA_ARC_FURNACE_RECIPES, Textures.PLASMA_ARC_FURNACE_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierPolarizers == true) {
            POLARIZER[4] = GregTechAPI.registerMetaTileEntity(2152, new SimpleMachineMetaTileEntity("polarizer.iv", RecipeMaps.POLARIZER_RECIPES, Textures.POLARIZER_OVERLAY, 5));
            POLARIZER[5] = GregTechAPI.registerMetaTileEntity(2153, new SimpleMachineMetaTileEntity("polarizer.luv", RecipeMaps.POLARIZER_RECIPES, Textures.POLARIZER_OVERLAY, 6));
            POLARIZER[6] = GregTechAPI.registerMetaTileEntity(2154, new SimpleMachineMetaTileEntity("polarizer.zpm", RecipeMaps.POLARIZER_RECIPES, Textures.POLARIZER_OVERLAY, 7));
            POLARIZER[7] = GregTechAPI.registerMetaTileEntity(2155, new SimpleMachineMetaTileEntity("polarizer.uv", RecipeMaps.POLARIZER_RECIPES, Textures.POLARIZER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierLaserEngravers == true) {
            LASER_ENGRAVER[4] = GregTechAPI.registerMetaTileEntity(2156, new SimpleMachineMetaTileEntity("laser_engraver.iv", RecipeMaps.LASER_ENGRAVER_RECIPES, Textures.LASER_ENGRAVER_OVERLAY, 5));
            LASER_ENGRAVER[5] = GregTechAPI.registerMetaTileEntity(2157, new SimpleMachineMetaTileEntity("laser_engraver.luv", RecipeMaps.LASER_ENGRAVER_RECIPES, Textures.LASER_ENGRAVER_OVERLAY, 6));
            LASER_ENGRAVER[6] = GregTechAPI.registerMetaTileEntity(2158, new SimpleMachineMetaTileEntity("laser_engraver.zpm", RecipeMaps.LASER_ENGRAVER_RECIPES, Textures.LASER_ENGRAVER_OVERLAY, 7));
            LASER_ENGRAVER[7] = GregTechAPI.registerMetaTileEntity(2159, new SimpleMachineMetaTileEntity("laser_engraver.uv", RecipeMaps.LASER_ENGRAVER_RECIPES, Textures.LASER_ENGRAVER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierSifters == true) {
            SIFTER[4] = GregTechAPI.registerMetaTileEntity(2160, new SimpleMachineMetaTileEntity("sifter.iv", RecipeMaps.SIFTER_RECIPES, Textures.SIFTER_OVERLAY, 5));
            SIFTER[5] = GregTechAPI.registerMetaTileEntity(2161, new SimpleMachineMetaTileEntity("sifter.luv", RecipeMaps.SIFTER_RECIPES, Textures.SIFTER_OVERLAY, 6));
            SIFTER[6] = GregTechAPI.registerMetaTileEntity(2162, new SimpleMachineMetaTileEntity("sifter.zpm", RecipeMaps.SIFTER_RECIPES, Textures.SIFTER_OVERLAY, 7));
            SIFTER[7] = GregTechAPI.registerMetaTileEntity(2163, new SimpleMachineMetaTileEntity("sifter.uv", RecipeMaps.SIFTER_RECIPES, Textures.SIFTER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierThermalCentrifuges == true) {
            THERMAL_CENTRIFUGE[4] = GregTechAPI.registerMetaTileEntity(2164, new SimpleMachineMetaTileEntity("thermal_centrifuge.iv", RecipeMaps.THERMAL_CENTRIFUGE_RECIPES, Textures.THERMAL_CENTRIFUGE_OVERLAY, 5));
            THERMAL_CENTRIFUGE[5] = GregTechAPI.registerMetaTileEntity(2165, new SimpleMachineMetaTileEntity("thermal_centrifuge.luv", RecipeMaps.THERMAL_CENTRIFUGE_RECIPES, Textures.THERMAL_CENTRIFUGE_OVERLAY, 6));
            THERMAL_CENTRIFUGE[6] = GregTechAPI.registerMetaTileEntity(2166, new SimpleMachineMetaTileEntity("thermal_centrifuge.zpm", RecipeMaps.THERMAL_CENTRIFUGE_RECIPES, Textures.THERMAL_CENTRIFUGE_OVERLAY, 7));
            THERMAL_CENTRIFUGE[7] = GregTechAPI.registerMetaTileEntity(2167, new SimpleMachineMetaTileEntity("thermal_centrifuge.uv", RecipeMaps.THERMAL_CENTRIFUGE_RECIPES, Textures.THERMAL_CENTRIFUGE_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierWiremills == true) {
            WIREMILL[4] = GregTechAPI.registerMetaTileEntity(2168, new SimpleMachineMetaTileEntity("wiremill.iv", RecipeMaps.WIREMILL_RECIPES, Textures.WIREMILL_OVERLAY, 5));
            WIREMILL[5] = GregTechAPI.registerMetaTileEntity(2169, new SimpleMachineMetaTileEntity("wiremill.luv", RecipeMaps.WIREMILL_RECIPES, Textures.WIREMILL_OVERLAY, 6));
            WIREMILL[6] = GregTechAPI.registerMetaTileEntity(2170, new SimpleMachineMetaTileEntity("wiremill.zpm", RecipeMaps.WIREMILL_RECIPES, Textures.WIREMILL_OVERLAY, 7));
            WIREMILL[7] = GregTechAPI.registerMetaTileEntity(2171, new SimpleMachineMetaTileEntity("wiremill.uv", RecipeMaps.WIREMILL_RECIPES, Textures.WIREMILL_OVERLAY, 8));
        }

        NAQUADAH_REACTOR[3] = GregTechAPI.registerMetaTileEntity(2172, new SimpleGeneratorMetaTileEntity("naquadah_reactor.mk1", GARecipeMaps.NAQUADAH_REACTOR_FUELS, GATextures.NAQADAH_OVERLAY, 4));
        NAQUADAH_REACTOR[4] = GregTechAPI.registerMetaTileEntity(2173, new SimpleGeneratorMetaTileEntity("naquadah_reactor.mk2", GARecipeMaps.NAQUADAH_REACTOR_FUELS, GATextures.NAQADAH_OVERLAY, 5));
        NAQUADAH_REACTOR[5] = GregTechAPI.registerMetaTileEntity(2174, new SimpleGeneratorMetaTileEntity("naquadah_reactor.mk3", GARecipeMaps.NAQUADAH_REACTOR_FUELS, GATextures.NAQADAH_OVERLAY, 6));
        NAQUADAH_REACTOR[6] = GregTechAPI.registerMetaTileEntity(2191, new SimpleGeneratorMetaTileEntity("naquadah_reactor.mk4", GARecipeMaps.NAQUADAH_REACTOR_FUELS, GATextures.NAQADAH_OVERLAY, 7));

        MASS_FAB[0] = GregTechAPI.registerMetaTileEntity(2175, new SimpleMachineMetaTileEntity("mass_fab.lv", GARecipeMaps.MASS_FAB_RECIPES, GATextures.MASS_FAB_OVERLAY, 1));
        MASS_FAB[1] = GregTechAPI.registerMetaTileEntity(2176, new SimpleMachineMetaTileEntity("mass_fab.mv", GARecipeMaps.MASS_FAB_RECIPES, GATextures.MASS_FAB_OVERLAY, 2));
        MASS_FAB[2] = GregTechAPI.registerMetaTileEntity(2177, new SimpleMachineMetaTileEntity("mass_fab.hv", GARecipeMaps.MASS_FAB_RECIPES, GATextures.MASS_FAB_OVERLAY, 3));
        MASS_FAB[3] = GregTechAPI.registerMetaTileEntity(2178, new SimpleMachineMetaTileEntity("mass_fab.ev", GARecipeMaps.MASS_FAB_RECIPES, GATextures.MASS_FAB_OVERLAY, 4));
        if (GAConfig.GT5U.highTierMassFabs == true) {
            MASS_FAB[4] = GregTechAPI.registerMetaTileEntity(2179, new SimpleMachineMetaTileEntity("mass_fab.iv", GARecipeMaps.MASS_FAB_RECIPES, GATextures.MASS_FAB_OVERLAY, 5));
            MASS_FAB[5] = GregTechAPI.registerMetaTileEntity(2180, new SimpleMachineMetaTileEntity("mass_fab.luv", GARecipeMaps.MASS_FAB_RECIPES, GATextures.MASS_FAB_OVERLAY, 6));
            MASS_FAB[6] = GregTechAPI.registerMetaTileEntity(2181, new SimpleMachineMetaTileEntity("mass_fab.zpm", GARecipeMaps.MASS_FAB_RECIPES, GATextures.MASS_FAB_OVERLAY, 7));
            MASS_FAB[7] = GregTechAPI.registerMetaTileEntity(2182, new SimpleMachineMetaTileEntity("mass_fab.uv", GARecipeMaps.MASS_FAB_RECIPES, GATextures.MASS_FAB_OVERLAY, 8));
        }

        REPLICATOR[0] = GregTechAPI.registerMetaTileEntity(2183, new SimpleMachineMetaTileEntity("replicator.lv", GARecipeMaps.REPLICATOR_RECIPES, GATextures.REPLICATOR_OVERLAY, 1));
        REPLICATOR[1] = GregTechAPI.registerMetaTileEntity(2184, new SimpleMachineMetaTileEntity("replicator.mv", GARecipeMaps.REPLICATOR_RECIPES, GATextures.REPLICATOR_OVERLAY, 2));
        REPLICATOR[2] = GregTechAPI.registerMetaTileEntity(2185, new SimpleMachineMetaTileEntity("replicator.hv", GARecipeMaps.REPLICATOR_RECIPES, GATextures.REPLICATOR_OVERLAY, 3));
        REPLICATOR[3] = GregTechAPI.registerMetaTileEntity(2186, new SimpleMachineMetaTileEntity("replicator.ev", GARecipeMaps.REPLICATOR_RECIPES, GATextures.REPLICATOR_OVERLAY, 4));
        if (GAConfig.GT5U.highTierReplicators == true) {
            REPLICATOR[4] = GregTechAPI.registerMetaTileEntity(2187, new SimpleMachineMetaTileEntity("replicator.iv", GARecipeMaps.REPLICATOR_RECIPES, GATextures.REPLICATOR_OVERLAY, 5));
            REPLICATOR[5] = GregTechAPI.registerMetaTileEntity(2188, new SimpleMachineMetaTileEntity("replicator.luv", GARecipeMaps.REPLICATOR_RECIPES, GATextures.REPLICATOR_OVERLAY, 6));
            REPLICATOR[6] = GregTechAPI.registerMetaTileEntity(2189, new SimpleMachineMetaTileEntity("replicator.zpm", GARecipeMaps.REPLICATOR_RECIPES, GATextures.REPLICATOR_OVERLAY, 7));
            REPLICATOR[7] = GregTechAPI.registerMetaTileEntity(2190, new SimpleMachineMetaTileEntity("replicator.uv", GARecipeMaps.REPLICATOR_RECIPES, GATextures.REPLICATOR_OVERLAY, 8));
        }

        COKE_OVEN = GregTechAPI.registerMetaTileEntity(2500, new TileEntityCokeOven("coke_oven"));

        DISTILL_TOWER = GregTechAPI.registerMetaTileEntity(2501, new TileEntityDistillTower("distill_tower"));
        ASSEMBLY_LINE = GregTechAPI.registerMetaTileEntity(2502, new TileEntityAssemblyLine("assembly_line"));
        CRACKER_UNIT = GregTechAPI.registerMetaTileEntity(2503, new TileEntityCrackerUnit("cracker_unit"));

        FUSION_REACTOR[0] = GregTechAPI.registerMetaTileEntity(2504, new TileEntityFusionReactor("fusion_reactor.luv", 6));
        FUSION_REACTOR[1] = GregTechAPI.registerMetaTileEntity(2505, new TileEntityFusionReactor("fusion_reactor.zpm", 7));
        FUSION_REACTOR[2] = GregTechAPI.registerMetaTileEntity(2506, new TileEntityFusionReactor("fusion_reactor.uv", 8));

        COKE_FLUID_HATCH = GregTechAPI.registerMetaTileEntity(2507, new TileEntityCokeFluidHatch("coke_fluid_hatch"));
        COKE_ITEM_BUS = GregTechAPI.registerMetaTileEntity(2508, new TileEntityCokeItemBus("coke_item_bus"));

        if (GAConfig.GT6.registerDums == true) {
            WOODEN_DRUM = GregTechAPI.registerMetaTileEntity(2195, new TileEntityDrum("drum.wood", Materials.Wood, 16000));
            BRONZE_DRUM = GregTechAPI.registerMetaTileEntity(2196, new TileEntityDrum("drum.bronze", Materials.Bronze, 32000));
            STEEL_DRUM = GregTechAPI.registerMetaTileEntity(2197, new TileEntityDrum("drum.steel", Materials.Steel, 64000));
            STAINLESS_STEEL_DRUM = GregTechAPI.registerMetaTileEntity(2198, new TileEntityDrum("drum.stainless_steel", Materials.StainlessSteel, 96000));
            TITANIUM_DRUM = GregTechAPI.registerMetaTileEntity(2199, new TileEntityDrum("drum.titanium", Materials.Titanium, 128000));
            TUNGSTENSTEEL_DRUM = GregTechAPI.registerMetaTileEntity(2200, new TileEntityDrum("drum.tungstensteel", Materials.TungstenSteel, 192000));
        }

        if (GAConfig.GT5U.highTierPumps == true) {
            PUMP[4] = GregTechAPI.registerMetaTileEntity(2201, new MetaTileEntityPump("pump.iv", 5));
            PUMP[5] = GregTechAPI.registerMetaTileEntity(2202, new MetaTileEntityPump("pump.luv", 6));
            PUMP[6] = GregTechAPI.registerMetaTileEntity(2203, new MetaTileEntityPump("pump.zpm", 7));
            PUMP[7] = GregTechAPI.registerMetaTileEntity(2204, new MetaTileEntityPump("pump.uv", 8));
        }

        if (GAConfig.Misc.highTierCollector == true) {
            AIR_COLLECTOR[4] = GregTechAPI.registerMetaTileEntity(2205, new MetaTileEntityAirCollector("air_collector.iv", 5));
            AIR_COLLECTOR[5] = GregTechAPI.registerMetaTileEntity(2206, new MetaTileEntityAirCollector("air_collector.luv", 6));
        }

        if (GAConfig.Misc.registerCrates == true) {
            WOODEN_CRATE = GregTechAPI.registerMetaTileEntity(2207, new TileEntityCrate("crate.wood", Materials.Wood, 36));
            BRONZE_CRATE = GregTechAPI.registerMetaTileEntity(2208, new TileEntityCrate("crate.bronze", Materials.Bronze, 54));
            STEEL_CRATE = GregTechAPI.registerMetaTileEntity(2209, new TileEntityCrate("crate.steel", Materials.Steel, 72));
            STAINLESS_STEEL_CRATE = GregTechAPI.registerMetaTileEntity(2210, new TileEntityCrate("crate.stainless_steel", Materials.StainlessSteel, 90));
            TITANIUM_CRATE = GregTechAPI.registerMetaTileEntity(2211, new TileEntityCrate("crate.titanium", Materials.Titanium, 108));
            TUNGSTENSTEEL_CRATE = GregTechAPI.registerMetaTileEntity(2212, new TileEntityCrate("crate.tungstensteel", Materials.TungstenSteel, 126));
        }
    }
}
