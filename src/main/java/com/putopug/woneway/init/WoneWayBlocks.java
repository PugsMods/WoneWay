package com.putopug.woneway.init;

import com.putopug.woneway.WoneWay;
import com.putopug.woneway.objects.blocks.SeeThroughBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//
//@author PutoPug
//
@SuppressWarnings("all")// Line so my ide wont give me a billion UNUSED FIELDS ERRORS
public class WoneWayBlocks {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WoneWay.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WoneWay.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //BLOCKS
    public static final RegistryObject<Block> SEETHROUGH_ACACIA_LEAVES = BLOCKS.register("seethrough_acacia_leaves", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_ACACIA_LOG = BLOCKS.register("seethrough_acacia_log", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_ACACIA_PLANKS = BLOCKS.register("seethrough_acacia_planks", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_ACACIA_WOOD = BLOCKS.register("seethrough_acacia_wood", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_ANCIENT_DEBRIS = BLOCKS.register("seethrough_ancient_debris", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_ANDESITE = BLOCKS.register("seethrough_andesite", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BASALT = BLOCKS.register("seethrough_basalt", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BEDROCK = BLOCKS.register("seethrough_bedrock", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BEE_NEST = BLOCKS.register("seethrough_bee_nest", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BEEHIVE = BLOCKS.register("seethrough_beehive", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BIRCH_LEAVES = BLOCKS.register("seethrough_birch_leaves", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BIRCH_LOG = BLOCKS.register("seethrough_birch_log", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BIRCH_PLANKS = BLOCKS.register("seethrough_birch_planks", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BIRCH_WOOD = BLOCKS.register("seethrough_birch_wood", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLACK_CONCRETE = BLOCKS.register("seethrough_black_concrete", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLACK_CONCRETE_POWDER = BLOCKS.register("seethrough_black_concrete_powder", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLACK_GLAZED_TERRACOTTA = BLOCKS.register("seethrough_black_glazed_terracotta", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLACK_SHULKER_BOX = BLOCKS.register("seethrough_black_shulker_box", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLACK_STAINED_GLASS = BLOCKS.register("seethrough_black_stained_glass", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLACK_TERRACOTTA = BLOCKS.register("seethrough_black_terracotta", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLACK_WOOL = BLOCKS.register("seethrough_black_wool", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLACKSTONE = BLOCKS.register("seethrough_blackstone", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLAST_FURNACE = BLOCKS.register("seethrough_blast_furnace", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLUE_CONCRETE = BLOCKS.register("seethrough_blue_concrete", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLUE_CONCRETE_POWDER = BLOCKS.register("seethrough_blue_concrete_powder", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLUE_GLAZED_TERRACOTTA = BLOCKS.register("seethrough_blue_glazed_terracotta", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLUE_ICE = BLOCKS.register("seethrough_blue_ice", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLUE_SHULKER_BOX = BLOCKS.register("seethrough_blue_shulker_box", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLUE_STAINED_GLASS = BLOCKS.register("seethrough_blue_stained_glass", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLUE_TERRACOTTA = BLOCKS.register("seethrough_blue_terracotta", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLUE_WOOL = BLOCKS.register("seethrough_blue_wool", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BONE_BLOCK = BLOCKS.register("seethrough_bone_block", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BOOKSHELF= BLOCKS.register("seethrough_bookshelf", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BRAIN_CORAL_BLOCK = BLOCKS.register("seethrough_brain_coral_block", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BRICKS = BLOCKS.register("seethrough_bricks", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BROWN_CONCRETE = BLOCKS.register("seethrough_brown_concrete", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BROWN_CONCRETE_POWDER = BLOCKS.register("seethrough_brown_concrete_powder", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BROWN_GLAZED_TERRACOTTA = BLOCKS.register("seethrough_brown_glazed_terracotta", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BROWN_MUSHROOM_BLOCK = BLOCKS.register("seethrough_brown_mushroom_block", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BROWN_SHULKER_BOX = BLOCKS.register("seethrough_brown_shulker_box", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BROWN_STAINED_GLASS = BLOCKS.register("seethrough_brown_stained_glass", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BROWN_TERRACOTTA = BLOCKS.register("seethrough_brown_terracotta", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BROWN_WOOL = BLOCKS.register("seethrough_brown_wool", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BUBBLE_CORAL_BLOCK = BLOCKS.register("seethrough_bubble_coral_block", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CARTOGRAPHY_TABLE = BLOCKS.register("seethrough_cartography_table", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CARVED_PUMPKIN = BLOCKS.register("seethrough_carved_pumpkin", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CHAIN_COMMAND_BLOCK = BLOCKS.register("seethrough_chain_command_block", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CHISELED_NETHER_BRICKS = BLOCKS.register("seethrough_chiseled_nether_bricks", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CHISELED_POLISHED_BLACKSTONE = BLOCKS.register("seethrough_chiseled_polished_blackstone", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CHISELED_RED_SANDSTONE = BLOCKS.register("seethrough_chiseled_red_sandstone", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CHISELED_SANDSTONE = BLOCKS.register("seethrough_chiseled_sandstone", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CHISELED_STONE_BRICKS = BLOCKS.register("seethrough_chiseled_stone_bricks", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CLAY_BLOCK = BLOCKS.register("seethrough_clay", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_COAL_BLOCK = BLOCKS.register("seethrough_coal_block", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_COAL_ORE = BLOCKS.register("seethrough_coal_ore", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_COARSE_DIRT = BLOCKS.register("seethrough_coarse_dirt", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_COBBLESTONE = BLOCKS.register("seethrough_cobblestone", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_COMMAND_BLOCK = BLOCKS.register("seethrough_command_block", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CRACKED_NETHER_BRICKS = BLOCKS.register("seethrough_cracked_nether_bricks", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CRACKED_POLISHED_BLACKSTONE_BRICKS = BLOCKS.register("seethrough_cracked_polished_blackstone_bricks", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CRACKED_STONE_BRICKS = BLOCKS.register("seethrough_cracked_stone_bricks", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CRAFTING_TABLE = BLOCKS.register("seethrough_crafting_table", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CRIMSON_HYPHAE = BLOCKS.register("seethrough_crimson_hyphae", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CRIMSON_NYLIUM = BLOCKS.register("seethrough_crimson_nylium", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CRIMSON_PLANKS = BLOCKS.register("seethrough_crismon_planks", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CRIMSON_STEM = BLOCKS.register("seethrough_crimson_stem", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CRYING_OBSIDIAN = BLOCKS.register("seethrough_crying_obsidian", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CUT_RED_SANDSTONE = BLOCKS.register("seethrough_cut_red_sandstone", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CUT_SANDSTONE = BLOCKS.register("seethrough_cut_sandstone", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CYAN_CONCRETE = BLOCKS.register("seethrough_cyan_concrete", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_CYAN_CONCRETE_POWDER = BLOCKS.register("seethrough_cyan_concrete_powder", SeeThroughBlock::new);




    //ITEMS
    public static final RegistryObject<Item> SEETHROUGH_ACACIA_LEAVES_ITEM = ITEMS.register("seethrough_acacia_leaves", () -> new BlockItemBase(SEETHROUGH_ACACIA_LEAVES.get()));
    public static final RegistryObject<Item> SEETHROUGH_ACACIA_LOG_ITEM = ITEMS.register("seethrough_acacia_log", () -> new BlockItemBase(SEETHROUGH_ACACIA_LOG.get()));
    public static final RegistryObject<Item> SEETHROUGH_ACACIA_PLANKS_ITEM = ITEMS.register("seethrough_acacia_planks", () -> new BlockItemBase(SEETHROUGH_ACACIA_PLANKS.get()));
    public static final RegistryObject<Item> SEETHROUGH_ACACIA_WOOD_ITEM = ITEMS.register("seethrough_acacia_wood", () -> new BlockItemBase(SEETHROUGH_ACACIA_WOOD.get()));
    public static final RegistryObject<Item> SEETHROUGH_ANCIENT_DEBRIS_ITEM = ITEMS.register("seethrough_ancient_debris", () -> new BlockItemBase(SEETHROUGH_ANCIENT_DEBRIS.get()));
    public static final RegistryObject<Item> SEETHROUGH_ANDESITE_ITEM = ITEMS.register("seethrough_andesite", () -> new BlockItemBase(SEETHROUGH_ANDESITE.get()));
    public static final RegistryObject<Item> SEETHROUGH_BARREL_ITEM = ITEMS.register("seethrough_barrel", () -> new BlockItemBase(SEETHROUGH_BARREL.get()));
    public static final RegistryObject<Item> SEETHROUGH_BASALT_ITEM = ITEMS.register("seethrough_basalt", () -> new BlockItemBase(SEETHROUGH_BASALT.get()));
    public static final RegistryObject<Item> SEETHROUGH_BEDROCK_ITEM = ITEMS.register("seethrough_bedrock", () -> new BlockItemBase(SEETHROUGH_BEDROCK.get()));
    public static final RegistryObject<Item> SEETHROUGH_BEE_NEST_ITEM = ITEMS.register("seethrough_bee_nest", () -> new BlockItemBase(SEETHROUGH_BEE_NEST.get()));
    public static final RegistryObject<Item> SEETHROUGH_BEEHIVE_ITEM = ITEMS.register("seethrough_beehive", () -> new BlockItemBase(SEETHROUGH_BEEHIVE.get()));
    public static final RegistryObject<Item> SEETHROUGH_BIRCH_LEAVES_ITEM = ITEMS.register("seethrough_birch_leaves", () -> new BlockItemBase(SEETHROUGH_BIRCH_LEAVES.get()));
    public static final RegistryObject<Item> SEETHROUGH_BIRCH_LOG_ITEM = ITEMS.register("seethrough_birch_log", () -> new BlockItemBase(SEETHROUGH_BIRCH_LOG.get()));
    public static final RegistryObject<Item> SEETHROUGH_BIRCH_PLANKS_ITEM = ITEMS.register("seethrough_birch_planks", () -> new BlockItemBase(SEETHROUGH_BIRCH_PLANKS.get()));
    public static final RegistryObject<Item> SEETHROUGH_BIRCH_WOOD_ITEM = ITEMS.register("seethrough_birch_wood", () -> new BlockItemBase(SEETHROUGH_BIRCH_WOOD.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLACK_CONCRETE_ITEM = ITEMS.register("seethrough_black_concrete", () -> new BlockItemBase(SEETHROUGH_BLACK_CONCRETE.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLACK_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_black_concrete_powder", () -> new BlockItemBase(SEETHROUGH_BLACK_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLACK_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_black_glazed_terracotta", () -> new BlockItemBase(SEETHROUGH_BLACK_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLACK_SHULKER_BOX_ITEM = ITEMS.register("seethrough_black_shulker_box", () -> new BlockItemBase(SEETHROUGH_BLACK_SHULKER_BOX.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLACK_STAINED_GLASS_ITEM = ITEMS.register("seethrough_black_stained_glass", () -> new BlockItemBase(SEETHROUGH_BLACK_STAINED_GLASS.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLACK_TERRACOTTA_ITEM = ITEMS.register("seethrough_black_terracotta", () -> new BlockItemBase(SEETHROUGH_BLACK_TERRACOTTA.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLACK_WOOL_ITEM = ITEMS.register("seethrough_black_wool", () -> new BlockItemBase(SEETHROUGH_BLACK_WOOL.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLACKSTONE_ITEM = ITEMS.register("seethrough_blackstone", () -> new BlockItemBase(SEETHROUGH_BLACKSTONE.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLAST_FURNACE_ITEM = ITEMS.register("seethrough_blast_furnace", () -> new BlockItemBase(SEETHROUGH_BLAST_FURNACE.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLUE_CONCRETE_ITEM = ITEMS.register("seethrough_blue_concrete", () -> new BlockItemBase(SEETHROUGH_BLUE_CONCRETE.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLUE_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_blue_concrete_powder", () -> new BlockItemBase(SEETHROUGH_BLUE_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLUE_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_blue_glazed_terracotta", () -> new BlockItemBase(SEETHROUGH_BLUE_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLUE_ICE_ITEM = ITEMS.register("seethrough_blue_ice", () -> new BlockItemBase(SEETHROUGH_BLUE_ICE.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLUE_SHULKER_BOX_ITEM = ITEMS.register("seethrough_blue_shulker_box", () -> new BlockItemBase(SEETHROUGH_BLUE_SHULKER_BOX.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLUE_STAINED_GLASS_ITEM = ITEMS.register("seethrough_blue_stained_glass", () -> new BlockItemBase(SEETHROUGH_BLUE_STAINED_GLASS.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLUE_TERRACOTTA_ITEM = ITEMS.register("seethrough_blue_terracotta", () -> new BlockItemBase(SEETHROUGH_BLUE_TERRACOTTA.get()));
    public static final RegistryObject<Item> SEETHROUGH_BLUE_WOOL_ITEM = ITEMS.register("seethrough_blue_wool", () -> new BlockItemBase(SEETHROUGH_BLUE_WOOL.get()));
    public static final RegistryObject<Item> SEETHROUGH_BONE_BLOCK_ITEM = ITEMS.register("seethrough_bone_block", () -> new BlockItemBase(SEETHROUGH_BONE_BLOCK.get()));
    public static final RegistryObject<Item> SEETHROUGH_BOOKSHELF_ITEM = ITEMS.register("seethrough_bookshelf", () -> new BlockItemBase(SEETHROUGH_BOOKSHELF.get()));
    public static final RegistryObject<Item> SEETHROUGH_BRAIN_CORAL_BLOCK_ITEM = ITEMS.register("seethrough_brain_coral_block", () -> new BlockItemBase(SEETHROUGH_BRAIN_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> SEETHROUGH_BRICKS_ITEM = ITEMS.register("seethrough_bricks", () -> new BlockItemBase(SEETHROUGH_BRICKS.get()));
    public static final RegistryObject<Item> SEETHROUGH_BROWN_CONCRETE_ITEM = ITEMS.register("seethrough_brown_concrete", () -> new BlockItemBase(SEETHROUGH_BROWN_CONCRETE.get()));
    public static final RegistryObject<Item> SEETHROUGH_BROWN_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_brown_concrete_powder", () -> new BlockItemBase(SEETHROUGH_BROWN_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> SEETHROUGH_BROWN_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_brown_glazed_terracotta", () -> new BlockItemBase(SEETHROUGH_BROWN_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> SEETHROUGH_BROWN_MUSHROOM_BLOCK_ITEM = ITEMS.register("seethrough_brown_mushroom_block", () -> new BlockItemBase(SEETHROUGH_BROWN_MUSHROOM_BLOCK.get()));
    public static final RegistryObject<Item> SEETHROUGH_BROWN_SHULKER_BOX_ITEM = ITEMS.register("seethrough_brown_shulker_box", () -> new BlockItemBase(SEETHROUGH_BROWN_SHULKER_BOX.get()));
    public static final RegistryObject<Item> SEETHROUGH_BROWN_STAINED_GLASS_ITEM = ITEMS.register("seethrough_brown_stained_glass", () -> new BlockItemBase(SEETHROUGH_BROWN_STAINED_GLASS.get()));
    public static final RegistryObject<Item> SEETHROUGH_BROWN_TERRACOTTA_ITEM = ITEMS.register("seethrough_brown_terracotta", () -> new BlockItemBase(SEETHROUGH_BROWN_TERRACOTTA.get()));
    public static final RegistryObject<Item> SEETHROUGH_BROWN_WOOL_ITEM = ITEMS.register("seethrough_brown_wool", () -> new BlockItemBase(SEETHROUGH_BROWN_WOOL.get()));
    public static final RegistryObject<Item> SEETHROUGH_BUBBLE_CORAL_BLOCK_ITEM = ITEMS.register("seethrough_bubble_coral_block", () -> new BlockItemBase(SEETHROUGH_BUBBLE_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> SEETHROUGH_CARTOGRAPHY_TABLE_ITEM = ITEMS.register("seethrough_cartography_table", () -> new BlockItemBase(SEETHROUGH_CARTOGRAPHY_TABLE.get()));
    public static final RegistryObject<Item> SEETHROUGH_CARVED_PUMPKIN_ITEM = ITEMS.register("seethrough_carved_pumpkin", () -> new BlockItemBase(SEETHROUGH_CARVED_PUMPKIN.get()));
    public static final RegistryObject<Item> SEETHROUGH_CHAIN_COMMAND_BLOCK_ITEM = ITEMS.register("seethrough_chain_command_block", () -> new BlockItemBase(SEETHROUGH_CHAIN_COMMAND_BLOCK.get()));
    public static final RegistryObject<Item> SEETHROUGH_CHISELED_NETHER_BRICKS_ITEM = ITEMS.register("seethrough_chiseled_nether_bricks", () -> new BlockItemBase(SEETHROUGH_CHISELED_NETHER_BRICKS.get()));
    public static final RegistryObject<Item> SEETHROUGH_CHISELED_POLISHED_BLACKSTONE_ITEM = ITEMS.register("seethrough_chiseled_polished_blackstone_bricks", () -> new BlockItemBase(SEETHROUGH_CHISELED_POLISHED_BLACKSTONE.get()));
    public static final RegistryObject<Item> SEETHROUGH_CHISELED_RED_SANDSTONE_ITEM = ITEMS.register("seethrough_chiseled_red_sandstone", () -> new BlockItemBase(SEETHROUGH_CHISELED_RED_SANDSTONE.get()));
    public static final RegistryObject<Item> SEETHROUGH_CHISELED_SANDSTONE_ITEM = ITEMS.register("seethrough_chiseled_sandstone", () -> new BlockItemBase(SEETHROUGH_CHISELED_SANDSTONE.get()));
    public static final RegistryObject<Item> SEETHROUGH_STONE_BRICKS_ITEM = ITEMS.register("seethrough_stone_bricks", () -> new BlockItemBase(SEETHROUGH_CHISELED_STONE_BRICKS.get()));
    public static final RegistryObject<Item> SEETHROUGH_CLAY_BLOCK_ITEM = ITEMS.register("seethrough_clay", () -> new BlockItemBase(SEETHROUGH_CLAY_BLOCK.get()));
    public static final RegistryObject<Item> SEETHROUGH_COAL_BLOCK_ITEM = ITEMS.register("seethrough_coal_block", () -> new BlockItemBase(SEETHROUGH_COAL_BLOCK.get()));
    public static final RegistryObject<Item> SEETHROUGH_COAL_ORE_ITEM = ITEMS.register("seethrough_coal_ore", () -> new BlockItemBase(SEETHROUGH_COAL_ORE.get()));
    public static final RegistryObject<Item> SEETHROUGH_COARSE_DIRT_ITEM = ITEMS.register("seethrough_coarse_dirt", () -> new BlockItemBase(SEETHROUGH_COARSE_DIRT.get()));
    public static final RegistryObject<Item> SEETHROUGH_COBBLESTONE_ITEM = ITEMS.register("seethrough_cobblestone", () -> new BlockItemBase(SEETHROUGH_COBBLESTONE.get()));
    public static final RegistryObject<Item> SEETHROUGH_COMMAND_BLOCK_ITEM = ITEMS.register("seethrough_command_block", () -> new BlockItemBase(SEETHROUGH_COMMAND_BLOCK.get()));
    public static final RegistryObject<Item> SEETHROUGH_CRACKED_NETHER_BRICKS_ITEM = ITEMS.register("seethrough_cracked_nether_bricks", () -> new BlockItemBase(SEETHROUGH_CRACKED_NETHER_BRICKS.get()));
    public static final RegistryObject<Item> SEETHROUGH_CRACKED_POLISHED_BLACKSTONE_BRICKS_ITEM = ITEMS.register("seethrough_crackes_polished_blackstone_bricks", () -> new BlockItemBase(SEETHROUGH_CRACKED_POLISHED_BLACKSTONE_BRICKS.get()));
    public static final RegistryObject<Item> SEETHROUGH_CRACKED_STONE_BRICKS_ITEM = ITEMS.register("seethrough_cracked_stone_bricks", () -> new BlockItemBase(SEETHROUGH_CRACKED_STONE_BRICKS.get()));
    public static final RegistryObject<Item> SEETHROUGH_CRAFTING_TABLE_ITEM = ITEMS.register("seethrough_crafting_table", () -> new BlockItemBase(SEETHROUGH_CRAFTING_TABLE.get()));
    public static final RegistryObject<Item> SEETHROUGH_CRIMSON_HYPHAE_ITEM = ITEMS.register("seethrough_crimson_hyphae", () -> new BlockItemBase(SEETHROUGH_CRIMSON_HYPHAE.get()));
    public static final RegistryObject<Item> SEETHROUGH_CRIMSON_NYLIUM_ITEM = ITEMS.register("seethrough_crimson_nylium", () -> new BlockItemBase(SEETHROUGH_CRIMSON_NYLIUM.get()));
    public static final RegistryObject<Item> SEETHROUGH_CRIMSON_PLANKS_ITEM = ITEMS.register("seethrough_crimson_planks", () -> new BlockItemBase(SEETHROUGH_CRIMSON_PLANKS.get()));
    public static final RegistryObject<Item> SEETHROUGH_CRIMSON_STEM_ITEM = ITEMS.register("seethrough_crimson_stem", () -> new BlockItemBase(SEETHROUGH_CRIMSON_STEM.get()));
    public static final RegistryObject<Item> SEETHROUGH_CRYING_OBSIDIAN_ITEM = ITEMS.register("seethrough_crying_obsidian", () -> new BlockItemBase(SEETHROUGH_CRYING_OBSIDIAN.get()));
    public static final RegistryObject<Item> SEETHROUGH_CUT_RED_SANDSTONE_ITEM = ITEMS.register("seethrough_cut_red_sandstone", () -> new BlockItemBase(SEETHROUGH_CUT_RED_SANDSTONE.get()));
    public static final RegistryObject<Item> SEETHROUGH_CUT_SANDSTONE_ITEM = ITEMS.register("seethrough_cut_sandstone", () -> new BlockItemBase(SEETHROUGH_CUT_SANDSTONE.get()));
    public static final RegistryObject<Item> SEETHROUGH_CYAN_CONCRETE_ITEM = ITEMS.register("seethrough_cyan_concrete", () -> new BlockItemBase(SEETHROUGH_CYAN_CONCRETE.get()));
    public static final RegistryObject<Item> SEETHROUGH_CYAN_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_cyan_concrete_powder", () -> new BlockItemBase(SEETHROUGH_CYAN_CONCRETE_POWDER.get()));

}
