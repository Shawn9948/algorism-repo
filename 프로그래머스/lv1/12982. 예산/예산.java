import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = d.length;
        int totalPrice = 0;

        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            totalPrice += d[i];
            if (totalPrice > budget) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}