import math


def MAKING_PRIME_BOARD(max_number: int):
    board = [True for i in range(max_number+1)]
    board[1] = False
    for i in range(2, int(math.sqrt(max_number))+1):
        if board[i] == True:
            j = 2
            while i*j <= max_number:
                board[i*j] = False
                j += 1
    return board


def palindrome_checker(num: int):
    arr = list(str(num))
    arr_length = len(arr)
    for i in range(math.ceil(arr_length/2)):
        if arr[i] is not arr[arr_length-(i+1)]:
            return False
    return True


max = 10000000
prime_check_list = MAKING_PRIME_BOARD(max)
num = int(input())

while True:
    if prime_check_list[num] and palindrome_checker(num):
        print(num)
        break
    num += 1
