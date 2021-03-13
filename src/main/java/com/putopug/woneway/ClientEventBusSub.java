package com.putopug.woneway;

import com.putopug.woneway.init.WoneWayBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

//
//@author PutoPug
//
@Mod.EventBusSubscriber(modid = WoneWay.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSub {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_ACACIA_LEAVES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_ACACIA_LOG.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_ACACIA_PLANKS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_ACACIA_WOOD.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_ANCIENT_DEBRIS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_ANDESITE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BARREL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BASALT.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BEDROCK.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BEE_NEST.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BEEHIVE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BIRCH_LEAVES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BIRCH_LOG.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BIRCH_PLANKS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BIRCH_WOOD.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLACK_CONCRETE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLACK_CONCRETE_POWDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLACK_GLAZED_TERRACOTTA.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLACK_SHULKER_BOX.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLACK_STAINED_GLASS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLACK_TERRACOTTA.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLACK_WOOL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLACKSTONE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLAST_FURNACE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLUE_CONCRETE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLUE_CONCRETE_POWDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLUE_GLAZED_TERRACOTTA.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLUE_ICE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLUE_SHULKER_BOX.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLUE_STAINED_GLASS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLUE_TERRACOTTA.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BLUE_WOOL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BONE_BLOCK.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BOOKSHELF.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BRAIN_CORAL_BLOCK.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BRICKS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BROWN_CONCRETE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BROWN_CONCRETE_POWDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BROWN_GLAZED_TERRACOTTA.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BROWN_MUSHROOM_BLOCK.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BROWN_SHULKER_BOX.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BROWN_STAINED_GLASS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BROWN_TERRACOTTA.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BROWN_WOOL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BUBBLE_CORAL_BLOCK.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CARTOGRAPHY_TABLE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CARVED_PUMPKIN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CHAIN_COMMAND_BLOCK.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CHISELED_NETHER_BRICKS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CHISELED_POLISHED_BLACKSTONE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_BASALT.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CHISELED_RED_SANDSTONE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CHISELED_SANDSTONE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CHISELED_STONE_BRICKS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CLAY_BLOCK.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_COAL_BLOCK.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_COAL_ORE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_COARSE_DIRT.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_COBBLESTONE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_COMMAND_BLOCK.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CRACKED_NETHER_BRICKS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CRACKED_POLISHED_BLACKSTONE_BRICKS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CRACKED_STONE_BRICKS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CRAFTING_TABLE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CRIMSON_HYPHAE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CRIMSON_NYLIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CRIMSON_PLANKS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CRIMSON_STEM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CRYING_OBSIDIAN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CUT_RED_SANDSTONE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CUT_SANDSTONE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CYAN_CONCRETE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(WoneWayBlocks.SEETHROUGH_CYAN_CONCRETE_POWDER.get(), RenderType.getCutout());
    }
}
