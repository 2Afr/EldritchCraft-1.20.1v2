package net.afr.eldritchcraft.item;

import net.afr.eldritchcraft.EldritchCraft;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EldritchCraft.MOD_ID, name), item);
    }
    public static void registerModItems() {
        EldritchCraft.LOGGER.info("Registering ModItems for " + EldritchCraft.MOD_ID);
    }
}
