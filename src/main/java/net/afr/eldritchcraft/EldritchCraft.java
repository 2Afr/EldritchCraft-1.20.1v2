package net.afr.eldritchcraft;

import net.afr.eldritchcraft.block.ModBlockClass;
import net.afr.eldritchcraft.item.ModItems;
import net.afr.eldritchcraft.item.ModItemsTab;
import net.afr.eldritchcraft.world.tree.ModFoliagePlacerTypes;
import net.afr.eldritchcraft.world.tree.ModTrunkPlacerTypes;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EldritchCraft implements ModInitializer {
	public static final String MOD_ID = "eldritchcraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsTab.registerModItemsGroup();

		ModItems.registerModItems();
		ModBlockClass.registerModBlocks();

		ModTrunkPlacerTypes.register();
		ModFoliagePlacerTypes.register();

		StrippableBlockRegistry.register(ModBlockClass.ELDRITCH_LOG, ModBlockClass.STRIPPED_ELDRITCH_LOG);
		StrippableBlockRegistry.register(ModBlockClass.ELDRITCH_WOOD, ModBlockClass.STRIPPED_ELDRITCH_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlockClass.ELDRITCH_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlockClass.ELDRITCH_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlockClass.STRIPPED_ELDRITCH_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlockClass.STRIPPED_ELDRITCH_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlockClass.ELDRITCH_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlockClass.ELDRITCH_LEAVES, 30, 60);


	}
}