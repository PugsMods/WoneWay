/*
 * Copyright (C) 2021 PugzAreCute
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Additional permission under GNU GPL version 3 section 7
 *
 * If you modify this Program, or any covered work, by linking or combining it with Minecraft (or a modified version of that library),
 * containing parts covered by the terms of All Rights Reserved, the licensors of this Program grant you additional permission to convey the resulting work.
 * {Corresponding Source for a non-source form of such a combination shall include the source code for the parts of Minecraft used as well as that of the covered work.}
 */

package com.pugzarecute.woneway.init;

import com.pugzarecute.woneway.WoneWay;
import com.pugzarecute.woneway.init.WoneWayBlocks;
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
    public static Map<String,RegistryObject<Block>> blocks = new HashMap<>();
    public static Map<String,RegistryObject<Block>> leaves = new HashMap<>();
    private final static Logger logger = LogManager.getLogger();
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WoneWay.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WoneWay.MOD_ID);
    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //Mess below, dont look, its horrible code
        register("seethrough_acacia_leaves");
        register("seethrough_acacia_log");
        register("seethrough_acacia_planks");
        register("seethrough_acacia_wood");
        register("seethrough_ancient_debris");
        register("seethrough_andesite");
        register("seethrough_barrel");
        register("seethrough_basalt");
        register("seethrough_bedrock");
        register("seethrough_bee_nest");
        register("seethrough_beehive");
        register("seethrough_birch_leaves");
        register("seethrough_birch_log");
        register("seethrough_birch_planks");
        register("seethrough_birch_wood");
        register("seethrough_black_concrete");
        register("seethrough_black_concrete_powder");
        register("seethrough_black_glazed_terracotta");
        register("seethrough_black_shulker_box");
        register("seethrough_black_stained_glass");
        register("seethrough_black_terracotta");
        register("seethrough_black_wool");
        register("seethrough_blackstone");
        register("seethrough_blast_furnace");
        register("seethrough_blue_concrete");
        register("seethrough_blue_concrete_powder");
        register("seethrough_blue_glazed_terracotta");
        register("seethrough_blue_ice");
        register("seethrough_blue_shulker_box");
        register("seethrough_blue_stained_glass");
        register("seethrough_blue_terracotta");
        register("seethrough_blue_wool");
        register("seethrough_bone_block");
        register("seethrough_bookshelf");
        register("seethrough_brain_coral_block");
        register("seethrough_bricks");
        register("seethrough_brown_concrete");
        register("seethrough_brown_concrete_powder");
        register("seethrough_brown_glazed_terracotta");
        register("seethrough_brown_mushroom_block");
        register("seethrough_brown_shulker_box");
        register("seethrough_brown_stained_glass");
        register("seethrough_brown_terracotta");
        register("seethrough_brown_wool");
        register("seethrough_bubble_coral_block");
        register("seethrough_cartography_table");
        register("seethrough_carved_pumpkin");
        register("seethrough_chain_command_block");
        register("seethrough_chiseled_nether_bricks");
        register("seethrough_chiseled_polished_blackstone");
        register("seethrough_chiseled_red_sandstone");
        register("seethrough_chiseled_sandstone");
        register("seethrough_chiseled_stone_bricks");
        register("seethrough_clay_block");
        register("seethrough_coal_block");
        register("seethrough_coal_ore");
        register("seethrough_coarse_dirt");
        register("seethrough_cobblestone");
        register("seethrough_command_block");
        register("seethrough_cracked_nether_bricks");
        register("seethrough_cracked_polished_blackstone_bricks");
        register("seethrough_cracked_stone_bricks");
        register("seethrough_crafting_table");
        register("seethrough_crimson_hyphae");
        register("seethrough_crimson_nylium");
        register("seethrough_crimson_planks");
        register("seethrough_crimson_stem");
        register("seethrough_crying_obsidian");
        register("seethrough_cut_red_sandstone");
        register("seethrough_cut_sandstone");
        register("seethrough_cyan_concrete");
        register("seethrough_cyan_concrete_powder");
        register("seethrough_cyan_glazed_terracotta");
        register("seethrough_cyan_shulker_box");
        register("seethrough_cyan_stained_glass");
        register("seethrough_cyan_terracotta");
        register("seethrough_cyan_wool");
        register("seethrough_dark_oak_leaves");
        register("seethrough_dark_oak_log");
        register("seethrough_dark_oak_planks");
        register("seethrough_dark_oak_wood");
        register("seethrough_dark_prismarine");
        register("seethrough_dead_brain_coral_block");
        register("seethrough_dead_bubble_coral_block");
        register("seethrough_dead_fire_coral_block");
        register("seethrough_dead_tube_coral_block");
        register("seethrough_diamond_block");
        register("seethrough_diamond_ore");
        register("seethrough_diorite");
        register("seethrough_dirt");
        register("seethrough_dispenser");
        register("seethrough_dried_kelp_block");
        register("seethrough_dropper");
        register("seethrough_emerald_block");
        register("seethrough_emerald_ore");
        register("seethrough_end_stone");
        register("seethrough_end_stone_bricks");
        register("seethrough_fire_coral_block");
        register("seethrough_fletching_table");
        register("seethrough_furnace");
        register("seethrough_gilded_blackstone");
        register("seethrough_glass");
        register("seethrough_glowstone");
        register("seethrough_gold_block");
        register("seethrough_gold_ore");
        register("seethrough_granite");
        register("seethrough_grass_block");
        register("seethrough_gray_concrete");
        register("seethrough_gray_concrete_powder");
        register("seethrough_gray_glazed_terracotta");
        register("seethrough_gray_shulker_box");
        register("seethrough_gray_stained_glass");
        register("seethrough_gray_terracotta");
        register("seethrough_gray_wool");
        register("seethrough_green_concrete");
        register("seethrough_green_concrete_powder");
        register("seethrough_green_glazed_terracotta");
        register("seethrough_green_shulker_box");
        register("seethrough_green_stained_glass");
        register("seethrough_green_terracotta");
        register("seethrough_green_wool");
        register("seethrough_hay_bale");
        register("seethrough_honey_block");
        register("seethrough_honeycomb_block");
        register("seethrough_horn_coral_block");
        register("seethrough_ice");
        register("seethrough_iron_block");
        register("seethrough_iron_ore");
        register("seethrough_jack_o_lantern");
        register("seethrough_jukebox");
        register("seethrough_jungle_leaves");
        register("seethrough_jungle_log");
        register("seethrough_jungle_planks");
        register("seethrough_jungle_wood");
        register("seethrough_lapis_block");
        register("seethrough_lapis_ore");
        register("seethrough_light_blue_concrete");
        register("seethrough_light_blue_concrete_powder");
        register("seethrough_light_blue_glazed_terracotta");
        register("seethrough_light_blue_shulker_box");
        register("seethrough_light_blue_stained_glass");
        register("seethrough_light_blue_terracotta");
        register("seethrough_light_blue_wool");
        register("seethrough_light_gray_concrete");
        register("seethrough_light_gray_concrete_powder");
        register("seethrough_light_gray_glazed_terracotta");
        register("seethrough_light_gray_shulker_box");
        register("seethrough_light_gray_stained_glass");
        register("seethrough_light_gray_terracotta");
        register("seethrough_light_gray_wool");
        register("seethrough_lime_concrete");
        register("seethrough_lime_concrete_powder");
        register("seethrough_lime_glazed_terracotta");
        register("seethrough_lime_shulker_box");
        register("seethrough_lime_stained_glass");
        register("seethrough_lime_terracotta");
        register("seethrough_lime_wool");
        register("seethrough_lodestone");
        register("seethrough_loom");
        register("seethrough_magenta_concrete");
        register("seethrough_magenta_concrete_powder");
        register("seethrough_magenta_glazed_terracotta");
        register("seethrough_magenta_shulker_box");
        register("seethrough_magenta_stained_glass");
        register("seethrough_magenta_terracotta");
        register("seethrough_magenta_wool");
        register("seethrough_magma_block");
        register("seethrough_melon");
        register("seethrough_mossy_cobblestone");
        register("seethrough_mossy_stone_bricks");
        register("seethrough_mushroom_stem");
        register("seethrough_mycelium");
        register("seethrough_nether_bricks");
        register("seethrough_nether_gold_ore");
        register("seethrough_nether_quartz_ore");
        register("seethrough_nether_wart_block");
        register("seethrough_netherite_block");
        register("seethrough_netherrack");
        register("seethrough_note_block");
        register("seethrough_oak_leaves");
        register("seethrough_oak_log");
        register("seethrough_oak_planks");
        register("seethrough_oak_wood");
        register("seethrough_observer");
        register("seethrough_obsidian");
        register("seethrough_orange_concrete");
        register("seethrough_orange_concrete_powder");
        register("seethrough_orange_glazed_terracotta");
        register("seethrough_orange_shulker_box");
        register("seethrough_orange_stained_glass");
        register("seethrough_orange_terracotta");
        register("seethrough_orange_wool");
        register("seethrough_packed_ice");
        register("seethrough_pink_concrete");
        register("seethrough_pink_concrete_powder");
        register("seethrough_pink_glazed_terracotta");
        register("seethrough_pink_shulker_box");
        register("seethrough_pink_stained_glass");
        register("seethrough_pink_terracotta");
        register("seethrough_pink_wool");
        register("seethrough_piston");
        register("seethrough_podzol");
        register("seethrough_polished_andesite");
        register("seethrough_polished_basalt");
        register("seethrough_polished_blackstone");
        register("seethrough_polished_blackstone_bricks");
        register("seethrough_polished_diorite");
        register("seethrough_polished_granite");
        register("seethrough_prismarine");
        register("seethrough_prismarine_bricks");
        register("seethrough_pumpkin");
        register("seethrough_purple_concrete");
        register("seethrough_purple_concrete_powder");
        register("seethrough_purple_glazed_terracotta");
        register("seethrough_purple_shulker_box");
        register("seethrough_purple_stained_glass");
        register("seethrough_purple_terracotta");
        register("seethrough_purple_wool");
        register("seethrough_purpur_block");
        register("seethrough_purpur_pillar");
        register("seethrough_quartz_block");
        register("seethrough_quartz_bricks");
        register("seethrough_quartz_pillar");
        register("seethrough_red_concrete");
        register("seethrough_red_concrete_powder");
        register("seethrough_red_glazed_terracotta");
        register("seethrough_red_mushroom_block");
        register("seethrough_red_nether_bricks");
        register("seethrough_red_sand");
        register("seethrough_red_sandstone");
        register("seethrough_red_shulker_box");
        register("seethrough_red_stained_glass");
        register("seethrough_red_terracotta");
        register("seethrough_red_wool");
        register("seethrough_redstone_block");
        register("seethrough_redstone_lamp");
        register("seethrough_redstone_ore");
        register("seethrough_repeating_command_block");
        register("seethrough_respawn_anchor");
        register("seethrough_sand");
        register("seethrough_sandstone");
        register("seethrough_sea_lantern");
        register("seethrough_shroomlight");
        register("seethrough_shulker_box");
        register("seethrough_slime_block");
        register("seethrough_smithing_table");
        register("seethrough_smoker");
        register("seethrough_smooth_quartz");
        register("seethrough_smooth_red_sandstone");
        register("seethrough_smooth_sandstone");
        register("seethrough_smooth_stone");
        register("seethrough_snow_block");
        register("seethrough_soul_sand");
        register("seethrough_soul_soil");
        register("seethrough_spawner");
        register("seethrough_sponge");
        register("seethrough_spruce_leaves");
        register("seethrough_spruce_log");
        register("seethrough_spruce_planks");
        register("seethrough_spruce_wood");
        register("seethrough_sticky_piston");
        register("seethrough_stone");
        register("seethrough_stone_bricks");
        register("seethrough_stripped_acacia_log");
        register("seethrough_stripped_acacia_wood");
        register("seethrough_stripped_birch_log");
        register("seethrough_stripped_birch_wood");
        register("seethrough_stripped_crimson_hyphae");
        register("seethrough_stripped_crimson_stem");
        register("seethrough_stripped_dark_oak_log");
        register("seethrough_stripped_dark_oak_wood");
        register("seethrough_stripped_jungle_log");
        register("seethrough_stripped_jungle_wood");
        register("seethrough_stripped_oak_log");
        register("seethrough_stripped_oak_wood");
        register("seethrough_stripped_spruce_log");
        register("seethrough_stripped_spruce_wood");
        register("seethrough_stripped_warped_hyphae");
        register("seethrough_stripped_warped_stem");
        register("seethrough_structure_block");
        register("seethrough_target");
        register("seethrough_terracotta");
        register("seethrough_tnt");
        register("seethrough_tube_coral_block");
        register("seethrough_warped_hyphae");
        register("seethrough_warped_nylium");
        register("seethrough_warped_planks");
        register("seethrough_warped_stem");
        register("seethrough_warped_wart_block");
        register("seethrough_wet_sponge");
        register("seethrough_white_concrete");
        register("seethrough_white_concrete_powder");
        register("seethrough_white_glazed_terracotta");
        register("seethrough_white_shulker_box");
        register("seethrough_white_stained_glass");
        register("seethrough_white_terracotta");
        register("seethrough_white_wool");
        register("seethrough_yellow_concrete");
        register("seethrough_yellow_concrete_powder");
        register("seethrough_yellow_glazed_terracotta");
        register("seethrough_yellow_shulker_box");
        register("seethrough_yellow_stained_glass");
        register("seethrough_yellow_terracotta");
        register("seethrough_yellow_wool");
    }

    private static void register(String id) {
        RegistryObject<Block> X = BLOCKS.register(id, SeethroughBlock::new);
        if(Pattern.compile("LEAVES").matcher(id).find() || Pattern.compile("GRASS_BLOCK").matcher(id).find()) {
            leaves.put(id,X);
        } else {
            blocks.put(id,X);
        }
        ITEMS.register(id, () -> new BlockItemBase(X.get()));
        logger.debug("WoneWay: Registering block " + id);
    }
}
