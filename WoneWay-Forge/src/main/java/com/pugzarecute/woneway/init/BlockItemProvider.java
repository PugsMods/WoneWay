/*
 * This file is part of WoneWay.
 *
 * WoneWay is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WoneWay is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WoneWay.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.pugzarecute.woneway.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import javax.annotation.Nonnull;

public class BlockItemProvider extends BlockItem {

    public static final CreativeModeTab TAB_WONEWAY_BLOCKS = new CreativeModeTab("woneway_blocks") {
        @Override
        @Nonnull
        public ItemStack makeIcon()
        {
            return new ItemStack(Blocks.GLASS);
        }
    };

    public BlockItemProvider(Block block)
    {
        super(block, new Item.Properties().tab(TAB_WONEWAY_BLOCKS));
    }
}