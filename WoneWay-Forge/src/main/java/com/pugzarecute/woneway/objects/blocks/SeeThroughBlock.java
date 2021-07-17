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

package com.pugzarecute.woneway.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DirectionalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

import java.util.Collections;
import java.util.List;

public class SeeThroughBlock extends Block {
    public static final DirectionProperty FACING = DirectionalBlock.FACING;

    public SeeThroughBlock() {
        super(Block.Properties.of(Material.METAL).sound(SoundType.WOOD).strength(1f, 10f).lightLevel(s -> 0).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) { builder.add(FACING); }

    public BlockState rotate(BlockState state, Rotation rot) { return state.setValue(FACING, rot.rotate(state.getValue(FACING))); }

    public BlockState mirror(BlockState state, Mirror mirrorIn) { return state.rotate(mirrorIn.getRotation(state.getValue(FACING))); }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) { return this.defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite()); }
}
