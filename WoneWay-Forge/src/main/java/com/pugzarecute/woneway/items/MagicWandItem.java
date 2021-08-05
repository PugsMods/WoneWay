package com.pugzarecute.woneway.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class MagicWandItem extends Item {
    public MagicWandItem() {
        super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).durability(100).setNoRepair());
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level p_41432_, Player p_41433_, InteractionHand p_41434_) {
        //TOdo: else scan chunk and highlight all blocks using opengl
        //Todo : Raytracing (OHNO)
        return super.use(p_41432_, p_41433_, p_41434_);
    }
}
