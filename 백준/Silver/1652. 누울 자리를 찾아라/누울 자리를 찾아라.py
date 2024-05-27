import sys


def cheker(list):
    count = 2
    room = 0
    for x in list:
        if (x == "."):
            count -= 1
        else:
            count = 2
        if (count == 0):
            room += 1
    return room


size = int(sys.stdin.readline().strip("\n"))
row = 0
column = 0
row_room = []

for x in range(size):
    room_arr = list(sys.stdin.readline().strip("\n"))
    row += cheker(room_arr)
    row_room.append(room_arr)


for i in range(size):
    column_room_arr = []
    for y in range(size):
        column_room_arr.append(row_room[y][i])
    column += cheker(column_room_arr)

print(row, column)
