package net.afr.eldritchcraft.datagen;

import net.afr.eldritchcraft.block.ModBlockClass;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

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

        addDrop(ModBlockClass.ELDRITCH_LEAVES, leavesDrops(ModBlockClass.ELDRITCH_LEAVES, ModBlockClass.ELDRITCH_SAPLING, 0.025f));

        addPottedPlantDrops(ModBlockClass.POTTED_ELDRITCH_SAPLING);
    }
}
