def solution(n, lost, reserve):
    answer = 0
    arr = []
    for i in range(n+2):
        arr.append(0)

    for i in lost:
        arr[i] -= 1
    
    for i in reserve:
        arr[i] += 1 
    
    for i in range(1,n+1):
        if(arr[i] == -1):
            if(arr[i-1] == 1):
                arr[i-1] -= 1
                answer += 1
            elif(arr[i+1] == 1):
                answer += 1
                arr[i+1] -= 1
        else:
            answer+=1
        print(arr)
    return answer