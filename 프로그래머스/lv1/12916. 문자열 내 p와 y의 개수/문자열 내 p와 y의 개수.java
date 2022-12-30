class Solution {
     boolean solution(String s) {
        boolean answer = false;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);

            if (target == 'p' || target == 'P') {
                count++;
            }
            if (target == 'y' || target == 'Y') {
                count--;
            }
        }

        if (count == 0) {
            answer = true;
        }
        return answer;
    }
}