package net.afr.eldritchcraft.world.tree;

import net.afr.eldritchcraft.EldritchCraft;
import net.afr.eldritchcraft.mixin.FoliagePlacerTypeInvoker;
import net.afr.eldritchcraft.world.tree.custom.EldritchFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class ModFoliagePlacerTypes {

    public static final FoliagePlacerType<?> ELDRITCH_FOLIAGE_PLACER = FoliagePlacerTypeInvoker
            .callRegister("eldritch_foliage_placer", EldritchFoliagePlacer.CODEC);

    public static void register() {
        EldritchCraft.LOGGER.info("Registering Foliage Placers for " + EldritchCraft.MOD_ID);
    }
}
