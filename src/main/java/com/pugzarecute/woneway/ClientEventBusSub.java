package com.pugzarecute.woneway;

import com.pugzarecute.woneway.init.WoneWayBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = WoneWay.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSub {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        for (String blk :WoneWayBlocks.blocks.keySet()) {
            RenderTypeLookup.setRenderLayer(WoneWayBlocks.blocks.get(blk).get(), RenderType.translucent());
        }
    }
}
