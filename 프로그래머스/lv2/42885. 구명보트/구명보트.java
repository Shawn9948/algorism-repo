import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        int lp = 0;
        Arrays.sort(people);
        for (int rp = people.length-1; rp >= lp ; rp--) {
            if(people[lp] + people[rp] <= limit) lp++;
            answer++;
        }

        return answer;
    }
}