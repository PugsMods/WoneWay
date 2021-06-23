package com.pugzarecute.woneway;

import com.pugzarecute.woneway.init.WoneWayBlocks;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

//Commented out for now for the optimization update
@Mod.EventBusSubscriber(modid = WoneWay.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockColor {
    @SubscribeEvent
    public static void setupBlockColors(ColorHandlerEvent.Block event) {
        net.minecraft.client.renderer.color.BlockColors colors = event.getBlockColors();
        for (String leaves:WoneWayBlocks.leaves.keySet()) {
            colors.register((state, world, pos, tint) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColors.getDefaultColor(), WoneWayBlocks.leaves.get(leaves).get());
        }
        //colors.register((state, world, pos, tint) ->  tint == 1 ? (world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColors.get(0.5D, 1.0D)) : -1, WoneWayBlocks.SEETHROUGH_GRASS_BLOCK.get());
    }

    @SubscribeEvent
    public static void setupItemColors(ColorHandlerEvent.Item event) {
        ItemColors colors = event.getItemColors();
        //colors.register((stack, tint) -> FoliageColors.getDefaultColor(),);
    }
}