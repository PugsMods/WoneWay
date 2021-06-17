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
     _LEAVES"seethrough_acacia_leaves"
     _LOG"seethrough_acacia_log"
     _PLANKS"seethrough_acacia_planks"
     _WOOD"seethrough_acacia_wood"
     T_DEBRIS"seethrough_ancient_debris"
     TE"seethrough_andesite"
     "seethrough_barrel"
     "seethrough_basalt"
     K"seethrough_bedrock"
     ST"seethrough_bee_nest"
     E"seethrough_beehive"
     LEAVES"seethrough_birch_leaves"
     LOG"seethrough_birch_log"
     PLANKS"seethrough_birch_planks"
     WOOD"seethrough_birch_wood"
     CONCRETE"seethrough_black_concrete"
     CONCRETE_POWDER"seethrough_black_concrete_powder"
     GLAZED_TERRACOTTA"seethrough_black_glazed_terracotta"
     SHULKER_BOX"seethrough_black_shulker_box"
     STAINED_GLASS"seethrough_black_stained_glass"
     TERRACOTTA"seethrough_black_terracotta"
     WOOL"seethrough_black_wool"
     TONE"seethrough_blackstone"
     FURNACE"seethrough_blast_furnace"
     ONCRETE"seethrough_blue_concrete"
     ONCRETE_POWDER"seethrough_blue_concrete_powder"
     LAZED_TERRACOTTA"seethrough_blue_glazed_terracotta"
     CE"seethrough_blue_ice"
     HULKER_BOX"seethrough_blue_shulker_box"
     TAINED_GLASS"seethrough_blue_stained_glass"
     ERRACOTTA"seethrough_blue_terracotta"
     OOL"seethrough_blue_wool"
     LOCK"seethrough_bone_block"
     ELF"seethrough_bookshelf"
     CORAL_BLOCK"seethrough_brain_coral_block"
     "seethrough_bricks"
     CONCRETE"seethrough_brown_concrete"
     CONCRETE_POWDER"seethrough_brown_concrete_powder"
     GLAZED_TERRACOTTA"seethrough_brown_glazed_terracotta"
     MUSHROOM_BLOCK"seethrough_brown_mushroom_block"
     SHULKER_BOX"seethrough_brown_shulker_box"
     STAINED_GLASS"seethrough_brown_stained_glass"
     TERRACOTTA"seethrough_brown_terracotta"
     WOOL"seethrough_brown_wool"
     _CORAL_BLOCK"seethrough_bubble_coral_block"
     RAPHY_TABLE"seethrough_cartography_table"
     _PUMPKIN"seethrough_carved_pumpkin"
     COMMAND_BLOCK"seethrough_chain_command_block"
     ED_NETHER_BRICKS"seethrough_chiseled_nether_bricks"
     ED_POLISHED_BLACKSTONE"seethrough_chiseled_polished_blackstone"
     ED_RED_SANDSTONE"seethrough_chiseled_red_sandstone"
     ED_SANDSTONE"seethrough_chiseled_sandstone"
     ED_STONE_BRICKS"seethrough_chiseled_stone_bricks"
     LOCK"seethrough_clay_block"
     LOCK"seethrough_coal_block"
     RE"seethrough_coal_ore"
     _DIRT"seethrough_coarse_dirt"
     STONE"seethrough_cobblestone"
     D_BLOCK"seethrough_command_block"
     D_NETHER_BRICKS"seethrough_cracked_nether_bricks"
     D_POLISHED_BLACKSTONE_BRICKS"seethrough_cracked_polished_blackstone_bricks"
     D_STONE_BRICKS"seethrough_cracked_stone_bricks"
     NG_TABLE"seethrough_crafting_table"
     N_HYPHAE"seethrough_crimson_hyphae"
     N_NYLIUM"seethrough_crimson_nylium"
     N_PLANKS"seethrough_crimson_planks"
     N_STEM"seethrough_crimson_stem"
     _OBSIDIAN"seethrough_crying_obsidian"
     D_SANDSTONE"seethrough_cut_red_sandstone"
     NDSTONE"seethrough_cut_sandstone"
     ONCRETE"seethrough_cyan_concrete"
     ONCRETE_POWDER"seethrough_cyan_concrete_powder"
     CYAN_GLAZED_TERRACOTTA"seethrough_cyan_glazed_terracotta"
     CYAN_SHULKER_BOX"seethrough_cyan_shulker_box"
     CYAN_STAINED_GLASS"seethrough_cyan_stained_glass"
     CYAN_TERRACOTTA"seethrough_cyan_terracotta"
     CYAN_WOOL"seethrough_cyan_wool"
     DARK_OAK_LEAVES"seethrough_dark_oak_leaves"
     DARK_OAK_LOG"seethrough_dark_oak_log"
     DARK_OAK_PLANKS"seethrough_dark_oak_planks"
     DARK_OAK_WOOD"seethrough_dark_oak_wood"
     DARK_PRISMARINE"seethrough_dark_prismarine"
     DEAD_BRAIN_CORAL_BLOCK"seethrough_dead_brain_coral_block"
     DEAD_BUBBLE_CORAL_BLOCK"seethrough_dead_bubble_coral_block"
     DEAD_FIRE_CORAL_BLOCK"seethrough_dead_fire_coral_block"
     DEAD_TUBE_CORAL_BLOCK"seethrough_dead_tube_coral_block"
     DIAMOND_BLOCK"seethrough_diamond_block"
     DIAMOND_ORE"seethrough_diamond_ore"
     DIORITE"seethrough_diorite"
     DIRT"seethrough_dirt"
     DISPENSER"seethrough_dispenser"
     DRIED_KELP_BLOCK"seethrough_dried_kelp_block"
     DROPPER"seethrough_dropper"
     EMERALD_BLOCK"seethrough_emerald_block"
     EMERALD_ORE"seethrough_emerald_ore"
     END_STONE"seethrough_end_stone"
     END_STONE_BRICKS"seethrough_end_stone_bricks"
     FIRE_CORAL_BLOCK"seethrough_fire_coral_block"
     FLETCHING_TABLE"seethrough_fletching_table"
     FURNACE"seethrough_furnace"
     GILDED_BLACKSTONE"seethrough_gilded_blackstone"
     GLASS"seethrough_glass"
     GLOWSTONE"seethrough_glowstone"
     GOLD_BLOCK"seethrough_gold_block"
     GOLD_ORE"seethrough_gold_ore"
     GRANITE"seethrough_granite"
     GRASS_BLOCK"seethrough_grass_block"
     GRAY_CONCRETE"seethrough_gray_concrete"
     GRAY_CONCRETE_POWDER"seethrough_gray_concrete_powder"
     GRAY_GLAZED_TERRACOTTA"seethrough_gray_glazed_terracotta"
     GRAY_SHULKER_BOX"seethrough_gray_shulker_box"
     GRAY_STAINED_GLASS"seethrough_gray_stained_glass"
     GRAY_TERRACOTTA"seethrough_gray_terracotta"
     GRAY_WOOL"seethrough_gray_wool"
     GREEN_CONCRETE"seethrough_green_concrete"
     GREEN_CONCRETE_POWDER"seethrough_green_concrete_powder"
     GREEN_GLAZED_TERRACOTTA"seethrough_green_glazed_terracotta"
     GREEN_SHULKER_BOX"seethrough_green_shulker_box"
     GREEN_STAINED_GLASS"seethrough_green_stained_glass"
     GREEN_TERRACOTTA"seethrough_green_terracotta"
     GREEN_WOOL"seethrough_green_wool"
     HAY_BALE"seethrough_hay_bale"
     HONEY_BLOCK"seethrough_honey_block"
     HONEYCOMB_BLOCK"seethrough_honeycomb_block"
     HORN_CORAL_BLOCK"seethrough_horn_coral_block"
     ICE"seethrough_ice"
     INFESTED_CHISELED_STONE_BRICKS"seethrough_infested_chiseled_stone_bricks"
     INFESTED_COBBLESTONE"seethrough_infested_cobblestone"
     INFESTED_CRACKED_STONE_BRICKS"seethrough_infested_cracked_stone_bricks"
     INFESTED_MOSSY_STONE_BRICKS"seethrough_infested_mossy_stone_bricks"
     INFESTED_STONE"seethrough_infested_stone"
     INFESTED_STONE_BRICKS"seethrough_infested_stone_bricks"
     IRON_BLOCK"seethrough_iron_block"
     IRON_ORE"seethrough_iron_ore"
     JACK_O_LANTERN"seethrough_jack_o_lantern"
     JUKEBOX"seethrough_jukebox"
     JUNGLE_LEAVES"seethrough_jungle_leaves"
     JUNGLE_LOG"seethrough_jungle_log"
     JUNGLE_PLANKS"seethrough_jungle_planks"
     JUNGLE_WOOD"seethrough_jungle_wood"
     LAPIS_BLOCK"seethrough_lapis_block"
     LAPIS_ORE"seethrough_lapis_ore"
     LIGHT_BLUE_CONCRETE"seethrough_light_blue_concrete"
     LIGHT_BLUE_CONCRETE_POWDER"seethrough_light_blue_concrete_powder"
     LIGHT_BLUE_GLAZED_TERRACOTTA"seethrough_light_blue_glazed_terracotta"
     LIGHT_BLUE_SHULKER_BOX"seethrough_light_blue_shulker_box"
     LIGHT_BLUE_STAINED_GLASS"seethrough_light_blue_stained_glass"
     LIGHT_BLUE_TERRACOTTA"seethrough_light_blue_terracotta"
     LIGHT_BLUE_WOOL"seethrough_light_blue_wool"
     LIGHT_GRAY_CONCRETE"seethrough_light_gray_concrete"
     LIGHT_GRAY_CONCRETE_POWDER"seethrough_light_gray_concrete_powder"
     LIGHT_GRAY_GLAZED_TERRACOTTA"seethrough_light_gray_glazed_terracotta"
     LIGHT_GRAY_SHULKER_BOX"seethrough_light_gray_shulker_box"
     LIGHT_GRAY_STAINED_GLASS"seethrough_light_gray_stained_glass"
     LIGHT_GRAY_TERRACOTTA"seethrough_light_gray_terracotta"
     LIGHT_GRAY_WOOL"seethrough_light_gray_wool"
     LIME_CONCRETE"seethrough_lime_concrete"
     LIME_CONCRETE_POWDER"seethrough_lime_concrete_powder"
     LIME_GLAZED_TERRACOTTA"seethrough_lime_glazed_terracotta"
     LIME_SHULKER_BOX"seethrough_lime_shulker_box"
     LIME_STAINED_GLASS"seethrough_lime_stained_glass"
     LIME_TERRACOTTA"seethrough_lime_terracotta"
     LIME_WOOL"seethrough_lime_wool"
     LODESTONE"seethrough_lodestone"
     LOOM"seethrough_loom"
     MAGENTA_CONCRETE"seethrough_magenta_concrete"
     MAGENTA_CONCRETE_POWDER"seethrough_magenta_concrete_powder"
     MAGENTA_GLAZED_TERRACOTTA"seethrough_magenta_glazed_terracotta"
     MAGENTA_SHULKER_BOX"seethrough_magenta_shulker_box"
     MAGENTA_STAINED_GLASS"seethrough_magenta_stained_glass"
     MAGENTA_TERRACOTTA"seethrough_magenta_terracotta"
     MAGENTA_WOOL"seethrough_magenta_wool"
     MAGMA_BLOCK"seethrough_magma_block"
     MELON"seethrough_melon"
     MOSSY_COBBLESTONE"seethrough_mossy_cobblestone"
     MOSSY_STONE_BRICKS"seethrough_mossy_stone_bricks"
     MUSHROOM_STEM"seethrough_mushroom_stem"
     MYCELIUM"seethrough_mycelium"
     NETHER_BRICKS"seethrough_nether_bricks"
     NETHER_GOLD_ORE"seethrough_nether_gold_ore"
     NETHER_QUARTZ_ORE"seethrough_nether_quartz_ore"
     NETHER_WART_BLOCK"seethrough_nether_wart_block"
     NETHERITE_BLOCK"seethrough_netherite_block"
     NETHERRACK"seethrough_netherrack"
     NOTE_BLOCK"seethrough_note_block"
     OAK_LEAVES"seethrough_oak_leaves"
     OAK_LOG"seethrough_oak_log"
     OAK_PLANKS"seethrough_oak_planks"
     OAK_WOOD"seethrough_oak_wood"
     OBSERVER"seethrough_observer"
     OBSIDIAN"seethrough_obsidian"
     ORANGE_CONCRETE"seethrough_orange_concrete"
     ORANGE_CONCRETE_POWDER"seethrough_orange_concrete_powder"
     ORANGE_GLAZED_TERRACOTTA"seethrough_orange_glazed_terracotta"
     ORANGE_SHULKER_BOX"seethrough_orange_shulker_box"
     ORANGE_STAINED_GLASS"seethrough_orange_stained_glass"
     ORANGE_TERRACOTTA"seethrough_orange_terracotta"
     ORANGE_WOOL"seethrough_orange_wool"
     PACKED_ICE"seethrough_packed_ice"
     PINK_CONCRETE"seethrough_pink_concrete"
     PINK_CONCRETE_POWDER"seethrough_pink_concrete_powder"
     PINK_GLAZED_TERRACOTTA"seethrough_pink_glazed_terracotta"
     PINK_SHULKER_BOX"seethrough_pink_shulker_box"
     PINK_STAINED_GLASS"seethrough_pink_stained_glass"
     PINK_TERRACOTTA"seethrough_pink_terracotta"
     PINK_WOOL"seethrough_pink_wool"
     PISTON"seethrough_piston"
     PODZOL"seethrough_podzol"
     POLISHED_ANDESITE"seethrough_polished_andesite"
     POLISHED_BASALT"seethrough_polished_basalt"
     POLISHED_BLACKSTONE"seethrough_polished_blackstone"
     POLISHED_BLACKSTONE_BRICKS"seethrough_polished_blackstone_bricks"
     POLISHED_DIORITE"seethrough_polished_diorite"
     POLISHED_GRANITE"seethrough_polished_granite"
     PRISMARINE"seethrough_prismarine"
     PRISMARINE_BRICKS"seethrough_prismarine_bricks"
     PUMPKIN"seethrough_pumpkin"
     PURPLE_CONCRETE"seethrough_purple_concrete"
     PURPLE_CONCRETE_POWDER"seethrough_purple_concrete_powder"
     PURPLE_GLAZED_TERRACOTTA"seethrough_purple_glazed_terracotta"
     PURPLE_SHULKER_BOX"seethrough_purple_shulker_box"
     PURPLE_STAINED_GLASS"seethrough_purple_stained_glass"
     PURPLE_TERRACOTTA"seethrough_purple_terracotta"
     PURPLE_WOOL"seethrough_purple_wool"
     PURPUR_BLOCK"seethrough_purpur_block"
     PURPUR_PILLAR"seethrough_purpur_pillar"
     QUARTZ_BLOCK"seethrough_quartz_block"
     QUARTZ_BRICKS"seethrough_quartz_bricks"
     QUARTZ_PILLAR"seethrough_quartz_pillar"
     RED_CONCRETE"seethrough_red_concrete"
     RED_CONCRETE_POWDER"seethrough_red_concrete_powder"
     RED_GLAZED_TERRACOTTA"seethrough_red_glazed_terracotta"
     RED_MUSHROOM_BLOCK"seethrough_red_mushroom_block"
     RED_NETHER_BRICKS"seethrough_red_nether_bricks"
     RED_SAND"seethrough_red_sand"
     RED_SANDSTONE"seethrough_red_sandstone"
     RED_SHULKER_BOX"seethrough_red_shulker_box"
     RED_STAINED_GLASS"seethrough_red_stained_glass"
     RED_TERRACOTTA"seethrough_red_terracotta"
     RED_WOOL"seethrough_red_wool"
     REDSTONE_BLOCK"seethrough_redstone_block"
     REDSTONE_LAMP"seethrough_redstone_lamp"
     REDSTONE_ORE"seethrough_redstone_ore"
     REPEATING_COMMAND_BLOCK"seethrough_repeating_command_block"
     RESPAWN_ANCHOR"seethrough_respawn_anchor"
     SAND"seethrough_sand"
     SANDSTONE"seethrough_sandstone"
     SEA_LANTERN"seethrough_sea_lantern"
     SHROOMLIGHT"seethrough_shroomlight"
     SHULKER_BOX"seethrough_shulker_box"
     SLIME_BLOCK"seethrough_slime_block"
     SMITHING_TABLE"seethrough_smithing_table"
     SMOKER"seethrough_smoker"
     SMOOTH_QUARTZ"seethrough_smooth_quartz"
     SMOOTH_RED_SANDSTONE"seethrough_smooth_red_sandstone"
     SMOOTH_SANDSTONE"seethrough_smooth_sandstone"
     SMOOTH_STONE"seethrough_smooth_stone"
     SNOW_BLOCK"seethrough_snow_block"
     SOUL_SAND"seethrough_soul_sand"
     SOUL_SOIL"seethrough_soul_soil"
     SPAWNER"seethrough_spawner"
     E"seethrough_sponge"
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
