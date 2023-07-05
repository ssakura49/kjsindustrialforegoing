package com.bobvarioa.kjsindustrialforegoing;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(KJSIndustrialForegoing.MODID)
public class KJSIndustrialForegoing {
    public static final String MODID = "kjsindustrialforegoing";

    public KJSIndustrialForegoing() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    }
}
