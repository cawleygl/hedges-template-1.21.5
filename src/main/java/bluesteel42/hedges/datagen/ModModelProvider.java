package bluesteel42.hedges.datagen;

import bluesteel42.hedges.Hedges;
import bluesteel42.hedges.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.client.render.item.tint.TintSource;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.world.biome.FoliageColors;

import java.util.Optional;

import static net.minecraft.client.data.TextureMap.getId;
import static net.minecraft.client.data.TextureMap.getSubId;
import static net.minecraft.client.data.TexturedModel.makeFactory;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }
    private static final Model TEMPLATE_HEDGE_POST = hedgesBlock("template_hedge_post", "_post", TextureKey.WALL);
    private static final Model TEMPLATE_HEDGE_SIDE = hedgesBlock("template_hedge_side", "_side", TextureKey.WALL);
    private static final Model TEMPLATE_HEDGE_SIDE_TALL = hedgesBlock("template_hedge_side_tall", "_side_tall", TextureKey.WALL);
    private static final Model HEDGE_INVENTORY = hedgesBlock("template_hedge_inventory", "_inventory", TextureKey.WALL);

    private void registerTintedHedge(BlockStateModelGenerator blockStateModelGenerator, Block hedge, TextureMap textures, int tint) {
        WeightedVariant weightedVariant = BlockStateModelGenerator.createWeightedVariant(
                TEMPLATE_HEDGE_POST.upload(hedge, textures, blockStateModelGenerator.modelCollector)
        );
        WeightedVariant weightedVariant2 = BlockStateModelGenerator.createWeightedVariant(
                TEMPLATE_HEDGE_SIDE.upload(hedge, textures, blockStateModelGenerator.modelCollector)
        );
        WeightedVariant weightedVariant3 = BlockStateModelGenerator.createWeightedVariant(
                TEMPLATE_HEDGE_SIDE_TALL.upload(hedge, textures, blockStateModelGenerator.modelCollector)
        );
        blockStateModelGenerator.blockStateCollector
                .accept(BlockStateModelGenerator.createWallBlockState(hedge, weightedVariant, weightedVariant2, weightedVariant3));
        Identifier identifier = HEDGE_INVENTORY.upload(hedge, textures, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerTintedItemModel(hedge, identifier, ItemModels.constantTintSource(tint));
    }

    private void registerUntintedHedge(BlockStateModelGenerator blockStateModelGenerator, Block hedge, TextureMap textures) {
        WeightedVariant weightedVariant = BlockStateModelGenerator.createWeightedVariant(
                TEMPLATE_HEDGE_POST.upload(hedge, textures, blockStateModelGenerator.modelCollector)
        );
        WeightedVariant weightedVariant2 = BlockStateModelGenerator.createWeightedVariant(
                TEMPLATE_HEDGE_SIDE.upload(hedge, textures, blockStateModelGenerator.modelCollector)
        );
        WeightedVariant weightedVariant3 = BlockStateModelGenerator.createWeightedVariant(
                TEMPLATE_HEDGE_SIDE_TALL.upload(hedge, textures, blockStateModelGenerator.modelCollector)
        );
        blockStateModelGenerator.blockStateCollector
                .accept(BlockStateModelGenerator.createWallBlockState(hedge, weightedVariant, weightedVariant2, weightedVariant3));
        Identifier identifier = HEDGE_INVENTORY.upload(hedge, textures, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerParentedItemModel(hedge, identifier);
    }

    private static final TextureKey OVERLAY = TextureKey.of("overlay");
    private static final Model TEMPLATE_HEDGE_POST_WITH_OVERLAY = hedgesBlock("template_hedge_post_overlay", "_post", TextureKey.WALL, OVERLAY);
    private static final Model TEMPLATE_HEDGE_SIDE_WITH_OVERLAY = hedgesBlock("template_hedge_side_overlay", "_side", TextureKey.WALL, OVERLAY);
    private static final Model TEMPLATE_HEDGE_SIDE_TALL_WITH_OVERLAY = hedgesBlock("template_hedge_side_tall_overlay", "_side_tall", TextureKey.WALL, OVERLAY);
    private static final Model HEDGE_INVENTORY_WITH_OVERLAY = hedgesBlock("template_hedge_inventory_overlay", "_inventory", TextureKey.WALL, OVERLAY);
    private void registerTintedHedgeWithOverlay(BlockStateModelGenerator blockStateModelGenerator, Block hedge, TextureMap textures, int tint) {
        WeightedVariant weightedVariant = BlockStateModelGenerator.createWeightedVariant(
                TEMPLATE_HEDGE_POST_WITH_OVERLAY.upload(hedge, textures, blockStateModelGenerator.modelCollector)
        );
        WeightedVariant weightedVariant2 = BlockStateModelGenerator.createWeightedVariant(
                TEMPLATE_HEDGE_SIDE_WITH_OVERLAY.upload(hedge, textures, blockStateModelGenerator.modelCollector)
        );
        WeightedVariant weightedVariant3 = BlockStateModelGenerator.createWeightedVariant(
                TEMPLATE_HEDGE_SIDE_TALL_WITH_OVERLAY.upload(hedge, textures, blockStateModelGenerator.modelCollector)
        );
        blockStateModelGenerator.blockStateCollector
                .accept(BlockStateModelGenerator.createWallBlockState(hedge, weightedVariant, weightedVariant2, weightedVariant3));
        Identifier identifier = HEDGE_INVENTORY_WITH_OVERLAY.upload(hedge, textures, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerTintedItemModel(hedge, identifier, ItemModels.constantTintSource(tint));
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        registerTintedHedge(blockStateModelGenerator, ModBlocks.OAK_HEDGE, new TextureMap().put(TextureKey.WALL, getId(Blocks.OAK_LEAVES)), FoliageColors.DEFAULT);
//        registerTintedHedge(blockStateModelGenerator, ModBlocks.SPRUCE_HEDGE, new TextureMap().put(TextureKey.WALL, getId(Blocks.SPRUCE_LEAVES)), FoliageColors.SPRUCE);
        registerTintedHedge(blockStateModelGenerator, ModBlocks.BIRCH_HEDGE, new TextureMap().put(TextureKey.WALL, getId(Blocks.BIRCH_LEAVES)), FoliageColors.BIRCH);
//        registerTintedHedge(blockStateModelGenerator, ModBlocks.JUNGLE_HEDGE, new TextureMap().put(TextureKey.WALL, getId(Blocks.JUNGLE_LEAVES)), FoliageColors.DEFAULT);
        registerTintedHedge(blockStateModelGenerator, ModBlocks.ACACIA_HEDGE, new TextureMap().put(TextureKey.WALL, getId(Blocks.ACACIA_LEAVES)), FoliageColors.DEFAULT);
        registerTintedHedge(blockStateModelGenerator, ModBlocks.DARK_OAK_HEDGE, new TextureMap().put(TextureKey.WALL, getId(Blocks.DARK_OAK_LEAVES)), FoliageColors.DEFAULT);
        registerTintedHedge(blockStateModelGenerator, ModBlocks.MANGROVE_HEDGE, new TextureMap().put(TextureKey.WALL, getId(Blocks.MANGROVE_LEAVES)), FoliageColors.MANGROVE);
        registerUntintedHedge(blockStateModelGenerator, ModBlocks.CHERRY_HEDGE, new TextureMap().put(TextureKey.WALL, getId(Blocks.CHERRY_LEAVES)));
        registerUntintedHedge(blockStateModelGenerator, ModBlocks.PALE_OAK_HEDGE, new TextureMap().put(TextureKey.WALL, getId(Blocks.PALE_OAK_LEAVES)));
        registerUntintedHedge(blockStateModelGenerator, ModBlocks.AZALEA_HEDGE, new TextureMap().put(TextureKey.WALL, getId(Blocks.AZALEA_LEAVES)));
        registerUntintedHedge(blockStateModelGenerator, ModBlocks.FLOWERING_AZALEA_HEDGE, new TextureMap().put(TextureKey.WALL, getId(Blocks.FLOWERING_AZALEA_LEAVES)));

        String combinedWorldgenID = "combined-worldgen";
        String blockPath = "block/";
        registerTintedHedge(blockStateModelGenerator, ModBlocks.BAOBAB_HEDGE, new TextureMap().put(TextureKey.WALL, Identifier.of(combinedWorldgenID, blockPath + "baobab_leaves")), ColorHelper.getArgb(109, 115, 33));
        registerTintedHedge(blockStateModelGenerator, ModBlocks.CITRUS_HEDGE, new TextureMap().put(TextureKey.WALL, Identifier.of(combinedWorldgenID, blockPath + "citrus_leaves")), FoliageColors.DEFAULT);
        registerUntintedHedge(blockStateModelGenerator, ModBlocks.DOGWOOD_HEDGE, new TextureMap().put(TextureKey.WALL, Identifier.of(combinedWorldgenID, blockPath + "dogwood_leaves")));
        registerTintedHedge(blockStateModelGenerator, ModBlocks.KAPOK_HEDGE, new TextureMap().put(TextureKey.WALL, Identifier.of(combinedWorldgenID, blockPath + "kapok_leaves")), FoliageColors.DEFAULT);
        registerTintedHedge(blockStateModelGenerator, ModBlocks.CACAO_HEDGE, new TextureMap().put(TextureKey.WALL, Identifier.of(combinedWorldgenID, blockPath + "cacao_leaves")), FoliageColors.DEFAULT);
        registerTintedHedge(blockStateModelGenerator, ModBlocks.GREEN_MAPLE_HEDGE, new TextureMap().put(TextureKey.WALL, Identifier.of(combinedWorldgenID, blockPath + "maple_leaves")), FoliageColors.DEFAULT);
        registerUntintedHedge(blockStateModelGenerator, ModBlocks.YELLOW_MAPLE_HEDGE, new TextureMap().put(TextureKey.WALL, Identifier.of(combinedWorldgenID, blockPath + "yellow_maple_leaves")));
        registerUntintedHedge(blockStateModelGenerator, ModBlocks.RED_MAPLE_HEDGE, new TextureMap().put(TextureKey.WALL, Identifier.of(combinedWorldgenID, blockPath + "red_maple_leaves")));
        registerTintedHedge(blockStateModelGenerator, ModBlocks.PINE_HEDGE, new TextureMap().put(TextureKey.WALL, Identifier.of(combinedWorldgenID, blockPath + "pine_leaves")), FoliageColors.DEFAULT);
        registerUntintedHedge(blockStateModelGenerator, ModBlocks.SNOWY_PINE_HEDGE, new TextureMap().put(TextureKey.WALL, Identifier.of(combinedWorldgenID, blockPath + "snowy_pine_leaves")));
        registerTintedHedge(blockStateModelGenerator, ModBlocks.SPRUCE_HEDGE_FALLING_NEEDLES, new TextureMap().put(TextureKey.WALL, Identifier.of(combinedWorldgenID, blockPath + "spruce_leaves")), FoliageColors.SPRUCE);
        registerUntintedHedge(blockStateModelGenerator, ModBlocks.SNOWY_SPRUCE_HEDGE, new TextureMap().put(TextureKey.WALL, Identifier.of(combinedWorldgenID, blockPath + "snowy_spruce_leaves")));
        registerTintedHedge(blockStateModelGenerator, ModBlocks.WILLOW_HEDGE, new TextureMap().put(TextureKey.WALL, Identifier.of(combinedWorldgenID, blockPath + "willow_leaves")), FoliageColors.MANGROVE);

        registerTintedHedgeWithOverlay(blockStateModelGenerator, ModBlocks.MIXED_MAPLE_HEDGE, new TextureMap().put(TextureKey.WALL, Identifier.of(combinedWorldgenID, blockPath + "maple_leaves")).put(OVERLAY, Identifier.of(combinedWorldgenID, blockPath + "mixed_maple_leaves_overlay")), FoliageColors.DEFAULT);
        registerTintedHedgeWithOverlay(blockStateModelGenerator, ModBlocks.FLOWERING_CITRUS_HEDGE, new TextureMap().put(TextureKey.WALL, Identifier.of(combinedWorldgenID, blockPath + "citrus_leaves")).put(OVERLAY, Identifier.of(combinedWorldgenID, blockPath + "flowering_orange_leaves_overlay_0")), FoliageColors.DEFAULT);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {}

    private static Model hedgesBlock(String parent, String variant, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(Hedges.MOD_ID, "block/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
}
