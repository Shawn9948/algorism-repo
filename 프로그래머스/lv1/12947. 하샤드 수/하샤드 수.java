class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int hashadNumber = 0;
        
        String str = String.valueOf(x);
        
        for(int i = 0; i<str.length(); i++){
            hashadNumber += str.charAt(i)-'0';
        }
        
        if(x % hashadNumber == 0) answer = true;
        
        return answer;
    }
}