package net.alternative.rosegold.item;

import net.alternative.rosegold.RoseGold;
import net.alternative.rosegold.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ROSE_GOLD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RoseGold.MOD_ID, "rose_gold_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ROSE_GOLD_INGOT))
                    .displayName(Text.translatable("itemgroup.rosegold.rose_gold_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ROSE_GOLD_INGOT);
                        entries.add(ModItems.ROSE_GOLD_NUGGET);
                        entries.add(ModBlocks.ROSE_GOLD_BLOCK);

                        entries.add(ModItems.ROSE_GOLD_SWORD);
                        entries.add(ModItems.ROSE_GOLD_PICKAXE);
                        entries.add(ModItems.ROSE_GOLD_AXE);
                        entries.add(ModItems.ROSE_GOLD_SHOVEL);
                        entries.add(ModItems.ROSE_GOLD_HOE);

                        entries.add(ModItems.ROSE_GOLD_HELMET);
                        entries.add(ModItems.ROSE_GOLD_CHESTPLATE);
                        entries.add(ModItems.ROSE_GOLD_LEGGINGS);
                        entries.add(ModItems.ROSE_GOLD_BOOTS);
                        entries.add(ModItems.ROSE_GOLD_HORSE_ARMOR);
                    }).build());

    public static void registerItemGroup() {
        RoseGold.LOGGER.info("Registering Item Group for" + RoseGold.MOD_ID);
    }
}
