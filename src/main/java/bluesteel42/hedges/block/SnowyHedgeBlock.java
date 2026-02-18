package bluesteel42.hedges.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class SnowyHedgeBlock extends UntintedParticleHedgeBlock {
    private final Block meltedBlock;
    public SnowyHedgeBlock(float leafParticleChance, ParticleEffect leafParticleEffect, Settings settings, Block meltedBlockInit) {
        super(leafParticleChance, leafParticleEffect, settings);
        meltedBlock = meltedBlockInit;
    }

    public static BlockState getMeltedState(BlockState state, WorldAccess world, BlockPos pos, Block meltedBlock) {
        return meltedBlock.getDefaultState()
                .with(UP, state.get(UP))
                .with(EAST_WALL_SHAPE, state.get(EAST_WALL_SHAPE))
                .with(NORTH_WALL_SHAPE, state.get(NORTH_WALL_SHAPE))
                .with(SOUTH_WALL_SHAPE, state.get(SOUTH_WALL_SHAPE))
                .with(WEST_WALL_SHAPE, state.get(WEST_WALL_SHAPE))
                .with(WATERLOGGED, state.get(WATERLOGGED));
    }

    protected void melt(BlockState state, World world, BlockPos pos) {
        BlockState melted = getMeltedState(state, world, pos, this.meltedBlock);
        world.setBlockState(pos, melted);
        world.updateNeighbor(pos, melted.getBlock(), null);
    }

    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.randomTick(state, world, pos, random);
        if (world.getLightLevel(LightType.BLOCK, pos) > 11 - state.getOpacity()) {
            this.melt(state, world, pos);
        }
    }
}
