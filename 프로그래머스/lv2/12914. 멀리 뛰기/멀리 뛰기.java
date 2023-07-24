class Solution {
    public long solution(int n) {
        long answer = 0;
        long[] dp = new long[n+2];
        dp[1] = 1L;
        dp[2] = 2L;
        
        for(int i = 3; i< n+2; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        answer = dp[n];
        return answer;
    }
}