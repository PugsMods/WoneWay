#!/usr/bin/python3

#  Copyright (C) 2021 PugzAreCute
#
#  This program is free software: you can redistribute it and/or modify
#  it under the terms of the GNU General Public License as published by
#  the Free Software Foundation, either version 3 of the License, or
#  (at your option) any later version.
#
#  This program is distributed in the hope that it will be useful,
#  but WITHOUT ANY WARRANTY; without even the implied warranty of
#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#  GNU General Public License for more details.
#
#  You should have received a copy of the GNU General Public License
#  along with this program.  If not, see <https://www.gnu.org/licenses/>.
#
#  Additional permission under GNU GPL version 3 section 7
#
#  If you modify this Program, or any covered work, by linking or combining it with Minecraft (or a modified version of that library),
#  containing parts covered by the terms of All Rights Reserved, the licensors of this Program grant you additional permission to convey the resulting work.
#  {Corresponding Source for a non-source form of such a combination shall include the source code for the parts of Minecraft used as well as that of the covered work.}

# The WoneWay Recipe Generation Script!
#
# This script is used to automatically generate recipe files for woneway
# blocks from the id list located in [This Folder]/generated/input_global.txt
#
# If you want to use this script, please remember the following things
#
# 1. This script must be runt from this directory only. If you run it from another folder, the
# generated/input_global.txt must be located it that directory.
#
# 2. This script will output everything to generated/recipes/.
#
# 3. You will get an FileNotFound error if generated/recipes dosent exist, so im adding a placeholder file.
import re

inputFilePath = "generated/input_global.txt"
inputFile = open(inputFilePath)

outputPath = "generated/recipies/"

for x in inputFile:
    x = x.splitlines()[0]
    outFileName = outputPath + x + ".json"
    outFile = open(outFileName, "w+")
    print("Generating JSON for " + x)
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
