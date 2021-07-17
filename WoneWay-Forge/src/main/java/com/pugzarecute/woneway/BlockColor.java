/*
 * Copyright (C) 2021 PugzAreCute
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Additional permission under GNU GPL version 3 section 7
 *
 * If you modify this Program, or any covered work, by linking or combining it with Minecraft (or a modified version of that library),
 * containing parts covered by the terms of All Rights Reserved, the licensors of this Program grant you additional permission to convey the resulting work.
 * {Corresponding Source for a non-source form of such a combination shall include the source code for the parts of Minecraft used as well as that of the covered work.}
 */

package com.pugzarecute.woneway;

import com.pugzarecute.woneway.init.WoneWayBlocks;
import net.minecraft.client.renderer.color.BlockColors;
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
        BlockColors colors = event.getBlockColors();
        //Iterate through every leaf
        for (String leaves : WoneWayBlocks.leaves.keySet())
            colors.register((state, world, pos, tint) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColors.getDefaultColor(), WoneWayBlocks.leaves.get(leaves).get());
    }

    @SubscribeEvent
    public static void setupItemColors(ColorHandlerEvent.Item event) {
        ItemColors colors = event.getItemColors();
        //Iterate through every leaf
        for(String lvs: WoneWayBlocks.leaves.keySet()) colors.register((stack, tint) -> FoliageColors.getDefaultColor(),WoneWayBlocks.leaves.get(lvs).get());
    }
}