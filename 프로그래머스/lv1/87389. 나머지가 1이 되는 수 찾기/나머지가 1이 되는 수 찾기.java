class Solution {
    public int solution(int n) {
        int answer = 0;
        int testNum = n-1;
        int i = 2;
        while(i<=1000000){
            if(testNum % i == 0){
                answer = i;
                break;
            }
            i++;
        }
        return answer;
    }
}