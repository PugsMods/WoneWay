/*
 * This file is part of WoneWay.
 *
 * WoneWay is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WoneWay is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WoneWay.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.pugzarecute.woneway.init;

import com.pugzarecute.woneway.WoneWay;
import com.pugzarecute.woneway.blocks.SeethroughBlock;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class WoneWayBlocks {
    public static final Map<String,RegistryObject<Block>> BLOCKMAP = new HashMap<>();
    public static final Map<String,RegistryObject<Block>> LEAFMAP = new HashMap<>();

    private final static Logger logger = LogManager.getLogger();

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WoneWay.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WoneWay.MOD_ID);


    private static void registerItemAndBlock(String id) {
        final RegistryObject<Block> BLOCK = BLOCKS.register(id, SeethroughBlock::new);

        if(Pattern.compile("LEAVES").matcher(id).find() || Pattern.compile("GRASS_BLOCK").matcher(id).find()) {
            LEAFMAP.put(id,BLOCK);
        } else {
            BLOCKMAP.put(id,BLOCK);
        }
        ITEMS.register(id, () -> new BlockItemProvider(BLOCK.get()));
        logger.debug("WoneWay: Registering block " + id);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

        //Mess below, don't look, its horrible code
        //I added an editor fold block if you want to minimize it
        //<editor-fold desc="Messy Registration Code">
        //1.16.5 and below (Initial releases)
        registerItemAndBlock("seethrough_acacia_leaves");
        registerItemAndBlock("seethrough_acacia_log");
        registerItemAndBlock("seethrough_acacia_planks");
        registerItemAndBlock("seethrough_acacia_wood");
        registerItemAndBlock("seethrough_ancient_debris");
        registerItemAndBlock("seethrough_andesite");
        registerItemAndBlock("seethrough_barrel");
        registerItemAndBlock("seethrough_basalt");
        registerItemAndBlock("seethrough_bedrock");
        registerItemAndBlock("seethrough_bee_nest");
        registerItemAndBlock("seethrough_beehive");
        registerItemAndBlock("seethrough_birch_leaves");
        registerItemAndBlock("seethrough_birch_log");
        registerItemAndBlock("seethrough_birch_planks");
        registerItemAndBlock("seethrough_birch_wood");
        registerItemAndBlock("seethrough_black_concrete");
        registerItemAndBlock("seethrough_black_concrete_powder");
        registerItemAndBlock("seethrough_black_glazed_terracotta");
        registerItemAndBlock("seethrough_black_shulker_box");
        registerItemAndBlock("seethrough_black_stained_glass");
        registerItemAndBlock("seethrough_black_terracotta");
        registerItemAndBlock("seethrough_black_wool");
        registerItemAndBlock("seethrough_blackstone");
        registerItemAndBlock("seethrough_blast_furnace");
        registerItemAndBlock("seethrough_blue_concrete");
        registerItemAndBlock("seethrough_blue_concrete_powder");
        registerItemAndBlock("seethrough_blue_glazed_terracotta");
        registerItemAndBlock("seethrough_blue_ice");
        registerItemAndBlock("seethrough_blue_shulker_box");
        registerItemAndBlock("seethrough_blue_stained_glass");
        registerItemAndBlock("seethrough_blue_terracotta");
        registerItemAndBlock("seethrough_blue_wool");
        registerItemAndBlock("seethrough_bone_block");
        registerItemAndBlock("seethrough_bookshelf");
        registerItemAndBlock("seethrough_brain_coral_block");
        registerItemAndBlock("seethrough_bricks");
        registerItemAndBlock("seethrough_brown_concrete");
        registerItemAndBlock("seethrough_brown_concrete_powder");
        registerItemAndBlock("seethrough_brown_glazed_terracotta");
        registerItemAndBlock("seethrough_brown_mushroom_block");
        registerItemAndBlock("seethrough_brown_shulker_box");
        registerItemAndBlock("seethrough_brown_stained_glass");
        registerItemAndBlock("seethrough_brown_terracotta");
        registerItemAndBlock("seethrough_brown_wool");
        registerItemAndBlock("seethrough_bubble_coral_block");
        registerItemAndBlock("seethrough_cartography_table");
        registerItemAndBlock("seethrough_carved_pumpkin");
        registerItemAndBlock("seethrough_chain_command_block");
        registerItemAndBlock("seethrough_chiseled_nether_bricks");
        registerItemAndBlock("seethrough_chiseled_polished_blackstone");
        registerItemAndBlock("seethrough_chiseled_red_sandstone");
        registerItemAndBlock("seethrough_chiseled_sandstone");
        registerItemAndBlock("seethrough_chiseled_stone_bricks");
        registerItemAndBlock("seethrough_clay_block");
        registerItemAndBlock("seethrough_coal_block");
        registerItemAndBlock("seethrough_coal_ore");
        registerItemAndBlock("seethrough_coarse_dirt");
        registerItemAndBlock("seethrough_cobblestone");
        registerItemAndBlock("seethrough_command_block");
        registerItemAndBlock("seethrough_cracked_nether_bricks");
        registerItemAndBlock("seethrough_cracked_polished_blackstone_bricks");
        registerItemAndBlock("seethrough_cracked_stone_bricks");
        registerItemAndBlock("seethrough_crafting_table");
        registerItemAndBlock("seethrough_crimson_hyphae");
        registerItemAndBlock("seethrough_crimson_nylium");
        registerItemAndBlock("seethrough_crimson_planks");
        registerItemAndBlock("seethrough_crimson_stem");
        registerItemAndBlock("seethrough_crying_obsidian");
        registerItemAndBlock("seethrough_cut_red_sandstone");
        registerItemAndBlock("seethrough_cut_sandstone");
        registerItemAndBlock("seethrough_cyan_concrete");
        registerItemAndBlock("seethrough_cyan_concrete_powder");
        registerItemAndBlock("seethrough_cyan_glazed_terracotta");
        registerItemAndBlock("seethrough_cyan_shulker_box");
        registerItemAndBlock("seethrough_cyan_stained_glass");
        registerItemAndBlock("seethrough_cyan_terracotta");
        registerItemAndBlock("seethrough_cyan_wool");
        registerItemAndBlock("seethrough_dark_oak_leaves");
        registerItemAndBlock("seethrough_dark_oak_log");
        registerItemAndBlock("seethrough_dark_oak_planks");
        registerItemAndBlock("seethrough_dark_oak_wood");
        registerItemAndBlock("seethrough_dark_prismarine");
        registerItemAndBlock("seethrough_dead_brain_coral_block");
        registerItemAndBlock("seethrough_dead_bubble_coral_block");
        registerItemAndBlock("seethrough_dead_fire_coral_block");
        registerItemAndBlock("seethrough_dead_tube_coral_block");
        registerItemAndBlock("seethrough_diamond_block");
        registerItemAndBlock("seethrough_diamond_ore");
        registerItemAndBlock("seethrough_diorite");
        registerItemAndBlock("seethrough_dirt");
        registerItemAndBlock("seethrough_dispenser");
        registerItemAndBlock("seethrough_dried_kelp_block");
        registerItemAndBlock("seethrough_dropper");
        registerItemAndBlock("seethrough_emerald_block");
        registerItemAndBlock("seethrough_emerald_ore");
        registerItemAndBlock("seethrough_end_stone");
        registerItemAndBlock("seethrough_end_stone_bricks");
        registerItemAndBlock("seethrough_fire_coral_block");
        registerItemAndBlock("seethrough_fletching_table");
        registerItemAndBlock("seethrough_furnace");
        registerItemAndBlock("seethrough_gilded_blackstone");
        registerItemAndBlock("seethrough_glass");
        registerItemAndBlock("seethrough_glowstone");
        registerItemAndBlock("seethrough_gold_block");
        registerItemAndBlock("seethrough_gold_ore");
        registerItemAndBlock("seethrough_granite");
        registerItemAndBlock("seethrough_grass_block");
        registerItemAndBlock("seethrough_gray_concrete");
        registerItemAndBlock("seethrough_gray_concrete_powder");
        registerItemAndBlock("seethrough_gray_glazed_terracotta");
        registerItemAndBlock("seethrough_gray_shulker_box");
        registerItemAndBlock("seethrough_gray_stained_glass");
        registerItemAndBlock("seethrough_gray_terracotta");
        registerItemAndBlock("seethrough_gray_wool");
        registerItemAndBlock("seethrough_green_concrete");
        registerItemAndBlock("seethrough_green_concrete_powder");
        registerItemAndBlock("seethrough_green_glazed_terracotta");
        registerItemAndBlock("seethrough_green_shulker_box");
        registerItemAndBlock("seethrough_green_stained_glass");
        registerItemAndBlock("seethrough_green_terracotta");
        registerItemAndBlock("seethrough_green_wool");
        registerItemAndBlock("seethrough_hay_bale");
        registerItemAndBlock("seethrough_honey_block");
        registerItemAndBlock("seethrough_honeycomb_block");
        registerItemAndBlock("seethrough_horn_coral_block");
        registerItemAndBlock("seethrough_ice");
        registerItemAndBlock("seethrough_iron_block");
        registerItemAndBlock("seethrough_iron_ore");
        registerItemAndBlock("seethrough_jack_o_lantern");
        registerItemAndBlock("seethrough_jukebox");
        registerItemAndBlock("seethrough_jungle_leaves");
        registerItemAndBlock("seethrough_jungle_log");
        registerItemAndBlock("seethrough_jungle_planks");
        registerItemAndBlock("seethrough_jungle_wood");
        registerItemAndBlock("seethrough_lapis_block");
        registerItemAndBlock("seethrough_lapis_ore");
        registerItemAndBlock("seethrough_light_blue_concrete");
        registerItemAndBlock("seethrough_light_blue_concrete_powder");
        registerItemAndBlock("seethrough_light_blue_glazed_terracotta");
        registerItemAndBlock("seethrough_light_blue_shulker_box");
        registerItemAndBlock("seethrough_light_blue_stained_glass");
        registerItemAndBlock("seethrough_light_blue_terracotta");
        registerItemAndBlock("seethrough_light_blue_wool");
        registerItemAndBlock("seethrough_light_gray_concrete");
        registerItemAndBlock("seethrough_light_gray_concrete_powder");
        registerItemAndBlock("seethrough_light_gray_glazed_terracotta");
        registerItemAndBlock("seethrough_light_gray_shulker_box");
        registerItemAndBlock("seethrough_light_gray_stained_glass");
        registerItemAndBlock("seethrough_light_gray_terracotta");
        registerItemAndBlock("seethrough_light_gray_wool");
        registerItemAndBlock("seethrough_lime_concrete");
        registerItemAndBlock("seethrough_lime_concrete_powder");
        registerItemAndBlock("seethrough_lime_glazed_terracotta");
        registerItemAndBlock("seethrough_lime_shulker_box");
        registerItemAndBlock("seethrough_lime_stained_glass");
        registerItemAndBlock("seethrough_lime_terracotta");
        registerItemAndBlock("seethrough_lime_wool");
        registerItemAndBlock("seethrough_lodestone");
        registerItemAndBlock("seethrough_loom");
        registerItemAndBlock("seethrough_magenta_concrete");
        registerItemAndBlock("seethrough_magenta_concrete_powder");
        registerItemAndBlock("seethrough_magenta_glazed_terracotta");
        registerItemAndBlock("seethrough_magenta_shulker_box");
        registerItemAndBlock("seethrough_magenta_stained_glass");
        registerItemAndBlock("seethrough_magenta_terracotta");
        registerItemAndBlock("seethrough_magenta_wool");
        registerItemAndBlock("seethrough_magma_block");
        registerItemAndBlock("seethrough_melon");
        registerItemAndBlock("seethrough_mossy_cobblestone");
        registerItemAndBlock("seethrough_mossy_stone_bricks");
        registerItemAndBlock("seethrough_mushroom_stem");
        registerItemAndBlock("seethrough_mycelium");
        registerItemAndBlock("seethrough_nether_bricks");
        registerItemAndBlock("seethrough_nether_gold_ore");
        registerItemAndBlock("seethrough_nether_quartz_ore");
        registerItemAndBlock("seethrough_nether_wart_block");
        registerItemAndBlock("seethrough_netherite_block");
        registerItemAndBlock("seethrough_netherrack");
        registerItemAndBlock("seethrough_note_block");
        registerItemAndBlock("seethrough_oak_leaves");
        registerItemAndBlock("seethrough_oak_log");
        registerItemAndBlock("seethrough_oak_planks");
        registerItemAndBlock("seethrough_oak_wood");
        registerItemAndBlock("seethrough_observer");
        registerItemAndBlock("seethrough_obsidian");
        registerItemAndBlock("seethrough_orange_concrete");
        registerItemAndBlock("seethrough_orange_concrete_powder");
        registerItemAndBlock("seethrough_orange_glazed_terracotta");
        registerItemAndBlock("seethrough_orange_shulker_box");
        registerItemAndBlock("seethrough_orange_stained_glass");
        registerItemAndBlock("seethrough_orange_terracotta");
        registerItemAndBlock("seethrough_orange_wool");
        registerItemAndBlock("seethrough_packed_ice");
        registerItemAndBlock("seethrough_pink_concrete");
        registerItemAndBlock("seethrough_pink_concrete_powder");
        registerItemAndBlock("seethrough_pink_glazed_terracotta");
        registerItemAndBlock("seethrough_pink_shulker_box");
        registerItemAndBlock("seethrough_pink_stained_glass");
        registerItemAndBlock("seethrough_pink_terracotta");
        registerItemAndBlock("seethrough_pink_wool");
        registerItemAndBlock("seethrough_piston");
        registerItemAndBlock("seethrough_podzol");
        registerItemAndBlock("seethrough_polished_andesite");
        registerItemAndBlock("seethrough_polished_basalt");
        registerItemAndBlock("seethrough_polished_blackstone");
        registerItemAndBlock("seethrough_polished_blackstone_bricks");
        registerItemAndBlock("seethrough_polished_diorite");
        registerItemAndBlock("seethrough_polished_granite");
        registerItemAndBlock("seethrough_prismarine");
        registerItemAndBlock("seethrough_prismarine_bricks");
        registerItemAndBlock("seethrough_pumpkin");
        registerItemAndBlock("seethrough_purple_concrete");
        registerItemAndBlock("seethrough_purple_concrete_powder");
        registerItemAndBlock("seethrough_purple_glazed_terracotta");
        registerItemAndBlock("seethrough_purple_shulker_box");
        registerItemAndBlock("seethrough_purple_stained_glass");
        registerItemAndBlock("seethrough_purple_terracotta");
        registerItemAndBlock("seethrough_purple_wool");
        registerItemAndBlock("seethrough_purpur_block");
        registerItemAndBlock("seethrough_purpur_pillar");
        registerItemAndBlock("seethrough_quartz_block");
        registerItemAndBlock("seethrough_quartz_bricks");
        registerItemAndBlock("seethrough_quartz_pillar");
        registerItemAndBlock("seethrough_red_concrete");
        registerItemAndBlock("seethrough_red_concrete_powder");
        registerItemAndBlock("seethrough_red_glazed_terracotta");
        registerItemAndBlock("seethrough_red_mushroom_block");
        registerItemAndBlock("seethrough_red_nether_bricks");
        registerItemAndBlock("seethrough_red_sand");
        registerItemAndBlock("seethrough_red_sandstone");
        registerItemAndBlock("seethrough_red_shulker_box");
        registerItemAndBlock("seethrough_red_stained_glass");
        registerItemAndBlock("seethrough_red_terracotta");
        registerItemAndBlock("seethrough_red_wool");
        registerItemAndBlock("seethrough_redstone_block");
        registerItemAndBlock("seethrough_redstone_lamp");
        registerItemAndBlock("seethrough_redstone_ore");
        registerItemAndBlock("seethrough_repeating_command_block");
        registerItemAndBlock("seethrough_respawn_anchor");
        registerItemAndBlock("seethrough_sand");
        registerItemAndBlock("seethrough_sandstone");
        registerItemAndBlock("seethrough_sea_lantern");
        registerItemAndBlock("seethrough_shroomlight");
        registerItemAndBlock("seethrough_shulker_box");
        registerItemAndBlock("seethrough_slime_block");
        registerItemAndBlock("seethrough_smithing_table");
        registerItemAndBlock("seethrough_smoker");
        registerItemAndBlock("seethrough_smooth_quartz");
        registerItemAndBlock("seethrough_smooth_red_sandstone");
        registerItemAndBlock("seethrough_smooth_sandstone");
        registerItemAndBlock("seethrough_smooth_stone");
        registerItemAndBlock("seethrough_snow_block");
        registerItemAndBlock("seethrough_soul_sand");
        registerItemAndBlock("seethrough_soul_soil");
        registerItemAndBlock("seethrough_spawner");
        registerItemAndBlock("seethrough_sponge");
        registerItemAndBlock("seethrough_spruce_leaves");
        registerItemAndBlock("seethrough_spruce_log");
        registerItemAndBlock("seethrough_spruce_planks");
        registerItemAndBlock("seethrough_spruce_wood");
        registerItemAndBlock("seethrough_sticky_piston");
        registerItemAndBlock("seethrough_stone");
        registerItemAndBlock("seethrough_stone_bricks");
        registerItemAndBlock("seethrough_stripped_acacia_log");
        registerItemAndBlock("seethrough_stripped_acacia_wood");
        registerItemAndBlock("seethrough_stripped_birch_log");
        registerItemAndBlock("seethrough_stripped_birch_wood");
        registerItemAndBlock("seethrough_stripped_crimson_hyphae");
        registerItemAndBlock("seethrough_stripped_crimson_stem");
        registerItemAndBlock("seethrough_stripped_dark_oak_log");
        registerItemAndBlock("seethrough_stripped_dark_oak_wood");
        registerItemAndBlock("seethrough_stripped_jungle_log");
        registerItemAndBlock("seethrough_stripped_jungle_wood");
        registerItemAndBlock("seethrough_stripped_oak_log");
        registerItemAndBlock("seethrough_stripped_oak_wood");
        registerItemAndBlock("seethrough_stripped_spruce_log");
        registerItemAndBlock("seethrough_stripped_spruce_wood");
        registerItemAndBlock("seethrough_stripped_warped_hyphae");
        registerItemAndBlock("seethrough_stripped_warped_stem");
        registerItemAndBlock("seethrough_structure_block");
        registerItemAndBlock("seethrough_target");
        registerItemAndBlock("seethrough_terracotta");
        registerItemAndBlock("seethrough_tnt");
        registerItemAndBlock("seethrough_tube_coral_block");
        registerItemAndBlock("seethrough_warped_hyphae");
        registerItemAndBlock("seethrough_warped_nylium");
        registerItemAndBlock("seethrough_warped_planks");
        registerItemAndBlock("seethrough_warped_stem");
        registerItemAndBlock("seethrough_warped_wart_block");
        registerItemAndBlock("seethrough_wet_sponge");
        registerItemAndBlock("seethrough_white_concrete");
        registerItemAndBlock("seethrough_white_concrete_powder");
        registerItemAndBlock("seethrough_white_glazed_terracotta");
        registerItemAndBlock("seethrough_white_shulker_box");
        registerItemAndBlock("seethrough_white_stained_glass");
        registerItemAndBlock("seethrough_white_terracotta");
        registerItemAndBlock("seethrough_white_wool");
        registerItemAndBlock("seethrough_yellow_concrete");
        registerItemAndBlock("seethrough_yellow_concrete_powder");
        registerItemAndBlock("seethrough_yellow_glazed_terracotta");
        registerItemAndBlock("seethrough_yellow_shulker_box");
        registerItemAndBlock("seethrough_yellow_stained_glass");
        registerItemAndBlock("seethrough_yellow_terracotta");
        registerItemAndBlock("seethrough_yellow_wool");

        //1.17.1
        registerItemAndBlock("azalea_leaves");
        registerItemAndBlock("flowering_azalea_leaves");
        registerItemAndBlock("amethyst_block");
        registerItemAndBlock("raw_gold_block");
        registerItemAndBlock("raw_iron_block");
        registerItemAndBlock("raw_copper_block"); //IGNORE(COPPER)
        registerItemAndBlock("budding_amethyst");
        registerItemAndBlock("calcite");
        registerItemAndBlock("cobbled_deepslate"); //IGNORE(DEEPSLATE)
        registerItemAndBlock("copper_ore");

        //Do copper later
        //Do deepslate later
        //</editor-fold>
    }
}
