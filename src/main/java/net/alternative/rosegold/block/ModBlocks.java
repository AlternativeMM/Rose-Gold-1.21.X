package net.alternative.rosegold.block;

import net.alternative.rosegold.RoseGold;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RoseGold.MOD_ID, "rose_gold_block")))
                    .strength(3f).requiresTool().sounds(BlockSoundGroup.METAL)));






    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RoseGold.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(RoseGold.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        RoseGold.LOGGER.info("Registering ModBlocks for" + RoseGold.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
        //        entries.add(ModBlocks.ROSE_GOLD_BLOCK);
        //});
    }
}
