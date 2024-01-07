package net.afr.eldritchcraft.world.tree;

import net.afr.eldritchcraft.EldritchCraft;
import net.afr.eldritchcraft.mixin.TrunkPlacerTypeInvoker;
import net.afr.eldritchcraft.world.tree.custom.EldritchTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class ModTrunkPlacerTypes {

    public static final TrunkPlacerType<?> ELDRITCH_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("eldritch_trunk_placer", EldritchTrunkPlacer.CODEC);

    public static void register() {
        EldritchCraft.LOGGER.info("Registering Trunk Placers for: " + EldritchCraft.MOD_ID);
    }

}
