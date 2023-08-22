def solution(skill, skill_trees):
    answer = 0
    l1 = []
    for skill_tree in skill_trees:
        possible_skill = ""
        for target in list(skill_tree):
            if target in skill:
                possible_skill += target               
        l1.append(possible_skill)
        
    print(l1)
    for target in l1:
        is_possible = True
        for idx, t in enumerate(target):
            if(skill[idx] != t):
                is_possible = False
                break
        if is_possible: 
            answer+=1
            
    return answer