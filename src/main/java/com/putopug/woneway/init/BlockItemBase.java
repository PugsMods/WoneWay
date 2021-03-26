package com.putopug.woneway.init;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

//
//@author PutoPug
//
public class BlockItemBase extends BlockItem {
    //strippedcrimson  hyphae\\
    //SHULKERS
    //birch log\\
    public static final net.minecraft.item.ItemGroup BLOCKS = new net.minecraft.item.ItemGroup("wonewayblocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(WoneWayBlocks.SEETHROUGH_DIAMOND_BLOCK.get());
        }
    };
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().tab(BLOCKS));
    }
}