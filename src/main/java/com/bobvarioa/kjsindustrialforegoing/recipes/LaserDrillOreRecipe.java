package com.bobvarioa.kjsindustrialforegoing.recipes;

import com.bobvarioa.kjsindustrialforegoing.TitaniumComponents;
import com.buuz135.industrial.recipe.LaserDrillRarity;
import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.component.RecipeComponentBuilder;
import dev.latvian.mods.kubejs.recipe.component.RecipeComponentBuilderMap;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;

import java.util.Map;

public interface LaserDrillOreRecipe {
    RecipeKey<OutputItem> OUTPUT = ItemComponents.OUTPUT.key("output");
    RecipeKey<RecipeComponentBuilderMap[]> RARITY = TitaniumComponents.RARITY.asArray().key("rarity");

    RecipeKey<InputItem> CATALYST = ItemComponents.INPUT.key("catalyst");

    RecipeKey<Integer> POINTER = NumberComponent.INT.key("pointer").optional(0);
    // idk what this even does

    RecipeSchema SCHEMA = new RecipeSchema(OUTPUT, CATALYST, RARITY, POINTER);
}
