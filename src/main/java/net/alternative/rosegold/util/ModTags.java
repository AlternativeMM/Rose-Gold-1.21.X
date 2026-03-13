package net.alternative.rosegold.util;

import net.alternative.rosegold.RoseGold;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> NEEDS_ROSE_GOLD_TOOL = createTag("needs_rose_gold_tool");
        public static final TagKey<Block> INCORRECT_FOR_ROSE_GOLD_TOOL = createTag("incorrect_for_rose_gold_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(RoseGold.MOD_ID, name));
        }
    }

    public static  class Items {
        public static final TagKey<Item> ROSE_GOLD_REPAIR = createTag("rose_gold_repair");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, name));
        }
    }



}
