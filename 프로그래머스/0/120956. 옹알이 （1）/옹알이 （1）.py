def solution(babbling):
    answer = 0
    speak = ["aya", "ye", "woo", "ma"]
    for b in babbling:
        for s in speak:
            print(b)
            if s in b:
                b = b.replace(s, "_")
            
        if b.replace("_", "") == "":
            answer+=1
            
    return answer
