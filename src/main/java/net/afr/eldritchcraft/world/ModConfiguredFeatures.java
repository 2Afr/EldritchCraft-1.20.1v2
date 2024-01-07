package net.afr.eldritchcraft.world;

import net.afr.eldritchcraft.EldritchCraft;
import net.afr.eldritchcraft.block.ModBlockClass;
import net.afr.eldritchcraft.world.tree.custom.EldritchFoliagePlacer;
import net.afr.eldritchcraft.world.tree.custom.EldritchTrunkPlacer;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> ELDRITCH_KEY = registerKey("eldritch");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, ELDRITCH_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlockClass.ELDRITCH_LOG),
                new EldritchTrunkPlacer(5, 4, 3),

                BlockStateProvider.of(ModBlockClass.ELDRITCH_LEAVES),
                new EldritchFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),

                new TwoLayersFeatureSize(1,0,2)).build());
    }

    public static final RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(EldritchCraft.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
