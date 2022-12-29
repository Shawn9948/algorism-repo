import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        for (int i = 0; i < arr.length; i++) {
            int checkNum = arr[i];
            if (checkNum >= divisor && checkNum % divisor == 0) {
                answer = addNum(answer, checkNum);
            }
        }
        if (answer.length == 0) {
            answer = addNum(answer, -1);
        }
        Arrays.sort(answer);
        return answer;
    }
    private int[] addNum(int[] answer, int x) {
        answer = Arrays.copyOf(answer, answer.length + 1);
        answer[answer.length - 1] = x;
        return answer;
    }
}