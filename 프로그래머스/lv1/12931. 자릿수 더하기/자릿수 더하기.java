import java.util.*;

public class Solution {
        public int solution(int n) {
            int answer = 0;

            String[] split = String.valueOf(n).split("");
            for (int i = 0; i < split.length; i++) {
                answer += Integer.parseInt(split[i]);
            }
            return answer;
        }
}