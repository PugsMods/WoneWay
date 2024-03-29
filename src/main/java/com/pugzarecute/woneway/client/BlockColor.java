/*
 * This file is part of WoneWay.
 *
 * WoneWay is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WoneWay is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with WoneWay.  If not, see <https://www.gnu.org/licenses/>.
 */

//TODO : blockcolors in 1.17.1

package com.pugzarecute.woneway.client;

import com.pugzarecute.woneway.WoneWay;
import com.pugzarecute.woneway.init.WoneWayBlocks;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = WoneWay.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockColor {

    @SubscribeEvent
    public static void setupBlockColors(ColorHandlerEvent.Block event) {
        final BlockColors colors = event.getBlockColors();
        for (RegistryObject<Block> leaves : WoneWayBlocks.LEAF_MAP) {
            colors.register((state, world, pos, tint) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(), leaves.get());
            WoneWay.LOGGER.debug("WoneWay: Registering BlockTint for " + leaves.get().getName().getString());
        }
    }

    @SubscribeEvent
    public static void setupItemColors(ColorHandlerEvent.Item event) {
        final ItemColors colors = event.getItemColors();
        for (RegistryObject<Block> leaves : WoneWayBlocks.LEAF_MAP) {
            colors.register((stack, tint) -> FoliageColor.getDefaultColor(), leaves.get());
            WoneWay.LOGGER.debug("WoneWay: Registering ItemTint for " + leaves.get().getName().getString());
        }
    }
}