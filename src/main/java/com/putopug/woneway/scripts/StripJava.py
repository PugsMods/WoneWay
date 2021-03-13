import re

Inp = open("StripJavaINPUT.txt", "r")
opt = []
for x in Inp:
    brackets = '()'
    if x in brackets:
        Inp = Inp.replace(x, "")
    stp1 = re.sub("public static final RegistryObject<Block> SEETHROUGH = ", "", x)
    stp2 = re.split("\s", stp1, 9)
    opt.append(stp2[8])
print(opt)
file = open("StripJavaOUTPUT.txt", "a")
file.write("[")
for index in opt:
    file.write("'"+index+"', ")
file.write("]")