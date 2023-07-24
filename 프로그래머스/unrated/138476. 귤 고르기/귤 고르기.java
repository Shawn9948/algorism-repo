import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int x : tangerine) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Integer> list = map.values().stream().sorted().collect(Collectors.toList());

        for (int i = list.size() - 1; i >= 0; i--) {
            Integer target = list.get(i);
            answer++;
            k -= list.get(i);
            if(k<=0) break;
        }

        return answer;
    }
}