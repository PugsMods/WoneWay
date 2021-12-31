#!/usr/bin/python3

#  This file is part of WoneWay.
#
#  WoneWay is free software: you can redistribute it and/or modify
#  it under the terms of the GNU Lesser General Public License as published by
#  the Free Software Foundation, either version 3 of the License, or
#  (at your option) any later version.
#
#  WoneWay is distributed in the hope that it will be useful,
#  but WITHOUT ANY WARRANTY; without even the implied warranty of
#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#  GNU Lesser General Public License for more details.
#
#  You should have received a copy of the GNU Lesser General Public License
#  along with WoneWay.  If not, see <https://www.gnu.org/licenses/>.

# The WoneWay Blockstate Generation Script!
#
# This script is used to automatically generate blockstate files for WoneWay
# blocks from the id list located in [This Folder]/generated/input_global.txt
#
# If you want to use this script, please remember the following things
#
# 1. This script must be runt from this directory only. If you run it from another folder, the
# generated/input_global.txt must be located it that directory.
#
# 2. This JSON will output everything to generated/blockstates/.
#
# 3. You will get an FileNotFound error if generated/blockstates/ doesn't exist, so i'm adding a placeholder file.

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
      "model": "woneway:block/""" + x + """"
    },
    "facing=east": {
      "model": "woneway:block/""" + x + """",
      "y": 90
    },
    "facing=south": {
      "model": "woneway:block/""" + x + """",
      "y": 180
    },
    "facing=west": {
      "model": "woneway:block/""" + x + """",
      "y": 270
    },
    "facing=up": {
      "model": "woneway:block/""" + x + """",
      "x": 270
    },
    "facing=down": {
      "model": "woneway:block/""" + x + """",
      "x": 90
    }
  }
}
""")
    outFile.close()
inputFile.close()
