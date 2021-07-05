/*
 *     Copyright (C) 2021 PugzAreCute
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.pugzarecute.woneway;

import com.pugzarecute.woneway.init.WoneWayBlocks;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

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
        for(String lvs: WoneWayBlocks.leaves.keySet()) colors.register((stack, tint) -> FoliageColors.getDefaultColor(),WoneWayBlocks.leaves.get(lvs).get());
    }
}