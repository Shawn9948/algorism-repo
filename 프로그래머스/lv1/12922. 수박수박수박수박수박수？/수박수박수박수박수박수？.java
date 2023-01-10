class Solution {
    public String solution(int n) {
        String answer = "";
        String waterMelon = "수박";
        
        if(n == 1) return "수";
        
        for(int i = 0; i< n/2; i++){
            answer += waterMelon;
        }
        answer += n%2 == 0 ? "" : "수"; 
        
        return answer;
    }
}