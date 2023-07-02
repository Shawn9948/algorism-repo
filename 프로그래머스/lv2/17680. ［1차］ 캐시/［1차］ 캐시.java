
import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        boolean isCacheHit = false;
        List<String> cache = new ArrayList<>();
        
        for (String city : cities) {
            city = city.toUpperCase();
            isCacheHit = cache.contains(city);
            if (isCacheHit) {
                    cache.remove(city);
                    cache.add(city);
                    answer++;
            } else {
                cache.add(city);
                if (cache.size() > cacheSize) {
                    cache.remove(0);
                }
                answer += 5;
            }
        }

        return answer;
    }
}