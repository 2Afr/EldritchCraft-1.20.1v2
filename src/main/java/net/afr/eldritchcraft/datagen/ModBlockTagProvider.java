package net.afr.eldritchcraft.datagen;

import net.afr.eldritchcraft.block.ModBlockClass;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlockClass.ELDRITCH_LOG)
                .add(ModBlockClass.ELDRITCH_WOOD)
                .add(ModBlockClass.STRIPPED_ELDRITCH_LOG)
                .add(ModBlockClass.STRIPPED_ELDRITCH_WOOD)
                .add(ModBlockClass.ELDRITCH_STAIRS)
                .add(ModBlockClass.ELDRITCH_SLAB)
                .add(ModBlockClass.ELDRITCH_FENCE)
                .add(ModBlockClass.ELDRITCH_FENCE_GATE)
                .add(ModBlockClass.ELDRITCH_PRESSURE_PLATE)
                .add(ModBlockClass.ELDRITCH_DOOR)
                .add(ModBlockClass.ELDRITCH_TRAPDOOR)
                .add(ModBlockClass.ELDRITCH_BUTTON);
    }
}
