package bluesteel42.hedges.block;

import bluesteel42.hedges.Hedges;
import bluesteel42.hedges.particle.ModParticles;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.TintedParticleEffect;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static final Block OAK_HEDGE = register("oak_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), AbstractBlock.Settings.copy(Blocks.OAK_LEAVES), true, true);
//    public static final Block SPRUCE_HEDGE = register("spruce_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), AbstractBlock.Settings.copy(Blocks.SPRUCE_LEAVES), true, true);
    public static final Block BIRCH_HEDGE = register("birch_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), AbstractBlock.Settings.copy(Blocks.BIRCH_LEAVES), true, true);
//    public static final Block JUNGLE_HEDGE = register("jungle_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), AbstractBlock.Settings.copy(Blocks.JUNGLE_LEAVES), true, true);
    public static final Block ACACIA_HEDGE = register("acacia_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), AbstractBlock.Settings.copy(Blocks.ACACIA_LEAVES), true, true);
    public static final Block DARK_OAK_HEDGE = register("dark_oak_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), AbstractBlock.Settings.copy(Blocks.DARK_OAK_LEAVES), true, true);
    public static final Block MANGROVE_HEDGE = register("mangrove_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_LEAVES), true, true);
    public static final Block CHERRY_HEDGE = register("cherry_hedge", settings -> new UntintedParticleHedgeBlock(0.1F, ParticleTypes.CHERRY_LEAVES, settings), AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES), true, true);
    public static final Block PALE_OAK_HEDGE = register("pale_oak_hedge", settings -> new UntintedParticleHedgeBlock(0.02F, ParticleTypes.PALE_OAK_LEAVES, settings), AbstractBlock.Settings.copy(Blocks.PALE_OAK_LEAVES), true, true);
    public static final Block AZALEA_HEDGE = register("azalea_hedge", settings -> new UntintedParticleHedgeBlock(0.01F, TintedParticleEffect.create(ParticleTypes.TINTED_LEAVES, -9399763), settings), AbstractBlock.Settings.copy(Blocks.AZALEA_LEAVES), true, true);
    public static final Block FLOWERING_AZALEA_HEDGE = register("flowering_azalea_hedge", settings -> new UntintedParticleHedgeBlock(0.01F, TintedParticleEffect.create(ParticleTypes.TINTED_LEAVES, -9399763), settings), AbstractBlock.Settings.copy(Blocks.FLOWERING_AZALEA_LEAVES), true, true);

    public static final Block BAOBAB_HEDGE = register("baobab_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true);
    public static final Block CITRUS_HEDGE = register("citrus_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true);
    public static final Block FLOWERING_CITRUS_HEDGE = register("flowering_citrus_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true);

    public static final Block DOGWOOD_HEDGE = register("dogwood_hedge", settings -> new UntintedParticleHedgeBlock(0.1F, ModParticles.DOGWOOD_LEAVES, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.CHERRY_LEAVES)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never), true, true);

    public static final Block KAPOK_HEDGE = register("kapok_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true);
    public static final Block CACAO_HEDGE = register("cacao_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true);
    public static final Block GREEN_MAPLE_HEDGE = register("green_maple_hedge", settings -> new TintedParticleMapleHedgeBlock(0.01F, settings), Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true);
    public static final Block YELLOW_MAPLE_HEDGE = register("yellow_maple_hedge", settings -> new UntintedParticleHedgeBlock(0.01F, ModParticles.YELLOW_MAPLE_LEAVES, settings), Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true);
    public static final Block RED_MAPLE_HEDGE = register("red_maple_hedge", settings -> new UntintedParticleHedgeBlock(0.01F, ModParticles.RED_MAPLE_LEAVES, settings), Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true);
    public static final Block MIXED_MAPLE_HEDGE = register("mixed_maple_hedge", settings -> new MixedParticleMapleHedgeBlock(0.01F, ModParticles.RED_MAPLE_LEAVES, ModParticles.YELLOW_MAPLE_LEAVES, settings), Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true);
    public static final Block PINE_HEDGE = register("pine_hedge", settings -> new TintedParticlePineNeedleHedgeBlock(0.01F, settings), Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true);
    public static final Block SNOWY_PINE_HEDGE = register("snowy_pine_hedge", settings -> new SnowyPineHedgeBlock(0.01F, ModParticles.SNOWY_PINE_NEEDLES, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never), true, true);
    public static final Block SPRUCE_HEDGE_FALLING_NEEDLES = register("spruce_hedge", settings -> new TintedParticleSpruceNeedleHedgeBlock(0.01F, settings), Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true);

    public static final Block SNOWY_SPRUCE_HEDGE = register("snowy_spruce_hedge", settings -> new SnowySpruceHedgeBlock(0.01F, ModParticles.SNOWY_SPRUCE_NEEDLES, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never), true, true);

    public static final Block WILLOW_HEDGE = register("willow_hedge", settings -> new TintedParticleHedgeBlock(0.01F, settings), Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true);

    private static Block register(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings, boolean registerItem, boolean nonOpaqueBlock) {
        final Identifier identifier = Identifier.of(Hedges.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);

        if (registerItem) {
            Items.register(block);
        }

        if (nonOpaqueBlock) {
            BlockRenderLayerMap.putBlock(block, BlockRenderLayer.CUTOUT);
        }

        return block;
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> {
                    itemGroup.addBefore(Items.STONE, ModBlocks.OAK_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.GREEN_MAPLE_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.YELLOW_MAPLE_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.RED_MAPLE_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.MIXED_MAPLE_HEDGE);
//                    itemGroup.addBefore(Items.STONE, ModBlocks.SPRUCE_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.SPRUCE_HEDGE_FALLING_NEEDLES);
                    itemGroup.addBefore(Items.STONE, ModBlocks.SNOWY_SPRUCE_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.PINE_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.SNOWY_PINE_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.BIRCH_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.KAPOK_HEDGE);
//                    itemGroup.addBefore(Items.STONE, ModBlocks.JUNGLE_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.CACAO_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.CITRUS_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.FLOWERING_CITRUS_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.ACACIA_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.BAOBAB_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.DARK_OAK_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.WILLOW_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.DOGWOOD_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.MANGROVE_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.CHERRY_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.PALE_OAK_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.AZALEA_HEDGE);
                    itemGroup.addBefore(Items.STONE, ModBlocks.FLOWERING_AZALEA_HEDGE);

                });
    }
}
