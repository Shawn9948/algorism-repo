class Solution {
    public int solution(long num) {
        int answer = -1;
        int i = 1;
        
        if(num == 1){
            return 0;
        }
        
        while(i <= 500){
            num = num % 2 == 0 ? num / 2 : (num*3) +1;
            
              if(num == 1){
                answer = i;
                break;
            }
            i++;            
        }
        return answer;
    }
}