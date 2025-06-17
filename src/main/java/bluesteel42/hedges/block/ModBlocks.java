package bluesteel42.hedges.block;

import bluesteel42.hedges.Hedges;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.particle.EntityEffectParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static final Block OAK_HEDGE = register("oak_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), AbstractBlock.Settings.copy(Blocks.OAK_LEAVES), true, true);
    public static final Block SPRUCE_HEDGE = register("spruce_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), AbstractBlock.Settings.copy(Blocks.SPRUCE_LEAVES), true, true);
    public static final Block BIRCH_HEDGE = register("birch_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), AbstractBlock.Settings.copy(Blocks.BIRCH_LEAVES), true, true);
    public static final Block JUNGLE_HEDGE = register("jungle_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), AbstractBlock.Settings.copy(Blocks.JUNGLE_LEAVES), true, true);
    public static final Block ACACIA_HEDGE = register("acacia_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), AbstractBlock.Settings.copy(Blocks.ACACIA_LEAVES), true, true);
    public static final Block DARK_OAK_HEDGE = register("dark_oak_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), AbstractBlock.Settings.copy(Blocks.DARK_OAK_LEAVES), true, true);
    public static final Block MANGROVE_HEDGE = register("mangrove_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_LEAVES), true, true);
    public static final Block CHERRY_HEDGE = register("cherry_hedge", settings -> new UntintedParticleHedgeBlock(0.1F, ParticleTypes.CHERRY_LEAVES, settings), AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES), true, true);
    public static final Block PALE_OAK_HEDGE = register("pale_oak_hedge", settings -> new UntintedParticleHedgeBlock(0.02F, ParticleTypes.PALE_OAK_LEAVES, settings), AbstractBlock.Settings.copy(Blocks.PALE_OAK_LEAVES), true, true);
    public static final Block AZALEA_HEDGE = register("azalea_hedge", settings -> new UntintedParticleHedgeBlock(0.01F, EntityEffectParticleEffect.create(ParticleTypes.TINTED_LEAVES, -9399763), settings), AbstractBlock.Settings.copy(Blocks.AZALEA_LEAVES), true, true);
    public static final Block FLOWERING_AZALEA_HEDGE = register("flowering_azalea_hedge", settings -> new UntintedParticleHedgeBlock(0.01F, EntityEffectParticleEffect.create(ParticleTypes.TINTED_LEAVES, -9399763), settings), AbstractBlock.Settings.copy(Blocks.FLOWERING_AZALEA_LEAVES), true, true);
    public static final Block SWAMP_HEDGE = register("swamp_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true);
    public static final Block PINE_HEDGE = register("pine_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true);

    private static Block register(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings, boolean registerItem, boolean nonOpaqueBlock) {
        final Identifier identifier = Identifier.of(Hedges.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);

        if (registerItem) {
            Items.register(block);
        }

        if (nonOpaqueBlock) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
        }

        return block;
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> {
                    itemGroup.addBefore(Items.STONE, ModBlocks.OAK_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.SPRUCE_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.BIRCH_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.JUNGLE_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.ACACIA_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.DARK_OAK_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.MANGROVE_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.CHERRY_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.PALE_OAK_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.SWAMP_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.PINE_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.AZALEA_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.FLOWERING_AZALEA_HEDGE);
                });
    }
}
