package net.alternative.rosegold.daragen;

import net.alternative.rosegold.RoseGold;
import net.alternative.rosegold.block.ModBlocks;
import net.alternative.rosegold.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.util.Identifier;

public class ModModelTagProvider extends FabricModelProvider {
    public ModModelTagProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROSE_GOLD_BLOCK);
    }




    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ROSE_GOLD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.ROSE_GOLD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROSE_GOLD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROSE_GOLD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROSE_GOLD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROSE_GOLD_HOE, Models.HANDHELD);


        itemModelGenerator.registerArmor(ModItems.ROSE_GOLD_HELMET, Identifier.of(RoseGold.MOD_ID, "rose_gold"),
                EquipmentModel.builder().addHumanoidLayers(Identifier.of(RoseGold.MOD_ID, "rose_gold")).build(), EquipmentSlot.HEAD);
        itemModelGenerator.registerArmor(ModItems.ROSE_GOLD_CHESTPLATE, Identifier.of(RoseGold.MOD_ID, "rose_gold"),
                EquipmentModel.builder().addHumanoidLayers(Identifier.of(RoseGold.MOD_ID, "rose_gold")).build(), EquipmentSlot.BODY);
        itemModelGenerator.registerArmor(ModItems.ROSE_GOLD_LEGGINGS, Identifier.of(RoseGold.MOD_ID, "rose_gold"),
                EquipmentModel.builder().addHumanoidLayers(Identifier.of(RoseGold.MOD_ID, "rose_gold")).build(), EquipmentSlot.LEGS);
        itemModelGenerator.registerArmor(ModItems.ROSE_GOLD_BOOTS, Identifier.of(RoseGold.MOD_ID, "rose_gold"),
                EquipmentModel.builder().addHumanoidLayers(Identifier.of(RoseGold.MOD_ID, "rose_gold")).build(), EquipmentSlot.FEET);

        itemModelGenerator.register(ModItems.ROSE_GOLD_HORSE_ARMOR, Models.GENERATED);
    }
}
