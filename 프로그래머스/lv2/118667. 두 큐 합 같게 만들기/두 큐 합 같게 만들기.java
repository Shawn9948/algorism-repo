import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        long q1Sum = 0;
        long q2Sum = 0;
        for(int i = 0; i< queue1.length; i++){
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
            q1Sum += queue1[i];
            q2Sum += queue2[i];
        }
        while(q1Sum != q2Sum) {
            answer++;
            
            if(q1Sum > q2Sum){
                int target = q1.poll();
                q1Sum -= target;
                q2Sum += target;
                q2.offer(target);
            }else{
                int target = q2.poll();
                q2Sum -= target;
                q1Sum += target;
                q1.offer(target);
            }
            
            if(answer >= queue1.length * 3)
             return -1; 
        }
        
        return answer;
    }
    
}
