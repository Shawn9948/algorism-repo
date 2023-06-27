import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        //set에 담는다. 
        Set<Integer> set = new HashSet<>();
        int size = elements.length;
        for(int i = 0; i< size; i++){
            int sum = 0;
            int cycle = 0;
            int index = i;
            while(cycle < size){
                if(index >= size) index = 0;
                sum += elements[index++];
                cycle++;
                set.add(sum);
            }
        }
        
        answer = set.size();
        return answer;
    }
}