package bluesteel42.hedges.block;

import bluesteel42.combinedworldgen.wood.pine.particle.PineWoodModParticles;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.particle.TintedParticleEffect;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class TintedParticlePineNeedleHedgeBlock extends HedgeBlock {
    public static final MapCodec<TintedParticlePineNeedleHedgeBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                            Codecs.rangedInclusiveFloat(0.0F, 1.0F)
                                    .fieldOf("leaf_particle_chance")
                                    .forGetter(tintedParticleLeavesBlock -> tintedParticleLeavesBlock.leafParticleChance),
                            createSettingsCodec()
                    )
                    .apply(instance, TintedParticlePineNeedleHedgeBlock::new)
    );

    public TintedParticlePineNeedleHedgeBlock(float f, Settings settings) {
        super(f, settings);
    }

    @Override
    protected void spawnLeafParticle(World world, BlockPos pos, Random random) {
        TintedParticleEffect entityEffectParticleEffect = TintedParticleEffect.create(PineWoodModParticles.PINE_NEEDLES, world.getBlockColor(pos));
        ParticleUtil.spawnParticle(world, pos, random, entityEffectParticleEffect);
    }

    @Override
    public MapCodec<? extends TintedParticlePineNeedleHedgeBlock> getCodec() {
        return CODEC;
    }
}
