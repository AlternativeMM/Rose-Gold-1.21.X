package net.alternative.rosegold.daragen;

import net.alternative.rosegold.RoseGold;
import net.alternative.rosegold.block.ModBlocks;
import net.alternative.rosegold.item.ModArmorMaterials;
import net.alternative.rosegold.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
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


        itemModelGenerator.registerArmor((ModItems.ROSE_GOLD_HELMET), ModArmorMaterials.ROSE_GOLD_KEY, "helmet", false);
        itemModelGenerator.registerArmor((ModItems.ROSE_GOLD_CHESTPLATE), ModArmorMaterials.ROSE_GOLD_KEY, "chestplate", false);
        itemModelGenerator.registerArmor((ModItems.ROSE_GOLD_LEGGINGS), ModArmorMaterials.ROSE_GOLD_KEY, "leggings", false);
        itemModelGenerator.registerArmor((ModItems.ROSE_GOLD_BOOTS), ModArmorMaterials.ROSE_GOLD_KEY, "boots", false);


        itemModelGenerator.register(ModItems.ROSE_GOLD_HORSE_ARMOR, Models.GENERATED);
    }
}
