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
        BlockStateModelGenerator.BlockTexturePool eldritch_planks_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlockClass.ELDRITCH_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlockClass.ELDRITCH_LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlockClass.ELDRITCH_SAPLING, ModBlockClass.POTTED_ELDRITCH_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        eldritch_planks_pool.stairs(ModBlockClass.ELDRITCH_STAIRS);
        eldritch_planks_pool.slab(ModBlockClass.ELDRITCH_SLAB);
        eldritch_planks_pool.fence(ModBlockClass.ELDRITCH_FENCE);
        eldritch_planks_pool.fenceGate(ModBlockClass.ELDRITCH_FENCE_GATE);
        eldritch_planks_pool.pressurePlate(ModBlockClass.ELDRITCH_PRESSURE_PLATE);
        eldritch_planks_pool.button(ModBlockClass.ELDRITCH_BUTTON);

        blockStateModelGenerator.registerDoor(ModBlockClass.ELDRITCH_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlockClass.ELDRITCH_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
