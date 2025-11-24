package bluesteel42.hedges.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class SnowySpruceHedgeBlock extends HedgeBlock {
    public static final MapCodec<SnowySpruceHedgeBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                            Codecs.rangedInclusiveFloat(0.0F, 1.0F)
                                    .fieldOf("leaf_particle_chance")
                                    .forGetter(SnowyLeavesBlock -> SnowyLeavesBlock.leafParticleChance),
                            ParticleTypes.TYPE_CODEC.fieldOf("leaf_particle").forGetter(SnowyLeavesBlock -> SnowyLeavesBlock.leafParticleEffect),
                            createSettingsCodec()
                    )
                    .apply(instance, SnowySpruceHedgeBlock::new)
    );
    protected final ParticleEffect leafParticleEffect;

    public SnowySpruceHedgeBlock(float leafParticleChance, ParticleEffect leafParticleEffect, Settings settings) {
        super(leafParticleChance, settings);
        this.leafParticleEffect = leafParticleEffect;
    }

    public static BlockState getMeltedState(BlockState state, WorldAccess world, BlockPos pos) {
        return ModBlocks.SPRUCE_HEDGE_FALLING_NEEDLES.getDefaultState().with(WATERLOGGED, state.get(WATERLOGGED));
    }

    protected void melt(BlockState state, World world, BlockPos pos) {
        world.setBlockState(pos, getMeltedState(state, world, pos));
        world.updateNeighbor(pos, getMeltedState(state, world, pos).getBlock(), null);
    }

    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getLightLevel(LightType.BLOCK, pos) > 11 - state.getOpacity()) {
            this.melt(state, world, pos);
        }
        super.randomTick(state, world, pos, random);
    }

    @Override
    protected void spawnLeafParticle(World world, BlockPos pos, Random random) {
        ParticleUtil.spawnParticle(world, pos, random, this.leafParticleEffect);
    }

    @Override
    public MapCodec<SnowySpruceHedgeBlock> getCodec() {
        return CODEC;
    }
}
