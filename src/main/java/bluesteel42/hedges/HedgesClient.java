package bluesteel42.hedges;

import bluesteel42.hedges.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
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

    }
}
