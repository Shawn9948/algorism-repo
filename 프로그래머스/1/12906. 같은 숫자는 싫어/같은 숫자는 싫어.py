def solution(arr):
    answer = []
    last_number = -1
    
    for i in range(len(arr)):
        number = arr[i]
        if last_number == number:
            continue
        last_number = number
        answer.append(number)
        
    return answer