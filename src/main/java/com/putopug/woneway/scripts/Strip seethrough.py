import re

Inp = open("StripSTINPUT.txt", "r")
opt = []
for x in Inp:
    brackets = '()'
    if x in brackets:
        Inp = Inp.replace(x, "")
    stp1 = re.sub("SEETHROUGH_", "", x)
    opt.append(stp1)
print(opt)
file = open("StripSTOUTPUT.txt", "a")
file.write("[")
for index in opt:
    file.write("'"+index+"', ")
file.write("]")