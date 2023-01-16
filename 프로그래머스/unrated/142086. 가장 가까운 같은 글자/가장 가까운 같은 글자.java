import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 0);

        for (int i = 1; i < s.length(); i++) {
            char cha = s.charAt(i);
            answer[i] = map.containsKey(cha) ? i-map.get(cha) : -1;

            map.put(cha, i);
        }
        return answer;
    }
}