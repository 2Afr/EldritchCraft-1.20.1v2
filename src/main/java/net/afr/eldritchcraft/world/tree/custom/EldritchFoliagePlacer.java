package net.afr.eldritchcraft.world.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.afr.eldritchcraft.world.tree.ModFoliagePlacerTypes;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class EldritchFoliagePlacer extends FoliagePlacer {

    public static final Codec<EldritchFoliagePlacer> CODEC = RecordCodecBuilder.create(eldritchFoliagePlacerInstance ->
            fillFoliagePlacerFields(eldritchFoliagePlacerInstance).and(Codec.intRange(0, 12).fieldOf("height")
                    .forGetter(instance -> instance.height))
                    .apply(eldritchFoliagePlacerInstance, EldritchFoliagePlacer::new));

    private final int height;
    public EldritchFoliagePlacer(IntProvider radius, IntProvider offset, int height) {
        super(radius, offset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return ModFoliagePlacerTypes.ELDRITCH_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config,
                            int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {

        // layer 0
        generateSquare(world, placer, random, config, treeNode.getCenter().down(0), 0, 0, treeNode.isGiantTrunk());
        // layer 1
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.NORTH), 0, -1, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.SOUTH), 0, -1, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.WEST), 0, -1, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.EAST), 0, -1, treeNode.isGiantTrunk());
        // layer 2
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.NORTH), 0, -2, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.NORTH).offset(Direction.EAST), 0, -2, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.SOUTH), 0, -2, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.SOUTH).offset(Direction.EAST), 0, -2, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.WEST), 0, -2, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.EAST).offset(Direction.EAST), 0, -2, treeNode.isGiantTrunk());
        // layer 3
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.SOUTH).offset(Direction.SOUTH), 0, -3, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.WEST), 0, -3, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.WEST).offset(Direction.SOUTH), 0, -3, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.EAST), 0, -3, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.EAST).offset(Direction.SOUTH), 0, -3, treeNode.isGiantTrunk());
        // layer 4
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.NORTH), 0, -4, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.NORTH).offset(Direction.WEST), 0, -4, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.SOUTH), 0, -4, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.SOUTH).offset(Direction.WEST), 0, -4, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.WEST).offset(Direction.WEST), 0, -4, treeNode.isGiantTrunk());
        // layer 5
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.NORTH).offset(Direction.NORTH), 0, -5, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.WEST), 0, -5, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.WEST).offset(Direction.NORTH), 0, -5, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.EAST), 0, -5, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.EAST).offset(Direction.NORTH), 0, -5, treeNode.isGiantTrunk());
        // layer 6
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.NORTH), 0, -6, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.NORTH).offset(Direction.EAST), 0, -6, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.SOUTH), 0, -6, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.SOUTH).offset(Direction.EAST), 0, -6, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.EAST).offset(Direction.EAST), 0, -6, treeNode.isGiantTrunk());
        // layer 7
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.SOUTH).offset(Direction.SOUTH), 0, -7, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.WEST), 0, -7, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.WEST).offset(Direction.SOUTH), 0, -7, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.EAST), 0, -7, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.EAST).offset(Direction.SOUTH), 0, -7, treeNode.isGiantTrunk());
        // layer 8
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.NORTH), 0, -8, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.NORTH).offset(Direction.WEST), 0, -8, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.SOUTH), 0, -8, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.SOUTH).offset(Direction.WEST), 0, -8, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.WEST).offset(Direction.WEST), 0, -8, treeNode.isGiantTrunk());
        // layer 9
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.NORTH).offset(Direction.NORTH), 0, -9, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.WEST), 0, -9, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.WEST).offset(Direction.NORTH), 0, -9, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.EAST), 0, -9, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.EAST).offset(Direction.NORTH), 0, -9, treeNode.isGiantTrunk());
        // layer 10
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.NORTH), 0, -10, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.NORTH).offset(Direction.EAST), 0, -10, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.SOUTH), 0, -10, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.SOUTH).offset(Direction.EAST), 0, -10, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.EAST).offset(Direction.EAST), 0, -10, treeNode.isGiantTrunk());
        // layer 11
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.SOUTH).offset(Direction.SOUTH), 0, -11, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.WEST), 0, -11, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.WEST).offset(Direction.SOUTH), 0, -11, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.EAST), 0, -11, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.EAST).offset(Direction.SOUTH), 0, -11, treeNode.isGiantTrunk());
        // layer 12
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.NORTH).offset(Direction.WEST), 0, -12, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.SOUTH).offset(Direction.WEST), 0, -12, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().offset(Direction.WEST).offset(Direction.WEST), 0, -12, treeNode.isGiantTrunk());
    }

    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return this.height;
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return false;
    }
}
