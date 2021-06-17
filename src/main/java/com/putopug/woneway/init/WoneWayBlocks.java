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
    private void registerBlock(String id){
        BLOCKS.register(id
    }

    //BLOCKS
     "seethrough_acacia_leaves"
     "seethrough_acacia_log"
     "seethrough_acacia_planks"
     "seethrough_acacia_wood"
     "seethrough_ancient_debris"
     "seethrough_andesite"
     "seethrough_barrel"
     "seethrough_basalt"
     "seethrough_bedrock"
     "seethrough_bee_nest"
     "seethrough_beehive"
     "seethrough_birch_leaves"
     "seethrough_birch_log"
     "seethrough_birch_planks"
     "seethrough_birch_wood"
     "seethrough_black_concrete"
     "seethrough_black_concrete_powder"
     "seethrough_black_glazed_terracotta"
     "seethrough_black_shulker_box"
     "seethrough_black_stained_glass"
     "seethrough_black_terracotta"
     "seethrough_black_wool"
     "seethrough_blackstone"
     "seethrough_blast_furnace"
     "seethrough_blue_concrete"
     "seethrough_blue_concrete_powder"
     "seethrough_blue_glazed_terracotta"
     "seethrough_blue_ice"
     "seethrough_blue_shulker_box"
     "seethrough_blue_stained_glass"
     "seethrough_blue_terracotta"
     "seethrough_blue_wool"
     "seethrough_bone_block"
     "seethrough_bookshelf"
     "seethrough_brain_coral_block"
     "seethrough_bricks"
     "seethrough_brown_concrete"
     "seethrough_brown_concrete_powder"
     "seethrough_brown_glazed_terracotta"
     "seethrough_brown_mushroom_block"
     "seethrough_brown_shulker_box"
     "seethrough_brown_stained_glass"
     "seethrough_brown_terracotta"
     "seethrough_brown_wool"
     "seethrough_bubble_coral_block"
     "seethrough_cartography_table"
     "seethrough_carved_pumpkin"
     "seethrough_chain_command_block"
     "seethrough_chiseled_nether_bricks"
     "seethrough_chiseled_polished_blackstone"
     "seethrough_chiseled_red_sandstone"
     "seethrough_chiseled_sandstone"
     "seethrough_chiseled_stone_bricks"
     "seethrough_clay_block"
     "seethrough_coal_block"
     "seethrough_coal_ore"
     "seethrough_coarse_dirt"
     "seethrough_cobblestone"
     "seethrough_command_block"
     "seethrough_cracked_nether_bricks"
     "seethrough_cracked_polished_blackstone_bricks"
     "seethrough_cracked_stone_bricks"
     "seethrough_crafting_table"
     "seethrough_crimson_hyphae"
     "seethrough_crimson_nylium"
     "seethrough_crimson_planks"
     "seethrough_crimson_stem"
     "seethrough_crying_obsidian"
     "seethrough_cut_red_sandstone"
     "seethrough_cut_sandstone"
     "seethrough_cyan_concrete"
     "seethrough_cyan_concrete_powder"
     "seethrough_cyan_glazed_terracotta"
     "seethrough_cyan_shulker_box"
     "seethrough_cyan_stained_glass"
     "seethrough_cyan_terracotta"
     "seethrough_cyan_wool"
     "seethrough_dark_oak_leaves"
     "seethrough_dark_oak_log"
     "seethrough_dark_oak_planks"
     "seethrough_dark_oak_wood"
     "seethrough_dark_prismarine"
     "seethrough_dead_brain_coral_block"
     "seethrough_dead_bubble_coral_block"
     "seethrough_dead_fire_coral_block"
     "seethrough_dead_tube_coral_block"
     "seethrough_diamond_block"
     "seethrough_diamond_ore"
     "seethrough_diorite"
     "seethrough_dirt"
     "seethrough_dispenser"
     "seethrough_dried_kelp_block"
     "seethrough_dropper"
     "seethrough_emerald_block"
     "seethrough_emerald_ore"
     "seethrough_end_stone"
     "seethrough_end_stone_bricks"
     "seethrough_fire_coral_block"
     "seethrough_fletching_table"
     "seethrough_furnace"
     "seethrough_gilded_blackstone"
     "seethrough_glass"
     "seethrough_glowstone"
     "seethrough_gold_block"
     "seethrough_gold_ore"
     "seethrough_granite"
     "seethrough_grass_block"
     "seethrough_gray_concrete"
     "seethrough_gray_concrete_powder"
     "seethrough_gray_glazed_terracotta"
     "seethrough_gray_shulker_box"
     "seethrough_gray_stained_glass"
     "seethrough_gray_terracotta"
     "seethrough_gray_wool"
     "seethrough_green_concrete"
     "seethrough_green_concrete_powder"
     "seethrough_green_glazed_terracotta"
     "seethrough_green_shulker_box"
     "seethrough_green_stained_glass"
     "seethrough_green_terracotta"
     "seethrough_green_wool"
     "seethrough_hay_bale"
     "seethrough_honey_block"
     "seethrough_honeycomb_block"
     "seethrough_horn_coral_block"
     "seethrough_ice"
     "seethrough_iron_block"
     "seethrough_iron_ore"
     "seethrough_jack_o_lantern"
     "seethrough_jukebox"
     "seethrough_jungle_leaves"
     "seethrough_jungle_log"
     "seethrough_jungle_planks"
     "seethrough_jungle_wood"
     "seethrough_lapis_block"
     "seethrough_lapis_ore"
     "seethrough_light_blue_concrete"
     "seethrough_light_blue_concrete_powder"
     "seethrough_light_blue_glazed_terracotta"
     "seethrough_light_blue_shulker_box"
     "seethrough_light_blue_stained_glass"
     "seethrough_light_blue_terracotta"
     "seethrough_light_blue_wool"
     "seethrough_light_gray_concrete"
     "seethrough_light_gray_concrete_powder"
     "seethrough_light_gray_glazed_terracotta"
     "seethrough_light_gray_shulker_box"
     "seethrough_light_gray_stained_glass"
     "seethrough_light_gray_terracotta"
     "seethrough_light_gray_wool"
     "seethrough_lime_concrete"
     "seethrough_lime_concrete_powder"
     "seethrough_lime_glazed_terracotta"
     "seethrough_lime_shulker_box"
     "seethrough_lime_stained_glass"
     "seethrough_lime_terracotta"
     "seethrough_lime_wool"
     "seethrough_lodestone"
     "seethrough_loom"
     "seethrough_magenta_concrete"
     "seethrough_magenta_concrete_powder"
     "seethrough_magenta_glazed_terracotta"
     "seethrough_magenta_shulker_box"
     "seethrough_magenta_stained_glass"
     "seethrough_magenta_terracotta"
     "seethrough_magenta_wool"
     "seethrough_magma_block"
     "seethrough_melon"
     "seethrough_mossy_cobblestone"
     "seethrough_mossy_stone_bricks"
     "seethrough_mushroom_stem"
     "seethrough_mycelium"
     "seethrough_nether_bricks"
     "seethrough_nether_gold_ore"
     "seethrough_nether_quartz_ore"
     "seethrough_nether_wart_block"
     "seethrough_netherite_block"
     "seethrough_netherrack"
     "seethrough_note_block"
     "seethrough_oak_leaves"
     "seethrough_oak_log"
     "seethrough_oak_planks"
     "seethrough_oak_wood"
     "seethrough_observer"
     "seethrough_obsidian"
     "seethrough_orange_concrete"
     "seethrough_orange_concrete_powder"
     "seethrough_orange_glazed_terracotta"
     "seethrough_orange_shulker_box"
     "seethrough_orange_stained_glass"
     "seethrough_orange_terracotta"
     "seethrough_orange_wool"
     "seethrough_packed_ice"
     "seethrough_pink_concrete"
     "seethrough_pink_concrete_powder"
     "seethrough_pink_glazed_terracotta"
     "seethrough_pink_shulker_box"
     "seethrough_pink_stained_glass"
     "seethrough_pink_terracotta"
     "seethrough_pink_wool"
     "seethrough_piston"
     "seethrough_podzol"
     "seethrough_polished_andesite"
     "seethrough_polished_basalt"
     "seethrough_polished_blackstone"
     "seethrough_polished_blackstone_bricks"
     "seethrough_polished_diorite"
     "seethrough_polished_granite"
     "seethrough_prismarine"
     "seethrough_prismarine_bricks"
     "seethrough_pumpkin"
     "seethrough_purple_concrete"
     "seethrough_purple_concrete_powder"
     "seethrough_purple_glazed_terracotta"
     "seethrough_purple_shulker_box"
     "seethrough_purple_stained_glass"
     "seethrough_purple_terracotta"
     "seethrough_purple_wool"
     "seethrough_purpur_block"
     "seethrough_purpur_pillar"
     "seethrough_quartz_block"
     "seethrough_quartz_bricks"
     "seethrough_quartz_pillar"
     "seethrough_red_concrete"
     "seethrough_red_concrete_powder"
     "seethrough_red_glazed_terracotta"
     "seethrough_red_mushroom_block"
     "seethrough_red_nether_bricks"
     "seethrough_red_sand"
     "seethrough_red_sandstone"
     "seethrough_red_shulker_box"
     "seethrough_red_stained_glass"
     "seethrough_red_terracotta"
     "seethrough_red_wool"
     "seethrough_redstone_block"
     "seethrough_redstone_lamp"
     "seethrough_redstone_ore"
     "seethrough_repeating_command_block"
     "seethrough_respawn_anchor"
     "seethrough_sand"
     "seethrough_sandstone"
     "seethrough_sea_lantern"
     "seethrough_shroomlight"
     "seethrough_shulker_box"
     "seethrough_slime_block"
     "seethrough_smithing_table"
     "seethrough_smoker"
     "seethrough_smooth_quartz"
     "seethrough_smooth_red_sandstone"
     "seethrough_smooth_sandstone"
     "seethrough_smooth_stone"
     "seethrough_snow_block"
     "seethrough_soul_sand"
     "seethrough_soul_soil"
     "seethrough_spawner"
     "seethrough_sponge"
     "seethrough_spruce_leaves"
     "seethrough_spruce_log"
     "seethrough_spruce_planks"
     "seethrough_spruce_wood"
     "seethrough_sticky_piston"
     "seethrough_stone"
     "seethrough_stone_bricks"
     "seethrough_stripped_acacia_log"
     "seethrough_stripped_acacia_wood"
     "seethrough_stripped_birch_log"
     "seethrough_stripped_birch_wood"
     "seethrough_stripped_crimson_hyphae"
     "seethrough_stripped_crimson_stem"
     "seethrough_stripped_dark_oak_log"
     "seethrough_stripped_dark_oak_wood"
     "seethrough_stripped_jungle_log"
     "seethrough_stripped_jungle_wood"
     "seethrough_stripped_oak_log"
     "seethrough_stripped_oak_wood"
     "seethrough_stripped_spruce_log"
     "seethrough_stripped_spruce_wood"
     "seethrough_stripped_warped_hyphae"
     "seethrough_stripped_warped_stem"
     "seethrough_structure_block"
     "seethrough_target"
     "seethrough_terracotta"
     "seethrough_tnt"
     "seethrough_tube_coral_block"
     "seethrough_warped_hyphae"
     "seethrough_warped_nylium"
     "seethrough_warped_planks"
     "seethrough_warped_stem"
     "seethrough_warped_wart_block"
     "seethrough_wet_sponge"
     "seethrough_white_concrete"
     "seethrough_white_concrete_powder"
     "seethrough_white_glazed_terracotta"
     "seethrough_white_shulker_box"
     "seethrough_white_stained_glass"
     "seethrough_white_terracotta"
     "seethrough_white_wool"
     "seethrough_yellow_concrete"
     "seethrough_yellow_concrete_powder"
     "seethrough_yellow_glazed_terracotta"
     "seethrough_yellow_shulker_box"
     "seethrough_yellow_stained_glass"
     "seethrough_yellow_terracotta"
     "seethrough_yellow_wool"





    //ITEMS
    public static final RegistryObject<Item> ACACIA_LEAVES_ITEM = ITEMS.register("seethrough_acacia_leaves", () -> new BlockItemBase(ACACIA_LEAVES.get()));
    public static final RegistryObject<Item> ACACIA_LOG_ITEM = ITEMS.register("seethrough_acacia_log", () -> new BlockItemBase(ACACIA_LOG.get()));
    public static final RegistryObject<Item> ACACIA_PLANKS_ITEM = ITEMS.register("seethrough_acacia_planks", () -> new BlockItemBase(ACACIA_PLANKS.get()));
    public static final RegistryObject<Item> ACACIA_WOOD_ITEM = ITEMS.register("seethrough_acacia_wood", () -> new BlockItemBase(ACACIA_WOOD.get()));
    public static final RegistryObject<Item> ANCIENT_DEBRIS_ITEM = ITEMS.register("seethrough_ancient_debris", () -> new BlockItemBase(ANCIENT_DEBRIS.get()));
    public static final RegistryObject<Item> ANDESITE_ITEM = ITEMS.register("seethrough_andesite", () -> new BlockItemBase(ANDESITE.get()));
    public static final RegistryObject<Item> BARREL_ITEM = ITEMS.register("seethrough_barrel", () -> new BlockItemBase(BARREL.get()));
    public static final RegistryObject<Item> BASALT_ITEM = ITEMS.register("seethrough_basalt", () -> new BlockItemBase(BASALT.get()));
    public static final RegistryObject<Item> BEDROCK_ITEM = ITEMS.register("seethrough_bedrock", () -> new BlockItemBase(BEDROCK.get()));
    public static final RegistryObject<Item> BEE_NEST_ITEM = ITEMS.register("seethrough_bee_nest", () -> new BlockItemBase(BEE_NEST.get()));
    public static final RegistryObject<Item> BEEHIVE_ITEM = ITEMS.register("seethrough_beehive", () -> new BlockItemBase(BEEHIVE.get()));
    public static final RegistryObject<Item> BIRCH_LEAVES_ITEM = ITEMS.register("seethrough_birch_leaves", () -> new BlockItemBase(BIRCH_LEAVES.get()));
    public static final RegistryObject<Item> BIRCH_LOG_ITEM = ITEMS.register("seethrough_birch_log", () -> new BlockItemBase(BIRCH_LOG.get()));
    public static final RegistryObject<Item> BIRCH_PLANKS_ITEM = ITEMS.register("seethrough_birch_planks", () -> new BlockItemBase(BIRCH_PLANKS.get()));
    public static final RegistryObject<Item> BIRCH_WOOD_ITEM = ITEMS.register("seethrough_birch_wood", () -> new BlockItemBase(BIRCH_WOOD.get()));
    public static final RegistryObject<Item> BLACK_CONCRETE_ITEM = ITEMS.register("seethrough_black_concrete", () -> new BlockItemBase(BLACK_CONCRETE.get()));
    public static final RegistryObject<Item> BLACK_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_black_concrete_powder", () -> new BlockItemBase(BLACK_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> BLACK_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_black_glazed_terracotta", () -> new BlockItemBase(BLACK_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> BLACK_SHULKER_BOX_ITEM = ITEMS.register("seethrough_black_shulker_box", () -> new BlockItemBase(BLACK_SHULKER_BOX.get()));
    public static final RegistryObject<Item> BLACK_STAINED_GLASS_ITEM = ITEMS.register("seethrough_black_stained_glass", () -> new BlockItemBase(BLACK_STAINED_GLASS.get()));
    public static final RegistryObject<Item> BLACK_TERRACOTTA_ITEM = ITEMS.register("seethrough_black_terracotta", () -> new BlockItemBase(BLACK_TERRACOTTA.get()));
    public static final RegistryObject<Item> BLACK_WOOL_ITEM = ITEMS.register("seethrough_black_wool", () -> new BlockItemBase(BLACK_WOOL.get()));
    public static final RegistryObject<Item> BLACKSTONE_ITEM = ITEMS.register("seethrough_blackstone", () -> new BlockItemBase(BLACKSTONE.get()));
    public static final RegistryObject<Item> BLAST_FURNACE_ITEM = ITEMS.register("seethrough_blast_furnace", () -> new BlockItemBase(BLAST_FURNACE.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_ITEM = ITEMS.register("seethrough_blue_concrete", () -> new BlockItemBase(BLUE_CONCRETE.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_blue_concrete_powder", () -> new BlockItemBase(BLUE_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> BLUE_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_blue_glazed_terracotta", () -> new BlockItemBase(BLUE_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> BLUE_ICE_ITEM = ITEMS.register("seethrough_blue_ice", () -> new BlockItemBase(BLUE_ICE.get()));
    public static final RegistryObject<Item> BLUE_SHULKER_BOX_ITEM = ITEMS.register("seethrough_blue_shulker_box", () -> new BlockItemBase(BLUE_SHULKER_BOX.get()));
    public static final RegistryObject<Item> BLUE_STAINED_GLASS_ITEM = ITEMS.register("seethrough_blue_stained_glass", () -> new BlockItemBase(BLUE_STAINED_GLASS.get()));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_ITEM = ITEMS.register("seethrough_blue_terracotta", () -> new BlockItemBase(BLUE_TERRACOTTA.get()));
    public static final RegistryObject<Item> BLUE_WOOL_ITEM = ITEMS.register("seethrough_blue_wool", () -> new BlockItemBase(BLUE_WOOL.get()));
    public static final RegistryObject<Item> BONE_BLOCK_ITEM = ITEMS.register("seethrough_bone_block", () -> new BlockItemBase(BONE_BLOCK.get()));
    public static final RegistryObject<Item> BOOKSHELF_ITEM = ITEMS.register("seethrough_bookshelf", () -> new BlockItemBase(BOOKSHELF.get()));
    public static final RegistryObject<Item> BRAIN_CORAL_BLOCK_ITEM = ITEMS.register("seethrough_brain_coral_block", () -> new BlockItemBase(BRAIN_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> BRICKS_ITEM = ITEMS.register("seethrough_bricks", () -> new BlockItemBase(BRICKS.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_ITEM = ITEMS.register("seethrough_brown_concrete", () -> new BlockItemBase(BROWN_CONCRETE.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_brown_concrete_powder", () -> new BlockItemBase(BROWN_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> BROWN_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_brown_glazed_terracotta", () -> new BlockItemBase(BROWN_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> BROWN_MUSHROOM_BLOCK_ITEM = ITEMS.register("seethrough_brown_mushroom_block", () -> new BlockItemBase(BROWN_MUSHROOM_BLOCK.get()));
    public static final RegistryObject<Item> BROWN_SHULKER_BOX_ITEM = ITEMS.register("seethrough_brown_shulker_box", () -> new BlockItemBase(BROWN_SHULKER_BOX.get()));
    public static final RegistryObject<Item> BROWN_STAINED_GLASS_ITEM = ITEMS.register("seethrough_brown_stained_glass", () -> new BlockItemBase(BROWN_STAINED_GLASS.get()));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_ITEM = ITEMS.register("seethrough_brown_terracotta", () -> new BlockItemBase(BROWN_TERRACOTTA.get()));
    public static final RegistryObject<Item> BROWN_WOOL_ITEM = ITEMS.register("seethrough_brown_wool", () -> new BlockItemBase(BROWN_WOOL.get()));
    public static final RegistryObject<Item> BUBBLE_CORAL_BLOCK_ITEM = ITEMS.register("seethrough_bubble_coral_block", () -> new BlockItemBase(BUBBLE_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> CARTOGRAPHY_TABLE_ITEM = ITEMS.register("seethrough_cartography_table", () -> new BlockItemBase(CARTOGRAPHY_TABLE.get()));
    public static final RegistryObject<Item> CARVED_PUMPKIN_ITEM = ITEMS.register("seethrough_carved_pumpkin", () -> new BlockItemBase(CARVED_PUMPKIN.get()));
    public static final RegistryObject<Item> CHAIN_COMMAND_BLOCK_ITEM = ITEMS.register("seethrough_chain_command_block", () -> new BlockItemBase(CHAIN_COMMAND_BLOCK.get()));
    public static final RegistryObject<Item> CHISELED_NETHER_BRICKS_ITEM = ITEMS.register("seethrough_chiseled_nether_bricks", () -> new BlockItemBase(CHISELED_NETHER_BRICKS.get()));
    public static final RegistryObject<Item> CHISELED_POLISHED_BLACKSTONE_ITEM = ITEMS.register("seethrough_chiseled_polished_blackstone", () -> new BlockItemBase(CHISELED_POLISHED_BLACKSTONE.get()));
    public static final RegistryObject<Item> CHISELED_RED_SANDSTONE_ITEM = ITEMS.register("seethrough_chiseled_red_sandstone", () -> new BlockItemBase(CHISELED_RED_SANDSTONE.get()));
    public static final RegistryObject<Item> CHISELED_SANDSTONE_ITEM = ITEMS.register("seethrough_chiseled_sandstone", () -> new BlockItemBase(CHISELED_SANDSTONE.get()));
    public static final RegistryObject<Item> STONE_BRICKS_ITEM = ITEMS.register("seethrough_stone_bricks", () -> new BlockItemBase(CHISELED_STONE_BRICKS.get()));
    public static final RegistryObject<Item> CLAY_BLOCK_ITEM = ITEMS.register("seethrough_clay_block", () -> new BlockItemBase(CLAY_BLOCK.get()));
    public static final RegistryObject<Item> COAL_BLOCK_ITEM = ITEMS.register("seethrough_coal_block", () -> new BlockItemBase(COAL_BLOCK.get()));
    public static final RegistryObject<Item> COAL_ORE_ITEM = ITEMS.register("seethrough_coal_ore", () -> new BlockItemBase(COAL_ORE.get()));
    public static final RegistryObject<Item> COARSE_DIRT_ITEM = ITEMS.register("seethrough_coarse_dirt", () -> new BlockItemBase(COARSE_DIRT.get()));
    public static final RegistryObject<Item> COBBLESTONE_ITEM = ITEMS.register("seethrough_cobblestone", () -> new BlockItemBase(COBBLESTONE.get()));
    public static final RegistryObject<Item> COMMAND_BLOCK_ITEM = ITEMS.register("seethrough_command_block", () -> new BlockItemBase(COMMAND_BLOCK.get()));
    public static final RegistryObject<Item> CRACKED_NETHER_BRICKS_ITEM = ITEMS.register("seethrough_cracked_nether_bricks", () -> new BlockItemBase(CRACKED_NETHER_BRICKS.get()));
    public static final RegistryObject<Item> CRACKED_POLISHED_BLACKSTONE_BRICKS_ITEM = ITEMS.register("seethrough_cracked_polished_blackstone_bricks", () -> new BlockItemBase(CRACKED_POLISHED_BLACKSTONE_BRICKS.get()));
    public static final RegistryObject<Item> CRACKED_STONE_BRICKS_ITEM = ITEMS.register("seethrough_cracked_stone_bricks", () -> new BlockItemBase(CRACKED_STONE_BRICKS.get()));
    public static final RegistryObject<Item> CRAFTING_TABLE_ITEM = ITEMS.register("seethrough_crafting_table", () -> new BlockItemBase(CRAFTING_TABLE.get()));
    public static final RegistryObject<Item> CRIMSON_HYPHAE_ITEM = ITEMS.register("seethrough_crimson_hyphae", () -> new BlockItemBase(CRIMSON_HYPHAE.get()));
    public static final RegistryObject<Item> CRIMSON_NYLIUM_ITEM = ITEMS.register("seethrough_crimson_nylium", () -> new BlockItemBase(CRIMSON_NYLIUM.get()));
    public static final RegistryObject<Item> CRIMSON_PLANKS_ITEM = ITEMS.register("seethrough_crimson_planks", () -> new BlockItemBase(CRIMSON_PLANKS.get()));
    public static final RegistryObject<Item> CRIMSON_STEM_ITEM = ITEMS.register("seethrough_crimson_stem", () -> new BlockItemBase(CRIMSON_STEM.get()));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_ITEM = ITEMS.register("seethrough_crying_obsidian", () -> new BlockItemBase(CRYING_OBSIDIAN.get()));
    public static final RegistryObject<Item> CUT_RED_SANDSTONE_ITEM = ITEMS.register("seethrough_cut_red_sandstone", () -> new BlockItemBase(CUT_RED_SANDSTONE.get()));
    public static final RegistryObject<Item> CUT_SANDSTONE_ITEM = ITEMS.register("seethrough_cut_sandstone", () -> new BlockItemBase(CUT_SANDSTONE.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_ITEM = ITEMS.register("seethrough_cyan_concrete", () -> new BlockItemBase(CYAN_CONCRETE.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_cyan_concrete_powder", () -> new BlockItemBase(CYAN_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> CYAN_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_cyan_glazed_terracotta",() -> new BlockItemBase(CYAN_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> CYAN_SHULKER_BOX_ITEM = ITEMS.register("seethrough_cyan_shulker_box",() -> new BlockItemBase(CYAN_SHULKER_BOX.get()));
    public static final RegistryObject<Item> CYAN_STAINED_GLASS_ITEM = ITEMS.register("seethrough_cyan_stained_glass",() -> new BlockItemBase(CYAN_STAINED_GLASS.get()));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_ITEM = ITEMS.register("seethrough_cyan_terracotta",() -> new BlockItemBase(CYAN_TERRACOTTA.get()));
    public static final RegistryObject<Item> CYAN_WOOL_ITEM = ITEMS.register("seethrough_cyan_wool",() -> new BlockItemBase(CYAN_WOOL.get()));
    public static final RegistryObject<Item> DARK_OAK_LEAVES_ITEM = ITEMS.register("seethrough_dark_oak_leaves",() -> new BlockItemBase(DARK_OAK_LEAVES.get()));
    public static final RegistryObject<Item> DARK_OAK_LOG_ITEM = ITEMS.register("seethrough_dark_oak_log",() -> new BlockItemBase(DARK_OAK_LOG.get()));
    public static final RegistryObject<Item> DARK_OAK_PLANKS_ITEM = ITEMS.register("seethrough_dark_oak_planks",() -> new BlockItemBase(DARK_OAK_PLANKS.get()));
    public static final RegistryObject<Item> DARK_OAK_WOOD_ITEM = ITEMS.register("seethrough_dark_oak_wood",() -> new BlockItemBase(DARK_OAK_WOOD.get()));
    public static final RegistryObject<Item> DARK_PRISMARINE_ITEM = ITEMS.register("seethrough_dark_prismarine",() -> new BlockItemBase(DARK_PRISMARINE.get()));
    public static final RegistryObject<Item> DEAD_BRAIN_CORAL_BLOCK_ITEM = ITEMS.register("seethrough_dead_brain_coral_block",() -> new BlockItemBase(DEAD_BRAIN_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> DEAD_BUBBLE_CORAL_BLOCK_ITEM = ITEMS.register("seethrough_dead_bubble_coral_block",() -> new BlockItemBase(DEAD_BUBBLE_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> DEAD_FIRE_CORAL_BLOCK_ITEM = ITEMS.register("seethrough_dead_fire_coral_block",() -> new BlockItemBase(DEAD_FIRE_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> DEAD_TUBE_CORAL_BLOCK_ITEM = ITEMS.register("seethrough_dead_tube_coral_block",() -> new BlockItemBase(DEAD_TUBE_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> DIAMOND_BLOCK_ITEM = ITEMS.register("seethrough_diamond_block",() -> new BlockItemBase(DIAMOND_BLOCK.get()));
    public static final RegistryObject<Item> DIAMOND_ORE_ITEM = ITEMS.register("seethrough_diamond_ore",() -> new BlockItemBase(DIAMOND_ORE.get()));
    public static final RegistryObject<Item> DIORITE_ITEM = ITEMS.register("seethrough_diorite",() -> new BlockItemBase(DIORITE.get()));
    public static final RegistryObject<Item> DIRT_ITEM = ITEMS.register("seethrough_dirt",() -> new BlockItemBase(DIRT.get()));
    public static final RegistryObject<Item> DISPENSER_ITEM = ITEMS.register("seethrough_dispenser",() -> new BlockItemBase(DISPENSER.get()));
    public static final RegistryObject<Item> DRIED_KELP_BLOCK_ITEM = ITEMS.register("seethrough_dried_kelp_block",() -> new BlockItemBase(DRIED_KELP_BLOCK.get()));
    public static final RegistryObject<Item> DROPPER_ITEM = ITEMS.register("seethrough_dropper",() -> new BlockItemBase(DROPPER.get()));
    public static final RegistryObject<Item> EMERALD_BLOCK_ITEM = ITEMS.register("seethrough_emerald_block",() -> new BlockItemBase(EMERALD_BLOCK.get()));
    public static final RegistryObject<Item> EMERALD_ORE_ITEM = ITEMS.register("seethrough_emerald_ore",() -> new BlockItemBase(EMERALD_ORE.get()));
    public static final RegistryObject<Item> END_STONE_ITEM = ITEMS.register("seethrough_end_stone",() -> new BlockItemBase(END_STONE.get()));
    public static final RegistryObject<Item> END_STONE_BRICKS_ITEM = ITEMS.register("seethrough_end_stone_bricks",() -> new BlockItemBase(END_STONE_BRICKS.get()));
    public static final RegistryObject<Item> FIRE_CORAL_BLOCK_ITEM = ITEMS.register("seethrough_fire_coral_block",() -> new BlockItemBase(FIRE_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> FLETCHING_TABLE_ITEM = ITEMS.register("seethrough_fletching_table",() -> new BlockItemBase(FLETCHING_TABLE.get()));
    public static final RegistryObject<Item> FURNACE_ITEM = ITEMS.register("seethrough_furnace",() -> new BlockItemBase(FURNACE.get()));
    public static final RegistryObject<Item> GILDED_BLACKSTONE_ITEM = ITEMS.register("seethrough_gilded_blackstone",() -> new BlockItemBase(GILDED_BLACKSTONE.get()));
    public static final RegistryObject<Item> GLASS_ITEM = ITEMS.register("seethrough_glass",() -> new BlockItemBase(GLASS.get()));
    public static final RegistryObject<Item> GLOWSTONE_ITEM = ITEMS.register("seethrough_glowstone",() -> new BlockItemBase(GLOWSTONE.get()));
    public static final RegistryObject<Item> GOLD_BLOCK_ITEM = ITEMS.register("seethrough_gold_block",() -> new BlockItemBase(GOLD_BLOCK.get()));
    public static final RegistryObject<Item> GOLD_ORE_ITEM = ITEMS.register("seethrough_gold_ore",() -> new BlockItemBase(GOLD_ORE.get()));
    public static final RegistryObject<Item> GRANITE_ITEM = ITEMS.register("seethrough_granite",() -> new BlockItemBase(GRANITE.get()));
    public static final RegistryObject<Item> GRASS_BLOCK_ITEM = ITEMS.register("seethrough_grass_block",() -> new BlockItemBase(GRASS_BLOCK.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_ITEM = ITEMS.register("seethrough_gray_concrete",() -> new BlockItemBase(GRAY_CONCRETE.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_gray_concrete_powder",() -> new BlockItemBase(GRAY_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> GRAY_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_gray_glazed_terracotta",() -> new BlockItemBase(GRAY_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> GRAY_SHULKER_BOX_ITEM = ITEMS.register("seethrough_gray_shulker_box",() -> new BlockItemBase(GRAY_SHULKER_BOX.get()));
    public static final RegistryObject<Item> GRAY_STAINED_GLASS_ITEM = ITEMS.register("seethrough_gray_stained_glass",() -> new BlockItemBase(GRAY_STAINED_GLASS.get()));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_ITEM = ITEMS.register("seethrough_gray_terracotta",() -> new BlockItemBase(GRAY_TERRACOTTA.get()));
    public static final RegistryObject<Item> GRAY_WOOL_ITEM = ITEMS.register("seethrough_gray_wool",() -> new BlockItemBase(GRAY_WOOL.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_ITEM = ITEMS.register("seethrough_green_concrete",() -> new BlockItemBase(GREEN_CONCRETE.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_green_concrete_powder",() -> new BlockItemBase(GREEN_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> GREEN_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_green_glazed_terracotta",() -> new BlockItemBase(GREEN_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> GREEN_SHULKER_BOX_ITEM = ITEMS.register("seethrough_green_shulker_box",() -> new BlockItemBase(GREEN_SHULKER_BOX.get()));
    public static final RegistryObject<Item> GREEN_STAINED_GLASS_ITEM = ITEMS.register("seethrough_green_stained_glass",() -> new BlockItemBase(GREEN_STAINED_GLASS.get()));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_ITEM = ITEMS.register("seethrough_green_terracotta",() -> new BlockItemBase(GREEN_TERRACOTTA.get()));
    public static final RegistryObject<Item> GREEN_WOOL_ITEM = ITEMS.register("seethrough_green_wool",() -> new BlockItemBase(GREEN_WOOL.get()));
    public static final RegistryObject<Item> HAY_BALE_ITEM = ITEMS.register("seethrough_hay_bale",() -> new BlockItemBase(HAY_BALE.get()));
    public static final RegistryObject<Item> HONEY_BLOCK_ITEM = ITEMS.register("seethrough_honey_block",() -> new BlockItemBase(HONEY_BLOCK.get()));
    public static final RegistryObject<Item> HONEYCOMB_BLOCK_ITEM = ITEMS.register("seethrough_honeycomb_block",() -> new BlockItemBase(HONEYCOMB_BLOCK.get()));
    public static final RegistryObject<Item> HORN_CORAL_BLOCK_ITEM = ITEMS.register("seethrough_horn_coral_block",() -> new BlockItemBase(HORN_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> ICE_ITEM = ITEMS.register("seethrough_ice",() -> new BlockItemBase(ICE.get()));
    public static final RegistryObject<Item> INFESTED_CHISELED_STONE_BRICKS_ITEM = ITEMS.register("seethrough_infested_chiseled_stone_bricks",() -> new BlockItemBase(INFESTED_CHISELED_STONE_BRICKS.get()));
    public static final RegistryObject<Item> INFESTED_COBBLESTONE_ITEM = ITEMS.register("seethrough_infested_cobblestone",() -> new BlockItemBase(INFESTED_COBBLESTONE.get()));
    public static final RegistryObject<Item> INFESTED_CRACKED_STONE_BRICKS_ITEM = ITEMS.register("seethrough_infested_cracked_stone_bricks",() -> new BlockItemBase(INFESTED_CRACKED_STONE_BRICKS.get()));
    public static final RegistryObject<Item> INFESTED_MOSSY_STONE_BRICKS_ITEM = ITEMS.register("seethrough_infested_mossy_stone_bricks",() -> new BlockItemBase(INFESTED_MOSSY_STONE_BRICKS.get()));
    public static final RegistryObject<Item> INFESTED_STONE_ITEM = ITEMS.register("seethrough_infested_stone",() -> new BlockItemBase(INFESTED_STONE.get()));
    public static final RegistryObject<Item> INFESTED_STONE_BRICKS_ITEM = ITEMS.register("seethrough_infested_stone_bricks",() -> new BlockItemBase(INFESTED_STONE_BRICKS.get()));
    public static final RegistryObject<Item> IRON_BLOCK_ITEM = ITEMS.register("seethrough_iron_block",() -> new BlockItemBase(IRON_BLOCK.get()));
    public static final RegistryObject<Item> IRON_ORE_ITEM = ITEMS.register("seethrough_iron_ore",() -> new BlockItemBase(IRON_ORE.get()));
    public static final RegistryObject<Item> JACK_O_LANTERN_ITEM = ITEMS.register("seethrough_jack_o_lantern",() -> new BlockItemBase(JACK_O_LANTERN.get()));
    public static final RegistryObject<Item> JUKEBOX_ITEM = ITEMS.register("seethrough_jukebox",() -> new BlockItemBase(JUKEBOX.get()));
    public static final RegistryObject<Item> JUNGLE_LEAVES_ITEM = ITEMS.register("seethrough_jungle_leaves",() -> new BlockItemBase(JUNGLE_LEAVES.get()));
    public static final RegistryObject<Item> JUNGLE_LOG_ITEM = ITEMS.register("seethrough_jungle_log",() -> new BlockItemBase(JUNGLE_LOG.get()));
    public static final RegistryObject<Item> JUNGLE_PLANKS_ITEM = ITEMS.register("seethrough_jungle_planks",() -> new BlockItemBase(JUNGLE_PLANKS.get()));
    public static final RegistryObject<Item> JUNGLE_WOOD_ITEM = ITEMS.register("seethrough_jungle_wood",() -> new BlockItemBase(JUNGLE_WOOD.get()));
    public static final RegistryObject<Item> LAPIS_BLOCK_ITEM = ITEMS.register("seethrough_lapis_block",() -> new BlockItemBase(LAPIS_BLOCK.get()));
    public static final RegistryObject<Item> LAPIS_ORE_ITEM = ITEMS.register("seethrough_lapis_ore",() -> new BlockItemBase(LAPIS_ORE.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_ITEM = ITEMS.register("seethrough_light_blue_concrete",() -> new BlockItemBase(LIGHT_BLUE_CONCRETE.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_light_blue_concrete_powder",() -> new BlockItemBase(LIGHT_BLUE_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_light_blue_glazed_terracotta",() -> new BlockItemBase(LIGHT_BLUE_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_SHULKER_BOX_ITEM = ITEMS.register("seethrough_light_blue_shulker_box",() -> new BlockItemBase(LIGHT_BLUE_SHULKER_BOX.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_GLASS_ITEM = ITEMS.register("seethrough_light_blue_stained_glass",() -> new BlockItemBase(LIGHT_BLUE_STAINED_GLASS.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_ITEM = ITEMS.register("seethrough_light_blue_terracotta",() -> new BlockItemBase(LIGHT_BLUE_TERRACOTTA.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_WOOL_ITEM = ITEMS.register("seethrough_light_blue_wool",() -> new BlockItemBase(LIGHT_BLUE_WOOL.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_ITEM = ITEMS.register("seethrough_light_gray_concrete",() -> new BlockItemBase(LIGHT_GRAY_CONCRETE.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_light_gray_concrete_powder",() -> new BlockItemBase(LIGHT_GRAY_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_light_gray_glazed_terracotta",() -> new BlockItemBase(LIGHT_GRAY_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_SHULKER_BOX_ITEM = ITEMS.register("seethrough_light_gray_shulker_box",() -> new BlockItemBase(LIGHT_GRAY_SHULKER_BOX.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_STAINED_GLASS_ITEM = ITEMS.register("seethrough_light_gray_stained_glass",() -> new BlockItemBase(LIGHT_GRAY_STAINED_GLASS.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_ITEM = ITEMS.register("seethrough_light_gray_terracotta",() -> new BlockItemBase(LIGHT_GRAY_TERRACOTTA.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_WOOL_ITEM = ITEMS.register("seethrough_light_gray_wool",() -> new BlockItemBase(LIGHT_GRAY_WOOL.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_ITEM = ITEMS.register("seethrough_lime_concrete",() -> new BlockItemBase(LIME_CONCRETE.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_lime_concrete_powder",() -> new BlockItemBase(LIME_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> LIME_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_lime_glazed_terracotta",() -> new BlockItemBase(LIME_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> LIME_SHULKER_BOX_ITEM = ITEMS.register("seethrough_lime_shulker_box",() -> new BlockItemBase(LIME_SHULKER_BOX.get()));
    public static final RegistryObject<Item> LIME_STAINED_GLASS_ITEM = ITEMS.register("seethrough_lime_stained_glass",() -> new BlockItemBase(LIME_STAINED_GLASS.get()));
    public static final RegistryObject<Item> LIME_TERRACOTTA_ITEM = ITEMS.register("seethrough_lime_terracotta",() -> new BlockItemBase(LIME_TERRACOTTA.get()));
    public static final RegistryObject<Item> LIME_WOOL_ITEM = ITEMS.register("seethrough_lime_wool",() -> new BlockItemBase(LIME_WOOL.get()));
    public static final RegistryObject<Item> LODESTONE_ITEM = ITEMS.register("seethrough_lodestone",() -> new BlockItemBase(LODESTONE.get()));
    public static final RegistryObject<Item> LOOM_ITEM = ITEMS.register("seethrough_loom",() -> new BlockItemBase(LOOM.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_ITEM = ITEMS.register("seethrough_magenta_concrete",() -> new BlockItemBase(MAGENTA_CONCRETE.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_magenta_concrete_powder",() -> new BlockItemBase(MAGENTA_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> MAGENTA_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_magenta_glazed_terracotta",() -> new BlockItemBase(MAGENTA_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> MAGENTA_SHULKER_BOX_ITEM = ITEMS.register("seethrough_magenta_shulker_box",() -> new BlockItemBase(MAGENTA_SHULKER_BOX.get()));
    public static final RegistryObject<Item> MAGENTA_STAINED_GLASS_ITEM = ITEMS.register("seethrough_magenta_stained_glass",() -> new BlockItemBase(MAGENTA_STAINED_GLASS.get()));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_ITEM = ITEMS.register("seethrough_magenta_terracotta",() -> new BlockItemBase(MAGENTA_TERRACOTTA.get()));
    public static final RegistryObject<Item> MAGENTA_WOOL_ITEM = ITEMS.register("seethrough_magenta_wool",() -> new BlockItemBase(MAGENTA_WOOL.get()));
    public static final RegistryObject<Item> MAGMA_BLOCK_ITEM = ITEMS.register("seethrough_magma_block",() -> new BlockItemBase(MAGMA_BLOCK.get()));
    public static final RegistryObject<Item> MELON_ITEM = ITEMS.register("seethrough_melon",() -> new BlockItemBase(MELON.get()));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_ITEM = ITEMS.register("seethrough_mossy_cobblestone",() -> new BlockItemBase(MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> MOSSY_STONE_BRICKS_ITEM = ITEMS.register("seethrough_mossy_stone_bricks",() -> new BlockItemBase(MOSSY_STONE_BRICKS.get()));
    public static final RegistryObject<Item> MUSHROOM_STEM_ITEM = ITEMS.register("seethrough_mushroom_stem",() -> new BlockItemBase(MUSHROOM_STEM.get()));
    public static final RegistryObject<Item> MYCELIUM_ITEM = ITEMS.register("seethrough_mycelium",() -> new BlockItemBase(MYCELIUM.get()));
    public static final RegistryObject<Item> NETHER_BRICKS_ITEM = ITEMS.register("seethrough_nether_bricks",() -> new BlockItemBase(NETHER_BRICKS.get()));
    public static final RegistryObject<Item> NETHER_GOLD_ORE_ITEM = ITEMS.register("seethrough_nether_gold_ore",() -> new BlockItemBase(NETHER_GOLD_ORE.get()));
    public static final RegistryObject<Item> NETHER_QUARTZ_ORE_ITEM = ITEMS.register("seethrough_nether_quartz_ore",() -> new BlockItemBase(NETHER_QUARTZ_ORE.get()));
    public static final RegistryObject<Item> NETHER_WART_BLOCK_ITEM = ITEMS.register("seethrough_nether_wart_block",() -> new BlockItemBase(NETHER_WART_BLOCK.get()));
    public static final RegistryObject<Item> NETHERITE_BLOCK_ITEM = ITEMS.register("seethrough_netherite_block",() -> new BlockItemBase(NETHERITE_BLOCK.get()));
    public static final RegistryObject<Item> NETHERRACK_ITEM = ITEMS.register("seethrough_netherrack",() -> new BlockItemBase(NETHERRACK.get()));
    public static final RegistryObject<Item> NOTE_BLOCK_ITEM = ITEMS.register("seethrough_note_block",() -> new BlockItemBase(NOTE_BLOCK.get()));
    public static final RegistryObject<Item> OAK_LEAVES_ITEM = ITEMS.register("seethrough_oak_leaves",() -> new BlockItemBase(OAK_LEAVES.get()));
    public static final RegistryObject<Item> OAK_LOG_ITEM = ITEMS.register("seethrough_oak_log",() -> new BlockItemBase(OAK_LOG.get()));
    public static final RegistryObject<Item> OAK_PLANKS_ITEM = ITEMS.register("seethrough_oak_planks",() -> new BlockItemBase(OAK_PLANKS.get()));
    public static final RegistryObject<Item> OAK_WOOD_ITEM = ITEMS.register("seethrough_oak_wood",() -> new BlockItemBase(OAK_WOOD.get()));
    public static final RegistryObject<Item> OBSERVER_ITEM = ITEMS.register("seethrough_observer",() -> new BlockItemBase(OBSERVER.get()));
    public static final RegistryObject<Item> OBSIDIAN_ITEM = ITEMS.register("seethrough_obsidian",() -> new BlockItemBase(OBSIDIAN.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_ITEM = ITEMS.register("seethrough_orange_concrete",() -> new BlockItemBase(ORANGE_CONCRETE.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_orange_concrete_powder",() -> new BlockItemBase(ORANGE_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> ORANGE_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_orange_glazed_terracotta",() -> new BlockItemBase(ORANGE_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> ORANGE_SHULKER_BOX_ITEM = ITEMS.register("seethrough_orange_shulker_box",() -> new BlockItemBase(ORANGE_SHULKER_BOX.get()));
    public static final RegistryObject<Item> ORANGE_STAINED_GLASS_ITEM = ITEMS.register("seethrough_orange_stained_glass",() -> new BlockItemBase(ORANGE_STAINED_GLASS.get()));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_ITEM = ITEMS.register("seethrough_orange_terracotta",() -> new BlockItemBase(ORANGE_TERRACOTTA.get()));
    public static final RegistryObject<Item> ORANGE_WOOL_ITEM = ITEMS.register("seethrough_orange_wool",() -> new BlockItemBase(ORANGE_WOOL.get()));
    public static final RegistryObject<Item> PACKED_ICE_ITEM = ITEMS.register("seethrough_packed_ice",() -> new BlockItemBase(PACKED_ICE.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_ITEM = ITEMS.register("seethrough_pink_concrete",() -> new BlockItemBase(PINK_CONCRETE.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_pink_concrete_powder",() -> new BlockItemBase(PINK_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> PINK_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_pink_glazed_terracotta",() -> new BlockItemBase(PINK_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> PINK_SHULKER_BOX_ITEM = ITEMS.register("seethrough_pink_shulker_box",() -> new BlockItemBase(PINK_SHULKER_BOX.get()));
    public static final RegistryObject<Item> PINK_STAINED_GLASS_ITEM = ITEMS.register("seethrough_pink_stained_glass",() -> new BlockItemBase(PINK_STAINED_GLASS.get()));
    public static final RegistryObject<Item> PINK_TERRACOTTA_ITEM = ITEMS.register("seethrough_pink_terracotta",() -> new BlockItemBase(PINK_TERRACOTTA.get()));
    public static final RegistryObject<Item> PINK_WOOL_ITEM = ITEMS.register("seethrough_pink_wool",() -> new BlockItemBase(PINK_WOOL.get()));
    public static final RegistryObject<Item> PISTON_ITEM = ITEMS.register("seethrough_piston",() -> new BlockItemBase(PISTON.get()));
    public static final RegistryObject<Item> PODZOL_ITEM = ITEMS.register("seethrough_podzol",() -> new BlockItemBase(PODZOL.get()));
    public static final RegistryObject<Item> POLISHED_ANDESITE_ITEM = ITEMS.register("seethrough_polished_andesite",() -> new BlockItemBase(POLISHED_ANDESITE.get()));
    public static final RegistryObject<Item> POLISHED_BASALT_ITEM = ITEMS.register("seethrough_polished_basalt",() -> new BlockItemBase(POLISHED_BASALT.get()));
    public static final RegistryObject<Item> POLISHED_BLACKSTONE_ITEM = ITEMS.register("seethrough_polished_blackstone",() -> new BlockItemBase(POLISHED_BLACKSTONE.get()));
    public static final RegistryObject<Item> POLISHED_BLACKSTONE_BRICKS_ITEM = ITEMS.register("seethrough_polished_blackstone_bricks",() -> new BlockItemBase(POLISHED_BLACKSTONE_BRICKS.get()));
    public static final RegistryObject<Item> POLISHED_DIORITE_ITEM = ITEMS.register("seethrough_polished_diorite",() -> new BlockItemBase(POLISHED_DIORITE.get()));
    public static final RegistryObject<Item> POLISHED_GRANITE_ITEM = ITEMS.register("seethrough_polished_granite",() -> new BlockItemBase(POLISHED_GRANITE.get()));
    public static final RegistryObject<Item> PRISMARINE_ITEM = ITEMS.register("seethrough_prismarine",() -> new BlockItemBase(PRISMARINE.get()));
    public static final RegistryObject<Item> PRISMARINE_BRICKS_ITEM = ITEMS.register("seethrough_prismarine_bricks",() -> new BlockItemBase(PRISMARINE_BRICKS.get()));
    public static final RegistryObject<Item> PUMPKIN_ITEM = ITEMS.register("seethrough_pumpkin",() -> new BlockItemBase(PUMPKIN.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_ITEM = ITEMS.register("seethrough_purple_concrete",() -> new BlockItemBase(PURPLE_CONCRETE.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_purple_concrete_powder",() -> new BlockItemBase(PURPLE_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> PURPLE_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_purple_glazed_terracotta",() -> new BlockItemBase(PURPLE_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> PURPLE_SHULKER_BOX_ITEM = ITEMS.register("seethrough_purple_shulker_box",() -> new BlockItemBase(PURPLE_SHULKER_BOX.get()));
    public static final RegistryObject<Item> PURPLE_STAINED_GLASS_ITEM = ITEMS.register("seethrough_purple_stained_glass",() -> new BlockItemBase(PURPLE_STAINED_GLASS.get()));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_ITEM = ITEMS.register("seethrough_purple_terracotta",() -> new BlockItemBase(PURPLE_TERRACOTTA.get()));
    public static final RegistryObject<Item> PURPLE_WOOL_ITEM = ITEMS.register("seethrough_purple_wool",() -> new BlockItemBase(PURPLE_WOOL.get()));
    public static final RegistryObject<Item> PURPUR_BLOCK_ITEM = ITEMS.register("seethrough_purpur_block",() -> new BlockItemBase(PURPUR_BLOCK.get()));
    public static final RegistryObject<Item> PURPUR_PILLAR_ITEM = ITEMS.register("seethrough_purpur_pillar",() -> new BlockItemBase(PURPUR_PILLAR.get()));
    public static final RegistryObject<Item> QUARTZ_BLOCK_ITEM = ITEMS.register("seethrough_quartz_block",() -> new BlockItemBase(QUARTZ_BLOCK.get()));
    public static final RegistryObject<Item> QUARTZ_BRICKS_ITEM = ITEMS.register("seethrough_quartz_bricks",() -> new BlockItemBase(QUARTZ_BRICKS.get()));
    public static final RegistryObject<Item> QUARTZ_PILLAR_ITEM = ITEMS.register("seethrough_quartz_pillar",() -> new BlockItemBase(QUARTZ_PILLAR.get()));
    public static final RegistryObject<Item> RED_CONCRETE_ITEM = ITEMS.register("seethrough_red_concrete",() -> new BlockItemBase(RED_CONCRETE.get()));
    public static final RegistryObject<Item> RED_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_red_concrete_powder",() -> new BlockItemBase(RED_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> RED_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_red_glazed_terracotta",() -> new BlockItemBase(RED_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RED_MUSHROOM_BLOCK_ITEM = ITEMS.register("seethrough_red_mushroom_block",() -> new BlockItemBase(RED_MUSHROOM_BLOCK.get()));
    public static final RegistryObject<Item> RED_NETHER_BRICKS_ITEM = ITEMS.register("seethrough_red_nether_bricks",() -> new BlockItemBase(RED_NETHER_BRICKS.get()));
    public static final RegistryObject<Item> RED_SAND_ITEM = ITEMS.register("seethrough_red_sand",() -> new BlockItemBase(RED_SAND.get()));
    public static final RegistryObject<Item> RED_SANDSTONE_ITEM = ITEMS.register("seethrough_red_sandstone",() -> new BlockItemBase(RED_SANDSTONE.get()));
    public static final RegistryObject<Item> RED_SHULKER_BOX_ITEM = ITEMS.register("seethrough_red_shulker_box",() -> new BlockItemBase(RED_SHULKER_BOX.get()));
    public static final RegistryObject<Item> RED_STAINED_GLASS_ITEM = ITEMS.register("seethrough_red_stained_glass",() -> new BlockItemBase(RED_STAINED_GLASS.get()));
    public static final RegistryObject<Item> RED_TERRACOTTA_ITEM = ITEMS.register("seethrough_red_terracotta",() -> new BlockItemBase(RED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RED_WOOL_ITEM = ITEMS.register("seethrough_red_wool",() -> new BlockItemBase(RED_WOOL.get()));
    public static final RegistryObject<Item> REDSTONE_BLOCK_ITEM = ITEMS.register("seethrough_redstone_block",() -> new BlockItemBase(REDSTONE_BLOCK.get()));
    public static final RegistryObject<Item> REDSTONE_LAMP_ITEM = ITEMS.register("seethrough_redstone_lamp",() -> new BlockItemBase(REDSTONE_LAMP.get()));
    public static final RegistryObject<Item> REDSTONE_ORE_ITEM = ITEMS.register("seethrough_redstone_ore",() -> new BlockItemBase(REDSTONE_ORE.get()));
    public static final RegistryObject<Item> REPEATING_COMMAND_BLOCK_ITEM = ITEMS.register("seethrough_repeating_command_block",() -> new BlockItemBase(REPEATING_COMMAND_BLOCK.get()));
    public static final RegistryObject<Item> RESPAWN_ANCHOR_ITEM = ITEMS.register("seethrough_respawn_anchor",() -> new BlockItemBase(RESPAWN_ANCHOR.get()));
    public static final RegistryObject<Item> SAND_ITEM = ITEMS.register("seethrough_sand",() -> new BlockItemBase(SAND.get()));
    public static final RegistryObject<Item> SANDSTONE_ITEM = ITEMS.register("seethrough_sandstone",() -> new BlockItemBase(SANDSTONE.get()));
    public static final RegistryObject<Item> SEA_LANTERN_ITEM = ITEMS.register("seethrough_sea_lantern",() -> new BlockItemBase(SEA_LANTERN.get()));
    public static final RegistryObject<Item> SHROOMLIGHT_ITEM = ITEMS.register("seethrough_shroomlight",() -> new BlockItemBase(SHROOMLIGHT.get()));
    public static final RegistryObject<Item> SHULKER_BOX_ITEM = ITEMS.register("seethrough_shulker_box",() -> new BlockItemBase(SHULKER_BOX.get()));
    public static final RegistryObject<Item> SLIME_BLOCK_ITEM = ITEMS.register("seethrough_slime_block",() -> new BlockItemBase(SLIME_BLOCK.get()));
    public static final RegistryObject<Item> SMITHING_TABLE_ITEM = ITEMS.register("seethrough_smithing_table",() -> new BlockItemBase(SMITHING_TABLE.get()));
    public static final RegistryObject<Item> SMOKER_ITEM = ITEMS.register("seethrough_smoker",() -> new BlockItemBase(SMOKER.get()));
    public static final RegistryObject<Item> SMOOTH_QUARTZ_ITEM = ITEMS.register("seethrough_smooth_quartz",() -> new BlockItemBase(SMOOTH_QUARTZ.get()));
    public static final RegistryObject<Item> SMOOTH_RED_SANDSTONE_ITEM = ITEMS.register("seethrough_smooth_red_sandstone",() -> new BlockItemBase(SMOOTH_RED_SANDSTONE.get()));
    public static final RegistryObject<Item> SMOOTH_SANDSTONE_ITEM = ITEMS.register("seethrough_smooth_sandstone",() -> new BlockItemBase(SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Item> SMOOTH_STONE_ITEM = ITEMS.register("seethrough_smooth_stone",() -> new BlockItemBase(SMOOTH_STONE.get()));
    public static final RegistryObject<Item> SNOW_BLOCK_ITEM = ITEMS.register("seethrough_snow_block",() -> new BlockItemBase(SNOW_BLOCK.get()));
    public static final RegistryObject<Item> SOUL_SAND_ITEM = ITEMS.register("seethrough_soul_sand",() -> new BlockItemBase(SOUL_SAND.get()));
    public static final RegistryObject<Item> SOUL_SOIL_ITEM = ITEMS.register("seethrough_soul_soil",() -> new BlockItemBase(SOUL_SOIL.get()));
    public static final RegistryObject<Item> SPAWNER_ITEM = ITEMS.register("seethrough_spawner",() -> new BlockItemBase(SPAWNER.get()));
    public static final RegistryObject<Item> SPONGE_ITEM = ITEMS.register("seethrough_sponge",() -> new BlockItemBase(SPONGE.get()));
    public static final RegistryObject<Item> SPRUCE_LEAVES_ITEM = ITEMS.register("seethrough_spruce_leaves",() -> new BlockItemBase(SPRUCE_LEAVES.get()));
    public static final RegistryObject<Item> SPRUCE_LOG_ITEM = ITEMS.register("seethrough_spruce_log",() -> new BlockItemBase(SPRUCE_LOG.get()));
    public static final RegistryObject<Item> SPRUCE_PLANKS_ITEM = ITEMS.register("seethrough_spruce_planks",() -> new BlockItemBase(SPRUCE_PLANKS.get()));
    public static final RegistryObject<Item> SPRUCE_WOOD_ITEM = ITEMS.register("seethrough_spruce_wood",() -> new BlockItemBase(SPRUCE_WOOD.get()));
    public static final RegistryObject<Item> STICKY_PISTON_ITEM = ITEMS.register("seethrough_sticky_piston",() -> new BlockItemBase(STICKY_PISTON.get()));
    public static final RegistryObject<Item> STONE_ITEM = ITEMS.register("seethrough_stone",() -> new BlockItemBase(STONE.get()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_LOG_ITEM = ITEMS.register("seethrough_stripped_acacia_log",() -> new BlockItemBase(STRIPPED_ACACIA_LOG.get()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_WOOD_ITEM = ITEMS.register("seethrough_stripped_acacia_wood",() -> new BlockItemBase(STRIPPED_ACACIA_WOOD.get()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_LOG_ITEM = ITEMS.register("seethrough_stripped_birch_log",() -> new BlockItemBase(STRIPPED_BIRCH_LOG.get()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_WOOD_ITEM = ITEMS.register("seethrough_stripped_birch_wood",() -> new BlockItemBase(STRIPPED_BIRCH_WOOD.get()));
    public static final RegistryObject<Item> STRIPPED_CRIMSON_HYPHAE_ITEM = ITEMS.register("seethrough_stripped_crimson_hyphae",() -> new BlockItemBase(STRIPPED_CRIMSON_HYPHAE.get()));
    public static final RegistryObject<Item> STRIPPED_CRIMSON_STEM_ITEM = ITEMS.register("seethrough_stripped_crimson_stem",() -> new BlockItemBase(STRIPPED_CRIMSON_STEM.get()));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_LOG_ITEM = ITEMS.register("seethrough_stripped_dark_oak_log",() -> new BlockItemBase(STRIPPED_DARK_OAK_LOG.get()));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_WOOD_ITEM = ITEMS.register("seethrough_stripped_dark_oak_wood",() -> new BlockItemBase(STRIPPED_DARK_OAK_WOOD.get()));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_LOG_ITEM = ITEMS.register("seethrough_stripped_jungle_log",() -> new BlockItemBase(STRIPPED_JUNGLE_LOG.get()));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_WOOD_ITEM = ITEMS.register("seethrough_stripped_jungle_wood",() -> new BlockItemBase(STRIPPED_JUNGLE_WOOD.get()));
    public static final RegistryObject<Item> STRIPPED_OAK_LOG_ITEM = ITEMS.register("seethrough_stripped_oak_log",() -> new BlockItemBase(STRIPPED_OAK_LOG.get()));
    public static final RegistryObject<Item> STRIPPED_OAK_WOOD_ITEM = ITEMS.register("seethrough_stripped_oak_wood",() -> new BlockItemBase(STRIPPED_OAK_WOOD.get()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LOG_ITEM = ITEMS.register("seethrough_stripped_spruce_log",() -> new BlockItemBase(STRIPPED_SPRUCE_LOG.get()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_WOOD_ITEM = ITEMS.register("seethrough_stripped_spruce_wood",() -> new BlockItemBase(STRIPPED_SPRUCE_WOOD.get()));
    public static final RegistryObject<Item> STRIPPED_WARPED_HYPHAE_ITEM = ITEMS.register("seethrough_stripped_warped_hyphae",() -> new BlockItemBase(STRIPPED_WARPED_HYPHAE.get()));
    public static final RegistryObject<Item> STRIPPED_WARPED_STEM_ITEM = ITEMS.register("seethrough_stripped_warped_stem",() -> new BlockItemBase(STRIPPED_WARPED_STEM.get()));
    public static final RegistryObject<Item> STRUCTURE_BLOCK_ITEM = ITEMS.register("seethrough_structure_block",() -> new BlockItemBase(STRUCTURE_BLOCK.get()));
    public static final RegistryObject<Item> TARGET_ITEM = ITEMS.register("seethrough_target",() -> new BlockItemBase(TARGET.get()));
    public static final RegistryObject<Item> TERRACOTTA_ITEM = ITEMS.register("seethrough_terracotta",() -> new BlockItemBase(TERRACOTTA.get()));
    public static final RegistryObject<Item> TNT_ITEM = ITEMS.register("seethrough_tnt",() -> new BlockItemBase(TNT.get()));
    public static final RegistryObject<Item> TUBE_CORAL_BLOCK_ITEM = ITEMS.register("seethrough_tube_coral_block",() -> new BlockItemBase(TUBE_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> WARPED_HYPHAE_ITEM = ITEMS.register("seethrough_warped_hyphae",() -> new BlockItemBase(WARPED_HYPHAE.get()));
    public static final RegistryObject<Item> WARPED_NYLIUM_ITEM = ITEMS.register("seethrough_warped_nylium",() -> new BlockItemBase(WARPED_NYLIUM.get()));
    public static final RegistryObject<Item> WARPED_PLANKS_ITEM = ITEMS.register("seethrough_warped_planks",() -> new BlockItemBase(WARPED_PLANKS.get()));
    public static final RegistryObject<Item> WARPED_STEM_ITEM = ITEMS.register("seethrough_warped_stem",() -> new BlockItemBase(WARPED_STEM.get()));
    public static final RegistryObject<Item> WARPED_WART_BLOCK_ITEM = ITEMS.register("seethrough_warped_wart_block",() -> new BlockItemBase(WARPED_WART_BLOCK.get()));
    public static final RegistryObject<Item> WET_SPONGE_ITEM = ITEMS.register("seethrough_wet_sponge",() -> new BlockItemBase(WET_SPONGE.get()));
    public static final RegistryObject<Item> WHITE_CONCRETE_ITEM = ITEMS.register("seethrough_white_concrete",() -> new BlockItemBase(WHITE_CONCRETE.get()));
    public static final RegistryObject<Item> WHITE_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_white_concrete_powder",() -> new BlockItemBase(WHITE_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> WHITE_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_white_glazed_terracotta",() -> new BlockItemBase(WHITE_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> WHITE_SHULKER_BOX_ITEM = ITEMS.register("seethrough_white_shulker_box",() -> new BlockItemBase(WHITE_SHULKER_BOX.get()));
    public static final RegistryObject<Item> WHITE_STAINED_GLASS_ITEM = ITEMS.register("seethrough_white_stained_glass",() -> new BlockItemBase(WHITE_STAINED_GLASS.get()));
    public static final RegistryObject<Item> WHITE_TERRACOTTA_ITEM = ITEMS.register("seethrough_white_terracotta",() -> new BlockItemBase(WHITE_TERRACOTTA.get()));
    public static final RegistryObject<Item> WHITE_WOOL_ITEM = ITEMS.register("seethrough_white_wool",() -> new BlockItemBase(WHITE_WOOL.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_ITEM = ITEMS.register("seethrough_yellow_concrete",() -> new BlockItemBase(YELLOW_CONCRETE.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_POWDER_ITEM = ITEMS.register("seethrough_yellow_concrete_powder",() -> new BlockItemBase(YELLOW_CONCRETE_POWDER.get()));
    public static final RegistryObject<Item> YELLOW_GLAZED_TERRACOTTA_ITEM = ITEMS.register("seethrough_yellow_glazed_terracotta",() -> new BlockItemBase(YELLOW_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> YELLOW_SHULKER_BOX_ITEM = ITEMS.register("seethrough_yellow_shulker_box",() -> new BlockItemBase(YELLOW_SHULKER_BOX.get()));
    public static final RegistryObject<Item> YELLOW_STAINED_GLASS_ITEM = ITEMS.register("seethrough_yellow_stained_glass",() -> new BlockItemBase(YELLOW_STAINED_GLASS.get()));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_ITEM = ITEMS.register("seethrough_yellow_terracotta",() -> new BlockItemBase(YELLOW_TERRACOTTA.get()));
    public static final RegistryObject<Item> YELLOW_WOOL_ITEM = ITEMS.register("seethrough_yellow_wool",() -> new BlockItemBase(YELLOW_WOOL.get()));

}
