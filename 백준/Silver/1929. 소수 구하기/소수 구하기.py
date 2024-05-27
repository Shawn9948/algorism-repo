import math


def MAKING_PRIME_BOARD(size: int):
    prime_board = [True for i in range(size+1)]
    prime_board[1] = False
    for i in range(2, int(math.sqrt(size))):
        if (prime_board[i]):
            j = 2
            while i*j <= size:
                prime_board[i*j] = False
                j += 1
    return prime_board


a, b = map(int, input().split(" "))
prime_board = MAKING_PRIME_BOARD(1000000)

for i in range(a, b+1):
    if prime_board[i]:
        print(i)
