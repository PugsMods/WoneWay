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

package com.pugzarecute.woneway.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Material;

import javax.annotation.Nonnull;

public class SeethroughBlock extends Block {

    public SeethroughBlock() {
        super(Block.Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(1f, 10f).noOcclusion());
        this.registerDefaultState(this.getStateDefinition().any().setValue(DirectionalBlock.FACING, Direction.NORTH));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(DirectionalBlock.FACING);
    }

    @SuppressWarnings("deprecation")
    @Nonnull
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(DirectionalBlock.FACING, rot.rotate(state.getValue(DirectionalBlock.FACING)));
    }

    @SuppressWarnings("deprecation")
    @Nonnull
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(DirectionalBlock.FACING)));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(DirectionalBlock.FACING, context.getNearestLookingDirection().getOpposite());
    }
}
