package net.afr.eldritchcraft.block;

import net.afr.eldritchcraft.EldritchCraft;
import net.afr.eldritchcraft.world.tree.EldritchSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockClass {

    public static final Block ELDRITCH_LOG = registerBlock("eldritch_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.5f)));
    public static final Block STRIPPED_ELDRITCH_LOG = registerBlock("stripped_eldritch_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.5f)));

    public static final Block ELDRITCH_WOOD = registerBlock("eldritch_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.5f)));

    public static final Block STRIPPED_ELDRITCH_WOOD = registerBlock("stripped_eldritch_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.5f)));

    public static final Block ELDRITCH_PLANKS = registerBlock("eldritch_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f)));

    public static final Block ELDRITCH_LEAVES = registerBlock("eldritch_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.25f).nonOpaque()));

    public static final Block ELDRITCH_SAPLING = registerBlock("eldritch_sapling",
            new SaplingBlock(new EldritchSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    public static final Block POTTED_ELDRITCH_SAPLING = Registry.register(Registries.BLOCK,
            new Identifier(EldritchCraft.MOD_ID, "potted_eldritch_sapling"),
            new FlowerPotBlock(ELDRITCH_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));
    public static final Block MOONFLOWER = registerBlock("moonflower",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.SUNFLOWER)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EldritchCraft.MOD_ID, name), block);
    }
    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(EldritchCraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        EldritchCraft.LOGGER.info("Registering ModBlocks for " + EldritchCraft.MOD_ID);
    }

}
