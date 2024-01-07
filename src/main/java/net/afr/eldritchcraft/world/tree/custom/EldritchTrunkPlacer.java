package net.afr.eldritchcraft.world.tree.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.afr.eldritchcraft.world.tree.ModTrunkPlacerTypes;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class EldritchTrunkPlacer extends TrunkPlacer {

    public static final Codec<EldritchTrunkPlacer> CODEC = RecordCodecBuilder.create(objectInstance ->
            fillTrunkPlacerFields(objectInstance).apply(objectInstance, EldritchTrunkPlacer::new));
    public EldritchTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return ModTrunkPlacerTypes.ELDRITCH_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        setToDirt(world, replacer, random, startPos.down(), config);
        height = 12;
        int height_ = height;

        for (int i = 0; i < height_; i++) {
            getAndSetState(world, replacer, random, startPos.up(i), config);

            if (i % 2 == 0 && random.nextBoolean()) {
                if (random.nextFloat() > 0) {
                    for (int x = 0; x <= 1; x++) {
                        replacer.accept(startPos.offset(Direction.WEST, 1), (BlockState) Function.identity().apply(config.trunkProvider
                                .get(random, startPos.up(i).offset(Direction.WEST, 1)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                        replacer.accept(startPos.up(1).offset(Direction.SOUTH, 1), (BlockState) Function.identity().apply(config.trunkProvider
                                .get(random, startPos.up(i).offset(Direction.SOUTH, 1)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                        replacer.accept(startPos.up(2).offset(Direction.EAST, 1), (BlockState) Function.identity().apply(config.trunkProvider
                                .get(random, startPos.up(i).offset(Direction.EAST, 1)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                        replacer.accept(startPos.up(3).offset(Direction.NORTH, 1), (BlockState) Function.identity().apply(config.trunkProvider
                                .get(random, startPos.up(i).offset(Direction.NORTH, 1)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                        replacer.accept(startPos.up(4).offset(Direction.WEST, 1), (BlockState) Function.identity().apply(config.trunkProvider
                                .get(random, startPos.up(i).offset(Direction.WEST, 1)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                        replacer.accept(startPos.up(5).offset(Direction.SOUTH, 1), (BlockState) Function.identity().apply(config.trunkProvider
                                .get(random, startPos.up(i).offset(Direction.SOUTH, 1)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                        replacer.accept(startPos.up(6).offset(Direction.EAST, 1), (BlockState) Function.identity().apply(config.trunkProvider
                                .get(random, startPos.up(i).offset(Direction.EAST, 1)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                        replacer.accept(startPos.up(7).offset(Direction.NORTH, 1), (BlockState) Function.identity().apply(config.trunkProvider
                                .get(random, startPos.up(i).offset(Direction.NORTH, 1)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                        replacer.accept(startPos.up(8).offset(Direction.WEST, 1), (BlockState) Function.identity().apply(config.trunkProvider
                                .get(random, startPos.up(i).offset(Direction.WEST, 1)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                        replacer.accept(startPos.up(9).offset(Direction.SOUTH, 1), (BlockState) Function.identity().apply(config.trunkProvider
                                .get(random, startPos.up(i).offset(Direction.SOUTH, 1)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                        replacer.accept(startPos.up(10).offset(Direction.EAST, 1), (BlockState) Function.identity().apply(config.trunkProvider
                                .get(random, startPos.up(i).offset(Direction.EAST, 1)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                    }
                }
            }
        }
        return ImmutableList.of(new FoliagePlacer.TreeNode(startPos.up(height_), 0, false));
    }
}
