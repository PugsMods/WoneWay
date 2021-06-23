package com.pugzarecute.woneway;

import com.pugzarecute.woneway.init.WoneWayBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

//
//@author PutoPug
//

//Subscribe to the event bus.
@Mod.EventBusSubscriber(modid = WoneWay.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSub {
    //Subscribe to the FMLClientSetupEvent Event.
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        //Iterate through every entry in WoneWayBlocks.blocks
        for (String blk :WoneWayBlocks.blocks.keySet()) {
            //Set the RenderType to RenderType.translucent()
            RenderTypeLookup.setRenderLayer(WoneWayBlocks.blocks.get(blk).get(), RenderType.translucent());
        }
    }
}
