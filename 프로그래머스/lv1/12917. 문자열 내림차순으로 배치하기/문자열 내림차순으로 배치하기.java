import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        String[] strArr = new String[length];

        for (int i = 0; i < length; i++) {
            strArr[i] = String.valueOf(s.charAt(i));
        }

        Arrays.sort(strArr, Comparator.reverseOrder());

        for (int i = 0; i < length; i++) {
            answer += strArr[i];
        }
        return answer;
    }
}