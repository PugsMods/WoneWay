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
    prnt(x)
