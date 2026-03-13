package net.alternative.rosegold.item;

import net.alternative.rosegold.RoseGold;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.security.PublicKey;

public class ModItems {
    public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_ingot")))));
    public static final Item ROSE_GOLD_NUGGET = registerItem("rose_gold_nugget", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_nugget")))));

    public static final Item ROSE_GOLD_SWORD = registerItem("rose_gold_sword",
            new SwordItem(ModToolMaterials.ROSE_GOLD, 3, -2.4f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_sword")))));

    public static final Item ROSE_GOLD_PICKAXE = registerItem("rose_gold_pickaxe",
            new PickaxeItem(ModToolMaterials.ROSE_GOLD, 1, -2.8f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_pickaxe")))));

    public static final Item ROSE_GOLD_SHOVEL = registerItem("rose_gold_shovel",
            new ShovelItem(ModToolMaterials.ROSE_GOLD, 1.5f, -3.0f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_shovel")))));

    public static final Item ROSE_GOLD_AXE = registerItem("rose_gold_axe",
            new AxeItem(ModToolMaterials.ROSE_GOLD, 6, -3.2f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_axe")))));

    public static final Item ROSE_GOLD_HOE = registerItem("rose_gold_hoe",
            new HoeItem(ModToolMaterials.ROSE_GOLD, 0, -3f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_hoe")))));

    public static final Item ROSE_GOLD_HELMET = registerItem("rose_gold_helmet",
            new ArmorItem(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, EquipmentType.HELMET, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_helmet")))));
    public static final Item ROSE_GOLD_CHESTPLATE = registerItem("rose_gold_chestplate",
            new ArmorItem(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, EquipmentType.CHESTPLATE, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_chestplate")))));
    public static final Item ROSE_GOLD_LEGGINGS = registerItem("rose_gold_leggings",
            new ArmorItem(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, EquipmentType.LEGGINGS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_leggings")))));
    public static final Item ROSE_GOLD_BOOTS = registerItem("rose_gold_boots",
            new ArmorItem(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, EquipmentType.BOOTS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_boots")))));
    public static final Item ROSE_GOLD_HORSE_ARMOR = registerItem("rose_gold_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_horse_armor"))).maxCount(1)));







    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RoseGold.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RoseGold.LOGGER.info("Registering ModItems for" + RoseGold.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
        //    entries.add(ROSE_GOLD_INGOT);
        //    entries.add(ROSE_GOLD_NUGGET);
        //});
    }
}