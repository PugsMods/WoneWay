names = ["acacia_leaves", "acacia_log", "acacia_planks", "acacia_wood",
         "ancient_debris", "andesite", "barrel", "basalt",
         "bedrock", "bee_nest", "beehive", "birch_leaves",
         "birch_log", "birch_planks", "birch_wood", "black_concrete",
         "black_concrete_powder", "black_glazed_terracotta", "black_shulker_box",
         "black_stained_glass", "black_terracotta", "black_wool",
         "blackstone", "blast_furnace", "blue_concrete",
         "blue_concrete_powder", "blue_glazed_terracotta", "blue_ice",
         "blue_shulker_box", "blue_stained_glass", "blue_terracotta",
         "blue_wool", "bone_block", "bookshelf", "brain_coral_block",
         "bricks", "brown_concrete", "brown_concrete_powder",
         "brown_glazed_terracotta", "brown_mushroom_block", "brown_shulker_box",
         "brown_stained_glass", "brown_terracotta", "brown_wool",
         "bubble_coral_block", "cartography_table", "carved_pumpkin",
         "chain_command_block", "chiseled_nether_bricks",
         "chiseled_polished_blackstone", "chiseled_red_sandstone",
         "chiseled_sandstone", "chiseled_stone_bricks", "clay_block",
         "coal_block", "coal_ore", "coarse_dirt", "cobblestone",
         "command_block", "cracked_nether_bricks",
         "cracked_polished_blackstone_bricks", "cracked_stone_bricks",
         "crafting_table", "crimson_hyphae", "crimson_nylium",
         "crimson_planks", "crimson_stem", "crying_obsidian",
         "cut_red_sandstone", "cut_sandstone", "cyan_concrete",
         "cyan_concrete_powder"]

for index in names:
    createJSON = open("seethrough_"+index+".json", "w")
    createJSON.write('''
    {
  "parent": "block/cube",
  "textures": {
    "down": "block/'''+index+'''",
    "up": "block/'''+index+'''",
    "north": "woneway:blocks/clear_side",
    "east": "block/'''+index+'''",
    "south": "block/'''+index+'''",
    "west": "block/'''+index+'''",
    "particle": "woneway:blocks/clear_side"
  }
}
    ''')
    print("Generating JSON for "+index)
