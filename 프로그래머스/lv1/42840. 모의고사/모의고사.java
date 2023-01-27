import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[0];

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int aI = 0;
        int bI = 0;
        int cI = 0;
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            int num = answers[i];
            if (num == a[aI]) {
                aCount++;
            }
            if (num == b[bI]) {
                bCount++;
            }
            if (num == c[cI]) {
                cCount++;
            }
            aI++;
            bI++;
            cI++;
            if (aI == a.length) {
                aI = 0;
            }
            if (bI == b.length) {
                bI = 0;
            }
            if (cI == c.length) {
                cI = 0;
            }

        }
        
        Map<String, Integer> map = new HashMap<>();
        map.put("1", aCount);
        map.put("2", bCount);
        map.put("3", cCount);

        List<Integer> collect = new ArrayList<>(map.values());
        collect.sort(Comparator.reverseOrder());
        

        Integer integer = collect.get(0);

        for (int i = 1; i <= 3; i++) {
            if (map.get(String.valueOf(i)).equals(integer)) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length - 1] = i;
            }
        }
        return answer;
    }

}