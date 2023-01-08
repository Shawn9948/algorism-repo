import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[1];

        if (arr.length == 0) {
            answer[0] = -1;
            return answer;
        }
        int minNum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }

        answer = new int[arr.length - 1];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            int target = arr[i];
            if (target == minNum) {
                continue;
            }
            answer[j] = arr[i];
            j++;
        }
        return answer;
    }
}