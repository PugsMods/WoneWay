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

//BROKEN CLASS DUE TO 1.17.1 (The Class is "Broken" because of 1.17)
package com.pugzarecute.woneway.client;

import com.pugzarecute.woneway.WoneWay;
import com.pugzarecute.woneway.init.WoneWayBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = WoneWay.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSub {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        for (RegistryObject<Block> blockId : WoneWayBlocks.BLOCK_MAP) {
            ItemBlockRenderTypes.setRenderLayer(blockId.get(), RenderType.translucent());
            WoneWay.LOGGER.debug("WoneWay: Registering RenderType for " + blockId);
        }
    }
}
