package net.alternative.rosegold.item;

import net.alternative.rosegold.RoseGold;
import net.alternative.rosegold.util.ModTags;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;

public class ModArmorMaterials {
    public static final ArmorMaterial ROSE_GOLD_ARMOR_MATERIAL = new ArmorMaterial(500,Util.make(new EnumMap<>(EquipmentType.class), map -> {
                map.put(EquipmentType.BOOTS, 2);
                map.put(EquipmentType.LEGGINGS, 4);
                map.put(EquipmentType.CHESTPLATE, 6);
                map.put(EquipmentType.HELMET, 2);
                map.put(EquipmentType.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0, 0, ModTags.Items.ROSE_GOLD_REPAIR,
                    Identifier.of(RoseGold.MOD_ID, "rose_gold"));

}
