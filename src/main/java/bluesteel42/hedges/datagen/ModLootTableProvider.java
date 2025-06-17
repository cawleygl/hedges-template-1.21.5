package bluesteel42.hedges.datagen;

import bluesteel42.hedges.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.OAK_HEDGE);
        addDrop(ModBlocks.SPRUCE_HEDGE);
        addDrop(ModBlocks.BIRCH_HEDGE);
        addDrop(ModBlocks.JUNGLE_HEDGE);
        addDrop(ModBlocks.ACACIA_HEDGE);
        addDrop(ModBlocks.DARK_OAK_HEDGE);
        addDrop(ModBlocks.MANGROVE_HEDGE);
        addDrop(ModBlocks.CHERRY_HEDGE);
        addDrop(ModBlocks.PALE_OAK_HEDGE);
        addDrop(ModBlocks.PINE_HEDGE);
        addDrop(ModBlocks.SWAMP_HEDGE);
        addDrop(ModBlocks.AZALEA_HEDGE);
        addDrop(ModBlocks.FLOWERING_AZALEA_HEDGE);
    }
}
