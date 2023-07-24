import java.util.*;
class Solution {
    public long solution(int n) {
        long answer = 0;
        //n이 1일 가능성이 있기 때문에 n+2로 초기화 진행
        long[] dp = new long[n+2];
        dp[1] = 1L;
        dp[2] = 2L;
        for(int i = 3; i< n+1; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        answer = dp[n];
        return answer;
    }
}