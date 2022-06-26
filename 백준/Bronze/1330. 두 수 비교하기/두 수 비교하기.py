s_o = input()
ed = s_o.split()
x = int(ed[0])
y = int(ed[1])

if -10000 <= x <= 10000 and -10000 <= y <= 10000:
    if x > y:
        print(">")
    elif x == y:
        print("==")
    else:
        print("<")