package bluesteel42.hedges.datagen;

import bluesteel42.hedges.block.ModBlocks;
import bluesteel42.hedges.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.OAK_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.GREEN_MAPLE_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.YELLOW_MAPLE_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.RED_MAPLE_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.MIXED_MAPLE_HEDGE.asItem());
//        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.SPRUCE_HEDGE.asItem();
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.SPRUCE_HEDGE_FALLING_NEEDLES.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.SNOWY_SPRUCE_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.PINE_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.SNOWY_PINE_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.BIRCH_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.KAPOK_HEDGE.asItem());
//        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.JUNGLE_HEDGE.asItem();
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.CACAO_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.CITRUS_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.FLOWERING_CITRUS_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.ACACIA_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.BAOBAB_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.DARK_OAK_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.WILLOW_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.DOGWOOD_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.MANGROVE_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.CHERRY_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.PALE_OAK_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.AZALEA_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.FLOWERING_AZALEA_HEDGE.asItem());

        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.AZALEA_HEDGE.asItem());
        valueLookupBuilder(ModTags.Items.HEDGES).add(ModBlocks.FLOWERING_AZALEA_HEDGE.asItem());

        valueLookupBuilder(ItemTags.BEE_FOOD).add(ModBlocks.CHERRY_HEDGE.asItem());
        valueLookupBuilder(ItemTags.FLOWERS).add(ModBlocks.CHERRY_HEDGE.asItem());

        valueLookupBuilder(ItemTags.BEE_FOOD).add(ModBlocks.DOGWOOD_HEDGE.asItem());
        valueLookupBuilder(ItemTags.FLOWERS).add(ModBlocks.DOGWOOD_HEDGE.asItem());

        valueLookupBuilder(ItemTags.BEE_FOOD).add(ModBlocks.FLOWERING_CITRUS_HEDGE.asItem());
        valueLookupBuilder(ItemTags.FLOWERS).add(ModBlocks.FLOWERING_CITRUS_HEDGE.asItem());

        valueLookupBuilder(ItemTags.BEE_FOOD).add(ModBlocks.FLOWERING_AZALEA_HEDGE.asItem());
        valueLookupBuilder(ItemTags.FLOWERS).add(ModBlocks.FLOWERING_AZALEA_HEDGE.asItem());
    }
}
