package bluesteel42.hedges.datagen;

import bluesteel42.hedges.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.OAK_HEDGE);
        addDrop(ModBlocks.GREEN_MAPLE_HEDGE);
        addDrop(ModBlocks.YELLOW_MAPLE_HEDGE);
        addDrop(ModBlocks.RED_MAPLE_HEDGE);
        addDrop(ModBlocks.MIXED_MAPLE_HEDGE);
//                    addDrop(ModBlocks.SPRUCE_HEDGE);
        addDrop(ModBlocks.SPRUCE_HEDGE_FALLING_NEEDLES);
        addDrop(ModBlocks.SNOWY_SPRUCE_HEDGE);
        addDrop(ModBlocks.PINE_HEDGE);
        addDrop(ModBlocks.SNOWY_PINE_HEDGE);
        addDrop(ModBlocks.BIRCH_HEDGE);
        addDrop(ModBlocks.KAPOK_HEDGE);
//                    addDrop(ModBlocks.JUNGLE_HEDGE);
        addDrop(ModBlocks.CACAO_HEDGE);
        addDrop(ModBlocks.CITRUS_HEDGE);
        addDrop(ModBlocks.FLOWERING_CITRUS_HEDGE);
        addDrop(ModBlocks.ACACIA_HEDGE);
        addDrop(ModBlocks.BAOBAB_HEDGE);
        addDrop(ModBlocks.DARK_OAK_HEDGE);
        addDrop(ModBlocks.WILLOW_HEDGE);
        addDrop(ModBlocks.DOGWOOD_HEDGE);
        addDrop(ModBlocks.MANGROVE_HEDGE);
        addDrop(ModBlocks.CHERRY_HEDGE);
        addDrop(ModBlocks.PALE_OAK_HEDGE);
        addDrop(ModBlocks.AZALEA_HEDGE);
        addDrop(ModBlocks.FLOWERING_AZALEA_HEDGE);

    }
}
