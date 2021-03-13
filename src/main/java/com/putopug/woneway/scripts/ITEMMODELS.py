names = ["seethrough_acacia_leaves", "seethrough_acacia_log", "seethrough_acacia_planks", "seethrough_acacia_wood",
         "seethrough_ancient_debris", "seethrough_andesite", "seethrough_barrel", "seethrough_basalt",
         "seethrough_bedrock", "seethrough_bee_nest", "seethrough_beehive", "seethrough_birch_leaves",
         "seethrough_birch_log", "seethrough_birch_planks", "seethrough_birch_wood", "seethrough_black_concrete",
         "seethrough_black_concrete_powder", "seethrough_black_glazed_terracotta", "seethrough_black_shulker_box",
         "seethrough_black_stained_glass", "seethrough_black_terracotta", "seethrough_black_wool",
         "seethrough_blackstone", "seethrough_blast_furnace", "seethrough_blue_concrete",
         "seethrough_blue_concrete_powder", "seethrough_blue_glazed_terracotta", "seethrough_blue_ice",
         "seethrough_blue_shulker_box", "seethrough_blue_stained_glass", "seethrough_blue_terracotta",
         "seethrough_blue_wool", "seethrough_bone_block", "seethrough_bookshelf", "seethrough_brain_coral_block",
         "seethrough_bricks", "seethrough_brown_concrete", "seethrough_brown_concrete_powder",
         "seethrough_brown_glazed_terracotta", "seethrough_brown_mushroom_block", "seethrough_brown_shulker_box",
         "seethrough_brown_stained_glass", "seethrough_brown_terracotta", "seethrough_brown_wool",
         "seethrough_bubble_coral_block", "seethrough_cartography_table", "seethrough_carved_pumpkin",
         "seethrough_chain_command_block", "seethrough_chiseled_nether_bricks",
         "seethrough_chiseled_polished_blackstone", "seethrough_chiseled_red_sandstone",
         "seethrough_chiseled_sandstone", "seethrough_chiseled_stone_bricks", "seethrough_clay_block",
         "seethrough_coal_block", "seethrough_coal_ore", "seethrough_coarse_dirt", "seethrough_cobblestone",
         "seethrough_command_block", "seethrough_cracked_nether_bricks",
         "seethrough_cracked_polished_blackstone_bricks", "seethrough_cracked_stone_bricks",
         "seethrough_crafting_table", "seethrough_crimson_hyphae", "seethrough_crimson_nylium",
         "seethrough_crimson_planks", "seethrough_crimson_stem", "seethrough_crying_obsidian",
         "seethrough_cut_red_sandstone", "seethrough_cut_sandstone", "seethrough_cyan_concrete",
         "seethrough_cyan_concrete_powder"]

for index in names:
    createJSON = open(index+".json", "w")
    createJSON.write('''
{
  "parent": "woneway:block/'''+index+'''"
}
    ''')
    print(index)
