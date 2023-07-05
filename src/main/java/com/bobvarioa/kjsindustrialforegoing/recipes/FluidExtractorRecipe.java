package com.bobvarioa.kjsindustrialforegoing.recipes;

import com.bobvarioa.kjsindustrialforegoing.TitaniumComponents;
import dev.latvian.mods.kubejs.fluid.OutputFluid;
import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.BlockComponent;
import dev.latvian.mods.kubejs.recipe.component.BooleanComponent;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.level.block.Block;

public interface FluidExtractorRecipe {
    RecipeKey<InputItem> INPUT = ItemComponents.INPUT.key("input");
    RecipeKey<Block> RESULT = BlockComponent.OUTPUT.key("result");

    RecipeKey<Float> BREAK_CHANCE = NumberComponent.FLOAT.key("breakChance");

    RecipeKey<OutputFluid> OUTPUT = TitaniumComponents.OUTPUT_FLUID.key("output");

    RecipeKey<Boolean> DEFAULT_RECIPE = BooleanComponent.BOOLEAN.key("defaultRecipe").optional(false);

    RecipeSchema SCHEMA = new RecipeSchema(INPUT, RESULT, BREAK_CHANCE, OUTPUT, DEFAULT_RECIPE);
}
