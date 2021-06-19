package com.putopug.woneway;

import com.putopug.woneway.init.WoneWayBlocks;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
//Commented out for now for the optimization update
@Mod.EventBusSubscriber(modid = WoneWay.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockColor {
    @SubscribeEvent
    public static void setupBlockColors(ColorHandlerEvent.Block event) {
        net.minecraft.client.renderer.color.BlockColors colors = event.getBlockColors();
        //colors.register((state, world, pos, tint) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColors.getDefaultColor(), WoneWayBlocks.SEETHROUGH_ACACIA_LEAVES.get());
        //colors.register((state, world, pos, tint) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColors.getDefaultColor(), WoneWayBlocks.SEETHROUGH_BIRCH_LEAVES.get());
        //colors.register((state, world, pos, tint) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColors.getDefaultColor(), WoneWayBlocks.SEETHROUGH_DARK_OAK_LEAVES.get());
        //colors.register((state, world, pos, tint) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColors.getDefaultColor(), WoneWayBlocks.SEETHROUGH_JUNGLE_LEAVES.get());
        //colors.register((state, world, pos, tint) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColors.getDefaultColor(), WoneWayBlocks.SEETHROUGH_OAK_LEAVES.get());
        //colors.register((state, world, pos, tint) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColors.getDefaultColor(), WoneWayBlocks.SEETHROUGH_SPRUCE_LEAVES.get());
        //colors.register((state, world, pos, tint) ->  tint == 1 ? (world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColors.get(0.5D, 1.0D)) : -1, WoneWayBlocks.SEETHROUGH_GRASS_BLOCK.get());
    }

    @SubscribeEvent
    public static void setupItemColors(ColorHandlerEvent.Item event) {
        ItemColors colors = event.getItemColors();
        //colors.register((stack, tint) -> FoliageColors.getDefaultColor(), WoneWayBlocks.SEETHROUGH_ACACIA_LEAVES_ITEM.get());
        //colors.register((stack, tint) -> FoliageColors.getDefaultColor(), WoneWayBlocks.SEETHROUGH_BIRCH_LEAVES_ITEM.get());
        //colors.register((stack, tint) -> FoliageColors.getDefaultColor(), WoneWayBlocks.SEETHROUGH_DARK_OAK_LEAVES_ITEM.get());
        //colors.register((stack, tint) -> FoliageColors.getDefaultColor(), WoneWayBlocks.SEETHROUGH_JUNGLE_LEAVES_ITEM.get());
        //colors.register((stack, tint) -> FoliageColors.getDefaultColor(), WoneWayBlocks.SEETHROUGH_OAK_LEAVES_ITEM.get());
        //colors.register((stack, tint) -> FoliageColors.getDefaultColor(), WoneWayBlocks.SEETHROUGH_SPRUCE_LEAVES_ITEM.get());
        //colors.register((stack, tint) ->  tint == 1 ? GrassColors.get(0.5D, 1.0D) : -1, WoneWayBlocks.SEETHROUGH_GRASS_BLOCK_ITEM.get());
    }
}