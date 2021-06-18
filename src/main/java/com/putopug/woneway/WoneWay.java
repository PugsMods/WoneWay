package com.putopug.woneway;

import com.putopug.woneway.init.WoneWayBlocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod("woneway")
public class WoneWay
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "woneway";

    public WoneWay() {
        MinecraftForge.EVENT_BUS.register(this);
        WoneWayBlocks.init();
    }
}
