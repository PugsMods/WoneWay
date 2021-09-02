import re

inputFilePath = "generated/input_global.txt"
inputFile = open(inputFilePath)

for x in inputFile:
    x = x.splitlines()[0]
    print("block.woneway."+x+":"+"")