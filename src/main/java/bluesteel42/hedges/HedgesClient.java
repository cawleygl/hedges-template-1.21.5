package bluesteel42.hedges;

import bluesteel42.hedges.block.ModBlocks;
import bluesteel42.hedges.particle.ModParticles;
import bluesteel42.hedges.particle.DogwoodLeavesFactory;
import bluesteel42.hedges.particle.TintedNeedlesFactory;
import bluesteel42.hedges.particle.UntintedNeedlesFactory;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.particle.LeavesParticle;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.world.biome.FoliageColors;

public class HedgesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        /* COLOR TINTED HEDGES */
        // Default Color
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
            if (view == null || pos == null) {
                return FoliageColors.DEFAULT;
            }
            return BiomeColors.getFoliageColor(view, pos);
        }, ModBlocks.OAK_HEDGE, ModBlocks.ACACIA_HEDGE, ModBlocks.DARK_OAK_HEDGE, ModBlocks.PINE_HEDGE, ModBlocks.CITRUS_HEDGE, ModBlocks.FLOWERING_CITRUS_HEDGE, ModBlocks.KAPOK_HEDGE, ModBlocks.CACAO_HEDGE, ModBlocks.GREEN_MAPLE_HEDGE, ModBlocks.MIXED_MAPLE_HEDGE);
        // Spruce
//        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.SPRUCE, ModBlocks.SPRUCE_HEDGE);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.SPRUCE, ModBlocks.SPRUCE_HEDGE_FALLING_NEEDLES);
        // Birch
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.BIRCH, ModBlocks.BIRCH_HEDGE);
//        // Jungle
//        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
//            if (view == null || pos == null) {
//                return FoliageColors.DEFAULT;
//            }
//            return BiomeColors.getFoliageColor(view, pos);
//        }, ModBlocks.JUNGLE_HEDGE);

        // Mangrove
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
            if (view == null || pos == null) {
                return FoliageColors.MANGROVE;
            }
            return BiomeColors.getFoliageColor(view, pos);
        }, ModBlocks.MANGROVE_HEDGE, ModBlocks.WILLOW_HEDGE);

        // Baobab
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> ColorHelper.getArgb(109, 115, 33), ModBlocks.BAOBAB_HEDGE);

        /* REGISTER PARTICLES */
        ParticleFactoryRegistry.getInstance().register(ModParticles.DOGWOOD_LEAVES, DogwoodLeavesFactory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.GREEN_MAPLE_LEAVES, LeavesParticle.TintedLeavesFactory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.RED_MAPLE_LEAVES, LeavesParticle.CherryLeavesFactory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.YELLOW_MAPLE_LEAVES, LeavesParticle.CherryLeavesFactory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.PINE_NEEDLES, TintedNeedlesFactory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SPRUCE_NEEDLES, TintedNeedlesFactory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SNOWY_PINE_NEEDLES, UntintedNeedlesFactory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SNOWY_SPRUCE_NEEDLES, UntintedNeedlesFactory::new);

    }
}
