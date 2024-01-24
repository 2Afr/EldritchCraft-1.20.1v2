package net.afr.eldritchcraft.datagen;

import net.afr.eldritchcraft.block.ModBlockClass;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlockClass.ELDRITCH_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlockClass.ELDRITCH_LOG.asItem())
                .add(ModBlockClass.ELDRITCH_WOOD.asItem())
                .add(ModBlockClass.STRIPPED_ELDRITCH_LOG.asItem())
                .add(ModBlockClass.STRIPPED_ELDRITCH_WOOD.asItem())
                .add(ModBlockClass.ELDRITCH_STAIRS.asItem())
                .add(ModBlockClass.ELDRITCH_SLAB.asItem())
                .add(ModBlockClass.ELDRITCH_FENCE.asItem())
                .add(ModBlockClass.ELDRITCH_FENCE_GATE.asItem())
                .add(ModBlockClass.ELDRITCH_PRESSURE_PLATE.asItem())
                .add(ModBlockClass.ELDRITCH_DOOR.asItem())
                .add(ModBlockClass.ELDRITCH_TRAPDOOR.asItem())
                .add(ModBlockClass.ELDRITCH_BUTTON.asItem());
    }
}
