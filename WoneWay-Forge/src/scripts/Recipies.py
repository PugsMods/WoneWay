#!/usr/bin/python3

# The WoneWay Recipe Generation Script!
#
# This script is used to automatically generate recipe files for woneway
# blocks from the id list located in [This Folder]/generated/input_global.txt
#
# If you want to use this script, please remember the following things
#
# 1. This script must be runt from this directory only. If you run it from another folder, the
# generated/input_global.txt must be located it that file.
#
# 2. This JSON will output everything to generated/recipes/.
#
# 3. You will get an FileNotFound error if generated/recipes docent exist, so im adding a placeholder file.
import re

inputFilePath = "generated/input_global.txt"
inputFile = open(inputFilePath)

outputPath = "generated/recipies/"

for x in inputFile:
    x = x.splitlines()[0]
    outFileName = outputPath + x + ".json"
    outFile = open(outFileName, "w+")
    print("Generating JSON for "+x)
    outFile.write("""{
    "type": "minecraft:crafting_shapeless",
    "ingredients": [
        {
        "item": "minecraft:glass"
        },
        {
            "item": "minecraft:""" + re.sub("seethrough_", "", x) + """"
        }
    ],
    "result": {
        "item": "woneway:""" + x + """",
        "count": 2
    }
} 
""")
    outFile.close()
inputFile.close()
