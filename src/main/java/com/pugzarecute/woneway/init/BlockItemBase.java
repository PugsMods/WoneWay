package com.pugzarecute.woneway.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BlockItemBase extends BlockItem {
    public static final ItemGroup BLOCKS = new ItemGroup("wonewayblocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.DAMAGED_ANVIL);
        }
    };

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().tab(BLOCKS));
    }
}