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

package com.pugzarecute.woneway.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import javax.annotation.Nonnull;

public class MagicWandItem extends Item {
    public MagicWandItem() {
        super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).durability(100).setNoRepair());
    }

    @Override
    public InteractionResultHolder<ItemStack> use(@Nonnull Level p_41432_,@Nonnull Player p_41433_,@Nonnull InteractionHand p_41434_) {
        //TOdo: else scan chunk and highlight all blocks using opengl
        //Todo : Raytracing (OHNO)
        return super.use(p_41432_, p_41433_, p_41434_);
    }
}
