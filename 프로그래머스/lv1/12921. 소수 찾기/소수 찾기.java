class Solution {
    public int solution(int n) {
        int answer = 1;
        boolean check = true;

        for (int i = 3; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 3; j <= Math.sqrt(i); j += 2) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                answer++;
            }
            check = true;
        }


        return answer;
    }

}