class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = n;
        int b = m;
        int r = 0;
        
        if(n > m){
            a = m;
            b = n;
        }
    
        while(a>0){
            
            r = b%a;
            b = a;
            a = r;
        }
        answer[0] = b;
    
       answer[1] = (m*n) / b;
        return answer;
    }
}