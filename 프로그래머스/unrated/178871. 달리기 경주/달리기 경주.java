import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i< players.length;i++){
            map.put(players[i], i);
        }
        
        for(int i = 0; i<callings.length; i++){
            String target = callings[i];
            int index = map.get(target);
            String switchTarget = players[index-1];
            
            players[index] = switchTarget;
            players[index-1] = target;
            
            map.put(switchTarget, index);
            map.put(target, index-1);    
        }
        
        for(String x : map.keySet()){
            answer[map.get(x)] = x;
        }
        return answer;
    }
}