package com.bobvarioa.kjsindustrialforegoing.recipes;

import com.bobvarioa.kjsindustrialforegoing.TitaniumComponents;
import dev.latvian.mods.kubejs.fluid.EmptyFluidStackJS;
import dev.latvian.mods.kubejs.fluid.InputFluid;
import dev.latvian.mods.kubejs.fluid.OutputFluid;
import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;

public interface DissolutionChamberRecipe {

    RecipeKey<InputItem[]> INPUT = ItemComponents.INPUT_ARRAY.key("input");
    RecipeKey<InputFluid> INPUT_FLUID = TitaniumComponents.INPUT_FLUID.key("inputFluid");

    RecipeKey<OutputItem> OUTPUT = ItemComponents.OUTPUT.key("output");
    RecipeKey<OutputFluid> OUTPUT_FLUID = TitaniumComponents.OUTPUT_FLUID.key("outputFluid").optional(EmptyFluidStackJS.INSTANCE).exclude().allowEmpty();
    RecipeKey<Long> TIME = NumberComponent.LONG.key("processingTime");

    RecipeSchema SCHEMA = new RecipeSchema(INPUT, INPUT_FLUID, OUTPUT, TIME, OUTPUT_FLUID);
}
