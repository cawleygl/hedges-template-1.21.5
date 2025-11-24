package bluesteel42.hedges.datagen;

import bluesteel42.hedges.Hedges;
import bluesteel42.hedges.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            private void generateHedgeRecipe(ItemConvertible hedge, ItemConvertible leaves) {
                createShaped(RecipeCategory.MISC, hedge, 3)
                        .pattern("W#W")
                        .pattern("W#W")
                        .group("hedge")
                        .input('#', Items.STICK)
                        .input('W', leaves)
                        .criterion(hasItem(leaves), conditionsFromItem(leaves))
                        .offerTo(exporter);
            }

            @Override
            public void generate() {
                generateHedgeRecipe(ModBlocks.OAK_HEDGE, Blocks.OAK_LEAVES);
//                generateHedgeRecipe(ModBlocks.SPRUCE_HEDGE, Blocks.SPRUCE_LEAVES);
                generateHedgeRecipe(ModBlocks.BIRCH_HEDGE, Blocks.BIRCH_LEAVES);
//                generateHedgeRecipe(ModBlocks.JUNGLE_HEDGE, Blocks.JUNGLE_LEAVES);
                generateHedgeRecipe(ModBlocks.ACACIA_HEDGE, Blocks.ACACIA_LEAVES);
                generateHedgeRecipe(ModBlocks.DARK_OAK_HEDGE, Blocks.DARK_OAK_LEAVES);
                generateHedgeRecipe(ModBlocks.MANGROVE_HEDGE, Blocks.MANGROVE_LEAVES);
                generateHedgeRecipe(ModBlocks.CHERRY_HEDGE, Blocks.CHERRY_LEAVES);
                generateHedgeRecipe(ModBlocks.PALE_OAK_HEDGE, Blocks.PALE_OAK_LEAVES);
                generateHedgeRecipe(ModBlocks.AZALEA_HEDGE, Blocks.AZALEA_LEAVES);
                generateHedgeRecipe(ModBlocks.FLOWERING_AZALEA_HEDGE, Blocks.FLOWERING_AZALEA_LEAVES);

//                generateHedgeRecipe(ModBlocks.SPRUCE_HEDGE_FALLING_NEEDLES, Blocks.OAK_LEAVES);
//                generateHedgeRecipe(ModBlocks.GREEN_MAPLE_HEDGE, Blocks.OAK_LEAVES);
//                generateHedgeRecipe(ModBlocks.YELLOW_MAPLE_HEDGE, Blocks.OAK_LEAVES);
//                generateHedgeRecipe(ModBlocks.RED_MAPLE_HEDGE, Blocks.OAK_LEAVES);
//                generateHedgeRecipe(ModBlocks.MIXED_MAPLE_HEDGE, Blocks.OAK_LEAVES);
//                generateHedgeRecipe(ModBlocks.SNOWY_SPRUCE_HEDGE, Blocks.OAK_LEAVES);
//                generateHedgeRecipe(ModBlocks.PINE_HEDGE, Blocks.OAK_LEAVES);
//                generateHedgeRecipe(ModBlocks.SNOWY_PINE_HEDGE, Blocks.OAK_LEAVES);
//                generateHedgeRecipe(ModBlocks.KAPOK_HEDGE, Blocks.OAK_LEAVES);
//                generateHedgeRecipe(ModBlocks.CACAO_HEDGE, Blocks.OAK_LEAVES);
//                generateHedgeRecipe(ModBlocks.CITRUS_HEDGE, Blocks.OAK_LEAVES);
//                generateHedgeRecipe(ModBlocks.FLOWERING_CITRUS_HEDGE, Blocks.OAK_LEAVES);
//                generateHedgeRecipe(ModBlocks.BAOBAB_HEDGE, Blocks.OAK_LEAVES);
//                generateHedgeRecipe(ModBlocks.WILLOW_HEDGE, Blocks.OAK_LEAVES);
//                generateHedgeRecipe(ModBlocks.DOGWOOD_HEDGE, Blocks.OAK_LEAVES);
            }
        };
    }

    @Override
    public String getName() {
        return Hedges.MOD_ID + " recipes";
    }
}
