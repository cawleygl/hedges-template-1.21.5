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
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.OAK_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.GREEN_MAPLE_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.YELLOW_MAPLE_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.RED_MAPLE_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.MIXED_MAPLE_HEDGE);
//        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.SPRUCE_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.SPRUCE_HEDGE_FALLING_NEEDLES);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.SNOWY_SPRUCE_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.PINE_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.SNOWY_PINE_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.BIRCH_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.KAPOK_HEDGE);
//        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.JUNGLE_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.CACAO_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.CITRUS_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.FLOWERING_CITRUS_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.ACACIA_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.BAOBAB_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.DARK_OAK_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.WILLOW_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.DOGWOOD_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.MANGROVE_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.CHERRY_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.PALE_OAK_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.AZALEA_HEDGE);
        valueLookupBuilder(ModTags.Blocks.HEDGES).add(ModBlocks.FLOWERING_AZALEA_HEDGE);

        valueLookupBuilder(BlockTags.HOE_MINEABLE).addTag(ModTags.Blocks.HEDGES);
        valueLookupBuilder(BlockTags.SWORD_EFFICIENT).addTag(ModTags.Blocks.HEDGES);

        valueLookupBuilder(BlockTags.BEE_ATTRACTIVE).add(ModBlocks.CHERRY_HEDGE);
        valueLookupBuilder(BlockTags.FLOWERS).add(ModBlocks.CHERRY_HEDGE);

        valueLookupBuilder(BlockTags.BEE_ATTRACTIVE).add(ModBlocks.DOGWOOD_HEDGE);
        valueLookupBuilder(BlockTags.FLOWERS).add(ModBlocks.DOGWOOD_HEDGE);

        valueLookupBuilder(BlockTags.BEE_ATTRACTIVE).add(ModBlocks.FLOWERING_CITRUS_HEDGE);
        valueLookupBuilder(BlockTags.FLOWERS).add(ModBlocks.FLOWERING_CITRUS_HEDGE);

        valueLookupBuilder(BlockTags.BEE_ATTRACTIVE).add(ModBlocks.FLOWERING_AZALEA_HEDGE);
        valueLookupBuilder(BlockTags.FLOWERS).add(ModBlocks.FLOWERING_AZALEA_HEDGE);
    }
}
