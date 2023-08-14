import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
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
        
        return players;
    }
}