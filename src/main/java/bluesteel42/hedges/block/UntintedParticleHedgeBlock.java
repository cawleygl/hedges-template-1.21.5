package bluesteel42.hedges.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class UntintedParticleHedgeBlock extends HedgeBlock {
    public static final MapCodec<UntintedParticleHedgeBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                            Codecs.rangedInclusiveFloat(0.0F, 1.0F)
                                    .fieldOf("leaf_particle_chance")
                                    .forGetter(untintedParticleHedgeBlock -> untintedParticleHedgeBlock.leafParticleChance),
                            ParticleTypes.TYPE_CODEC.fieldOf("leaf_particle").forGetter(untintedParticleHedgeBlock -> untintedParticleHedgeBlock.leafParticleEffect),
                            createSettingsCodec()
                    )
                    .apply(instance, UntintedParticleHedgeBlock::new)
    );
    protected final ParticleEffect leafParticleEffect;

    public UntintedParticleHedgeBlock(float leafParticleChance, ParticleEffect leafParticleEffect, AbstractBlock.Settings settings) {
        super(leafParticleChance, settings);
        this.leafParticleEffect = leafParticleEffect;
    }

    @Override
    protected void spawnLeafParticle(World world, BlockPos pos, Random random) {
        ParticleUtil.spawnParticle(world, pos, random, this.leafParticleEffect);
    }

    @Override
    public MapCodec<UntintedParticleHedgeBlock> getCodec() {
        return CODEC;
    }
}
