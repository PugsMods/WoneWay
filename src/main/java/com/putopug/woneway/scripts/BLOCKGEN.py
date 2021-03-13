# Import Dependencies
import re

# User input goes here
GEN_INPUT = ["INPUT", "ANOTHER INPUT"]
PREFIX = "ENTER PREFIX HERE"
EXTENDS = "ENTER THE CLASS WHICH THIS REGISTRYOBJECT EXTENDS"
FILENAME = "THE NAME OF THE OUTPUT FILE"
REGISTER = "BLOCKS"

# Code To Generate Lines
# Iterate Through Every Object In GEN_INPUT
for index in GEN_INPUT:
    # Strip all spaces
    stripped = re.sub("\s", "_", index)
    stripped_prefix = re.sub("\s", "_", PREFIX)
    stripped_extends = re.sub("\s", "_", EXTENDS)
    stripped_fn = re.sub("\s", "_", FILENAME)
    stripped_reg = re.sub("\s", "_", REGISTER)
    # Open the file
    createJAVA = open(stripped_fn, "a")

    # Write to the file
    createJAVA.write(
        "public static final RegistryObject<Block> " + stripped_prefix.upper()+"_"+stripped.upper() + " = " + stripped_reg + '.register("' +
        stripped_prefix.lower()+"_"+stripped.lower() + '",' + stripped_extends + '::new);\n\r')
    # Print to the console
    print("Generating syntax for :" + index)
