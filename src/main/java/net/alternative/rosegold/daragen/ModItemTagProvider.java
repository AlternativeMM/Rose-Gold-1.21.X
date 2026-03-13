package net.alternative.rosegold.daragen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.alternative.rosegold.item.ModItems;
import net.alternative.rosegold.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.ROSE_GOLD_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.ROSE_GOLD_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.ROSE_GOLD_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.ROSE_GOLD_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.ROSE_GOLD_HOE);


        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ROSE_GOLD_HELMET)
                .add(ModItems.ROSE_GOLD_CHESTPLATE)
                .add(ModItems.ROSE_GOLD_LEGGINGS)
                .add(ModItems.ROSE_GOLD_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.ROSE_GOLD_INGOT);

        getOrCreateTagBuilder(ModTags.Items.ROSE_GOLD_REPAIR)
                .add(ModItems.ROSE_GOLD_INGOT);
    }
}
