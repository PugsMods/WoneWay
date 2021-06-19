package com.putopug.woneway;

import com.putopug.woneway.init.WoneWayBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
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
        //Iterate through every block in the register and set its RenderType.
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator, RenderType.translucent());
    }
}
