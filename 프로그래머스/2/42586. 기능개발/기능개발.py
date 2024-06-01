import math

def solution(progresses, speeds):
    answer = []
    count_queue = []
    for i in range(len(progresses)):
        period = math.ceil((100-progresses[i]) / speeds[i])
        count_queue.append(period)
    
    work_period = count_queue.pop(0)
    finished_work = 1
    while count_queue:
        number = count_queue.pop(0)
        if(number <= work_period):
            finished_work += 1
            continue
        answer.append(finished_work)
        work_period = number
        finished_work = 1
    
    answer.append(finished_work)
    return answer