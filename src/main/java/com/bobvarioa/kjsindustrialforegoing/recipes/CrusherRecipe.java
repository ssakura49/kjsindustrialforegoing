package com.bobvarioa.kjsindustrialforegoing.recipes;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;

public interface CrusherRecipe {
    RecipeKey<InputItem> INPUT = ItemComponents.INPUT.key("input");
    RecipeKey<OutputItem> OUTPUT = ItemComponents.OUTPUT.key("output");

    RecipeSchema SCHEMA = new RecipeSchema(INPUT, OUTPUT);
}
