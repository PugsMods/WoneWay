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

package com.pugzarecute.woneway.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class BlockItemBase extends BlockItem {
    public static final CreativeModeTab BLOCKS = new CreativeModeTab("wonewayblocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.GLASS);
        }

    };
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().tab(BLOCKS));
    }
}