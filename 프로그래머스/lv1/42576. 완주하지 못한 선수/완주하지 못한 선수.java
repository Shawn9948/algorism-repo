import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) +1);
        }
        for (String complete : completion) {
            map.put(complete, map.get(complete) - 1);
        }

        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                answer = s;
            }
        }
        return answer;
    }
}