package com.your_mod;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(YourMod.MODID)
public class YourMod {
    public static final String MODID = "gtestmod";


    public YourMod() {
        System.out.println("Hello World!");
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Temp.BLOCKS.register(modEventBus);
        Temp.ITEMS.register(modEventBus);
        Temp.BLOCK_ENTITY_TYPE.register(modEventBus);

    }

}
