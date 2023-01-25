class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int count = 0;
        int remainderNum = 0;
        
        
        while(n>=a){
             
            if(n%a != 0){
            remainderNum = n%a;
            }else remainderNum = 0;
            
            n /= a;
            count += n*b;
           
            n = (n*b)+remainderNum;
        }
        answer = count;
        return answer;
    }
}