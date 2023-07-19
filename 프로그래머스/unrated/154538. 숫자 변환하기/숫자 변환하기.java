import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        queue.offer(x);
        set.add(x);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int target = queue.poll();
                if(target == y){
                    return answer;
                }
                if(target + n <= y&&!set.contains(target+n)) {
                    queue.offer(target + n);
                    set.add(target+n);
                }
                if(target * 2 <= y&&!set.contains(target*2)) {
                    queue.offer(target * 2);
                    set.add(target*2);
                }
                if(target * 3 <= y&&!set.contains(target*3)) {
                    queue.offer(target * 3);
                    set.add(target*3);
                }
            }
            answer++;
        }
        
        return -1;
    }
}