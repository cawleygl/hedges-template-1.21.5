package bluesteel42.hedges.datagen;

import bluesteel42.hedges.block.ModBlocks;
import bluesteel42.hedges.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.OAK_HEDGE);
        getOrCreateTagBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.SPRUCE_HEDGE);
        getOrCreateTagBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.BIRCH_HEDGE);
        getOrCreateTagBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.JUNGLE_HEDGE);
        getOrCreateTagBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.ACACIA_HEDGE);
        getOrCreateTagBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.DARK_OAK_HEDGE);
        getOrCreateTagBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.MANGROVE_HEDGE);
        getOrCreateTagBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.CHERRY_HEDGE);
        getOrCreateTagBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.PALE_OAK_HEDGE);
        getOrCreateTagBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.PINE_HEDGE);
        getOrCreateTagBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.SWAMP_HEDGE);
        getOrCreateTagBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.AZALEA_HEDGE);
        getOrCreateTagBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.FLOWERING_AZALEA_HEDGE);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE).addTag(ModTags.Blocks.HEDGES);
        getOrCreateTagBuilder(BlockTags.SWORD_EFFICIENT).addTag(ModTags.Blocks.HEDGES);

        getOrCreateTagBuilder(BlockTags.BEE_ATTRACTIVE).add(ModBlocks.CHERRY_HEDGE);
        getOrCreateTagBuilder(BlockTags.FLOWERS).add(ModBlocks.CHERRY_HEDGE);

        getOrCreateTagBuilder(BlockTags.BEE_ATTRACTIVE).add(ModBlocks.FLOWERING_AZALEA_HEDGE);
        getOrCreateTagBuilder(BlockTags.FLOWERS).add(ModBlocks.FLOWERING_AZALEA_HEDGE);
    }
}
