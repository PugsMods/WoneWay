package com.pugzarecute.woneway.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class MagicWandItem extends Item {
    public MagicWandItem() {
        super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).durability(100).setNoRepair());
    }
}
