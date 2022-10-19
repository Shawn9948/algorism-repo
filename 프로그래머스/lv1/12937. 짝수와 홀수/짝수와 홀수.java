class Solution {
    public String solution(int num) {
        String answer = "Odd";
        if(num == 0){
            return "Even";
        }else if(num == 1){
            return "Odd";
        }
        
        if(num%2 ==0){
            answer = "Even";
        }
        return answer;
    }
}