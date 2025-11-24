package bluesteel42.hedges.registries;

import bluesteel42.hedges.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.item.Items;

public class ModRegistries {
    public static void registerFlammables() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_MAPLE_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_MAPLE_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_MAPLE_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MIXED_MAPLE_HEDGE, 30, 60);
//        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_HEDGE_FALLING_NEEDLES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SNOWY_SPRUCE_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINE_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SNOWY_PINE_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.KAPOK_HEDGE, 30, 60);
//        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CACAO_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CITRUS_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FLOWERING_CITRUS_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAOBAB_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WILLOW_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DOGWOOD_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_OAK_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZALEA_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FLOWERING_AZALEA_HEDGE, 30, 60);
    }
}
