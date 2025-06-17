package bluesteel42.hedges.util;

import bluesteel42.hedges.Hedges;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> HEDGES = createTag("hedges");

        public static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Hedges.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> HEDGES = createTag("hedges");

        public static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Hedges.MOD_ID, name));
        }
    }
}
