class Solution {
    public String solution(String s) {
        String answer = "";
       
        int index = s.length() / 2;
        
        if (s.length() % 2 == 0) {
            char c = s.charAt(index-1);
            char d = s.charAt(index);
            answer += String.valueOf(c) + String.valueOf(d);
        } else {
            answer += s.charAt(index);
        }
        return answer;
    }
}