def solution(s):
    answer = True
    stack = []
    
    for t in list(s):
        if(t == '('):
            stack.append('(')
        else:
            if(len(stack) == 0):
                return False
            else:
                stack.pop()
    if(len(stack) > 0):
        return False
    return True
