class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ");
        int count = -1;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32) {
                answer += " ";
                count = -1;
            } else {
                count++;
                String word = String.valueOf(s.charAt(i));
                answer += count % 2 == 0 ? word.toUpperCase() : word.toLowerCase();
            }
        }
        return answer;
    }
}