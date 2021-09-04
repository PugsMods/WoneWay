#!/usr/bin/python3

# The WoneWay Blockstate Generation Script!
#
# This script is used to automatically generate blockstate files for woneway
# blocks from the id list located in [This Folder]/generated/input_global.txt
#
# If you want to use this script, please remember the following things
#
# 1. This script must be runt from this directory only. If you run it from another folder, the
# generated/input_global.txt must be located it that directory.
#
# 2. This JSON will output everything to generated/blockstates/.
#
# 3. You will get an FileNotFound error if generated/blockstates/ dosent exist, so im adding a placeholder file.
import re

inputFilePath = "generated/input_global.txt"
inputFile = open(inputFilePath)

outputPath = "generated/blockstates/"

for x in inputFile:
    x = x.splitlines()[0]
    outFileName = outputPath + x + ".json"
    outFile = open(outFileName, "w+")
    print("Generating JSON for " + x)
    outFile.write("""{
  "variants": {
    "facing=north": {
      "model": "woneway:block/"""+x+""""
    },
    "facing=east": {
      "model": "woneway:block/"""+x+"""",
      "y": 90
    },
    "facing=south": {
      "model": "woneway:block/"""+x+"""",
      "y": 180
    },
    "facing=west": {
      "model": "woneway:block/"""+x+"""",
      "y": 270
    },
    "facing=up": {
      "model": "woneway:block/"""+x+"""",
      "x": 270
    },
    "facing=down": {
      "model": "woneway:block/"""+x+"""",
      "x": 90
    }
  }
}
""")
    outFile.close()
inputFile.close()
