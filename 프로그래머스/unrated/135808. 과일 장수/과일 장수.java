import java.util.*;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<score.length; i++){
            list.add(score[i]);
        }
        
        Collections.sort(list,Comparator.reverseOrder());
        
        while(list.size() % m != 0){
            list.remove(list.size()-1);
        }
        
        int min = 10;
        int cycle = 0;
        
        for(int i = 0; i<list.size(); i++){
            if(min > list.get(i)){
                min = list.get(i);
            }
            cycle++;
            
            if(cycle == m){
                answer += (min * m);
                cycle = 0;
                min = 10;
            } 
        }
        return answer;
    }
}
