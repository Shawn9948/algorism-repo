class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i<= n; i++){
            int target = i;    
            for(int j = i+1; j<= n; j++){
                if(target == n) {
                    answer++;
                    break;
                }else if(target > n)
                    break;
                target +=j;
            }
        }
        //마지막 숫자는 항상 같은 값이 나온다. 
        return answer+1;
    }
}