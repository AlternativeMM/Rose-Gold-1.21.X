package net.alternative.rosegold.daragen;


import net.alternative.rosegold.block.ModBlocks;
import net.alternative.rosegold.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ROSE_GOLD_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ROSE_GOLD_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks. NEEDS_ROSE_GOLD_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
    }
}
