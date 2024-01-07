package net.afr.eldritchcraft.datagen;

import net.afr.eldritchcraft.block.ModBlockClass;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlockClass.ELDRITCH_LOG).log(ModBlockClass.ELDRITCH_LOG).wood(ModBlockClass.ELDRITCH_WOOD);
        blockStateModelGenerator.registerLog(ModBlockClass.STRIPPED_ELDRITCH_LOG).log(ModBlockClass.STRIPPED_ELDRITCH_LOG).wood(ModBlockClass.STRIPPED_ELDRITCH_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlockClass.ELDRITCH_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlockClass.ELDRITCH_LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlockClass.ELDRITCH_SAPLING, ModBlockClass.POTTED_ELDRITCH_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
