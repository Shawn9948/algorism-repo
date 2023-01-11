class Solution {
    public long solution(long n) {
        long answer = -1;
        long i = 1;
        
        while(i * i <= n){
            if(i * i == n){
                long targetI = i+1;
                answer = targetI * targetI;
                break;
            }
            i++;
        }
        
        return answer;
    }
}