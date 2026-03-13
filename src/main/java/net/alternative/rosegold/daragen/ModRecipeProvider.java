package net.alternative.rosegold.daragen;

import net.alternative.rosegold.RoseGold;
import net.alternative.rosegold.block.ModBlocks;
import net.alternative.rosegold.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModItems.ROSE_GOLD_NUGGET)
                        .criterion(hasItem(ModItems.ROSE_GOLD_NUGGET), conditionsFromItem(ModItems.ROSE_GOLD_NUGGET))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(RoseGold.MOD_ID,"rose_gold_ingot_from_nugget")));

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_GOLD_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModItems.ROSE_GOLD_INGOT)
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT, 9)
                        .input(ModBlocks.ROSE_GOLD_BLOCK)
                        .criterion(hasItem(ModBlocks.ROSE_GOLD_BLOCK), conditionsFromItem(ModBlocks.ROSE_GOLD_BLOCK))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(RoseGold.MOD_ID, "rose_gold_ingot_from_block")));
                createShapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_NUGGET, 9)
                        .input(ModItems.ROSE_GOLD_INGOT)
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT)
                        .input(Items.GOLD_INGOT)
                        .input(Items.COPPER_INGOT)
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(RoseGold.MOD_ID, "rose_gold_ingot_alloy")));


                createShaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_SWORD)
                        .pattern(" R ")
                        .pattern(" R ")
                        .pattern(" S ")
                        .input('R', ModItems.ROSE_GOLD_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_PICKAXE)
                        .pattern("RRR")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('R', ModItems.ROSE_GOLD_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_AXE)
                        .pattern("RR ")
                        .pattern("RS ")
                        .pattern(" S ")
                        .input('R', ModItems.ROSE_GOLD_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_SHOVEL)
                        .pattern(" R ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('R', ModItems.ROSE_GOLD_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_HOE)
                        .pattern("RR ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('R', ModItems.ROSE_GOLD_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Rose Gold Recipes";
    }
}
