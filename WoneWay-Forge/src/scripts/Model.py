#!/usr/bin/python3

# The WoneWay Model Generation Script!
#
# This script is used to automatically generate model files for woneway
# blocks from the id list located in [This Folder]/generated/input_global.txt
#
# If you want to use this script, please remember the following things
#
# TO BE FILLED BY AUTHOR.
import re

inputFilePath = "generated/input_global.txt"
inputFile = open(inputFilePath)

outputPath = "generated/models/"

for x in inputFile:
    x = x.splitlines()[0]
    outFileNameBlock = outputPath + "block/" + x + ".json"
    outFileBlock = open(outFileNameBlock, "w+")
    print("Generating JSON for " + x)
    outFileBlock.write("""{
  "parent": "block/cube",
  "textures": {
    "down": "block/""" + re.sub("seethrough_", "", x) + """",
    "up": "block/""" + re.sub("seethrough_", "", x) + """",
    "north": "woneway:blocks/clear_side",
    "east": "block/""" + re.sub("seethrough_", "", x) + """",
    "south": "block/""" + re.sub("seethrough_", "", x) + """",
    "west": "block/""" + re.sub("seethrough_", "", x) + """",
    "particle": "woneway:blocks/clear_side"
  }
}   
""")
    outFileBlock.close()
inputFile.close()
