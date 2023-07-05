package com.bobvarioa.kjsindustrialforegoing;

import com.bobvarioa.kjsindustrialforegoing.recipes.*;
import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.recipe.schema.RegisterRecipeSchemasEvent;
import net.minecraft.resources.ResourceLocation;

public class KJSIndustrialForegoingPlugin extends KubeJSPlugin {

    @Override
    public void registerRecipeSchemas(RegisterRecipeSchemasEvent event) {
        event.register(new ResourceLocation("industrialforegoing:laser_drill_ore"), LaserDrillOreRecipe.SCHEMA);
        event.register(new ResourceLocation("industrialforegoing:laser_drill_fluid"), LaserDrillFluidRecipe.SCHEMA);
        event.register(new ResourceLocation("industrialforegoing:fluid_extractor"), FluidExtractorRecipe.SCHEMA);
        event.register(new ResourceLocation("industrialforegoing:dissolution_chamber"), DissolutionChamberRecipe.SCHEMA);
        event.register(new ResourceLocation("industrialforegoing:crusher"), CrusherRecipe.SCHEMA);
        event.register(new ResourceLocation("industrialforegoing:stonework_generate"), StoneWorkRecipe.SCHEMA);
    }
}
