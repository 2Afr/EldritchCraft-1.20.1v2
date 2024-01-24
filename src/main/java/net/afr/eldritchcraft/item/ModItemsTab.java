package net.afr.eldritchcraft.item;

import net.afr.eldritchcraft.EldritchCraft;
import net.afr.eldritchcraft.block.ModBlockClass;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsTab {

    public static final ItemGroup ELDRITCH_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EldritchCraft.MOD_ID, "eldritchcraft"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eldritchcraft"))
                    .icon(() -> new ItemStack(ModBlockClass.ELDRITCH_SAPLING))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlockClass.ELDRITCH_LOG);
                        entries.add(ModBlockClass.ELDRITCH_WOOD);
                        entries.add(ModBlockClass.STRIPPED_ELDRITCH_LOG);
                        entries.add(ModBlockClass.STRIPPED_ELDRITCH_WOOD);
                        entries.add(ModBlockClass.ELDRITCH_PLANKS);
                        entries.add(ModBlockClass.ELDRITCH_LEAVES);
                        entries.add(ModBlockClass.ELDRITCH_SAPLING);
                        entries.add(ModBlockClass.MOONFLOWER);
                        entries.add(ModBlockClass.ELDRITCH_STAIRS);
                        entries.add(ModBlockClass.ELDRITCH_SLAB);
                        entries.add(ModBlockClass.ELDRITCH_FENCE);
                        entries.add(ModBlockClass.ELDRITCH_FENCE_GATE);
                        entries.add(ModBlockClass.ELDRITCH_PRESSURE_PLATE);
                        entries.add(ModBlockClass.ELDRITCH_DOOR);
                        entries.add(ModBlockClass.ELDRITCH_TRAPDOOR);
                        entries.add(ModBlockClass.ELDRITCH_BUTTON);
                    }).build());
    public static void registerModItemsGroup() {
        EldritchCraft.LOGGER.info("Registering Items Group for " + EldritchCraft.MOD_ID);
    }

}
