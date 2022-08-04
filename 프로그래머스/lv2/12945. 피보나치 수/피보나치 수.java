class Solution {
    public int solution(int n) {
        int answer = 0;
        int fiboFirst = 0; 
        int fiboSecond = 1;
        int newFibo = 0;
        for(int i =2; i<=n; i++){
            
            newFibo = fiboFirst + fiboSecond;
        
            fiboFirst = fiboSecond;
            fiboSecond = newFibo%1234567;
            
            

            
        }
    
     
        return fiboSecond;
    }
}