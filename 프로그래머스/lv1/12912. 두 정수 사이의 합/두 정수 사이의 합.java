class Solution {
        public long solution(int a, int b) {
        long answer = 0;
        int max = b;
        int min = a;

        if (a > b) {
            max = a;
            min = b;
        }

        for (int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }
}