package net.afr.eldritchcraft.datagen;

import net.afr.eldritchcraft.block.ModBlockClass;
import net.afr.eldritchcraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.TallFlowerBlock;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlockClass.ELDRITCH_LOG);
        addDrop(ModBlockClass.ELDRITCH_WOOD);
        addDrop(ModBlockClass.STRIPPED_ELDRITCH_LOG);
        addDrop(ModBlockClass.STRIPPED_ELDRITCH_WOOD);
        addDrop(ModBlockClass.ELDRITCH_PLANKS);
        addDrop(ModBlockClass.ELDRITCH_SAPLING);
        addDrop(ModBlockClass.ELDRITCH_STAIRS);
        addDrop(ModBlockClass.ELDRITCH_SLAB, slabDrops(ModBlockClass.ELDRITCH_SLAB));
        addDrop(ModBlockClass.ELDRITCH_FENCE);
        addDrop(ModBlockClass.ELDRITCH_FENCE_GATE);
        addDrop(ModBlockClass.ELDRITCH_PRESSURE_PLATE);
        addDrop(ModBlockClass.ELDRITCH_DOOR, doorDrops(ModBlockClass.ELDRITCH_DOOR));
        addDrop(ModBlockClass.ELDRITCH_TRAPDOOR);
        addDrop(ModBlockClass.ELDRITCH_BUTTON);

        addDrop(ModBlockClass.MOONFLOWER); // drops amount of two instead of one item (TBF)

        addDrop(ModBlockClass.ELDRITCH_LEAVES, leavesDrops(ModBlockClass.ELDRITCH_LEAVES, ModBlockClass.ELDRITCH_SAPLING, 0.025f));

        addPottedPlantDrops(ModBlockClass.POTTED_ELDRITCH_SAPLING);
    }
}
