package bluesteel42.hedges.particle;

import bluesteel42.hedges.Hedges;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.particle.TintedParticleEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {

    public static final SimpleParticleType DOGWOOD_LEAVES = register("dogwood_leaves",FabricParticleTypes.simple());

    public static final ParticleType<TintedParticleEffect> GREEN_MAPLE_LEAVES = register("green_maple_leaves",
            FabricParticleTypes.complex(TintedParticleEffect::createCodec, TintedParticleEffect::createPacketCodec)
    );

    public static final SimpleParticleType RED_MAPLE_LEAVES = register("red_maple_leaves", FabricParticleTypes.simple());
    public static final SimpleParticleType YELLOW_MAPLE_LEAVES = register("yellow_maple_leaves", FabricParticleTypes.simple());

    public static final ParticleType<TintedParticleEffect> PINE_NEEDLES = ModParticles.register("pine_needles",
            FabricParticleTypes.complex(TintedParticleEffect::createCodec, TintedParticleEffect::createPacketCodec)
    );
    public static final ParticleType<TintedParticleEffect> SPRUCE_NEEDLES = ModParticles.register("spruce_needles",
            FabricParticleTypes.complex(TintedParticleEffect::createCodec, TintedParticleEffect::createPacketCodec)
    );
    public static final SimpleParticleType SNOWY_PINE_NEEDLES = ModParticles.register("snowy_pine_needles", FabricParticleTypes.simple());
    public static final SimpleParticleType SNOWY_SPRUCE_NEEDLES = ModParticles.register("snowy_spruce_needles", FabricParticleTypes.simple());


    public static <T extends ParticleEffect> ParticleType<T> register(String path, ParticleType<T> particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(Hedges.MOD_ID, path), particleType);
    }

    public static SimpleParticleType register(String path, SimpleParticleType particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(Hedges.MOD_ID, path), particleType);
    }

    public static void initialize() {}
}
