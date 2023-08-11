import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int x : scoville){
            minHeap.offer(x);
        }
        while(minHeap.size() > 1){
            if(minHeap.peek() < K){
                int firMin = minHeap.poll();
                int secMin = minHeap.poll();
                minHeap.offer(firMin+ (secMin*2));
                answer++;
            }else{
                break;
            }
        }
        if(minHeap.peek() < K) answer = -1;
        return answer;
    }
}