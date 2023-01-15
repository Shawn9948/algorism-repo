class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            char cha = s.charAt(i);
            if(cha==' ') {
                answer += cha;
                continue;
            }
            if(cha>='a' && cha<='z') {
                if(cha+n > 'z') {
                    answer += (char)(cha-26+n);
                }else {
                    answer += (char)(cha+n);
                }
            }else if(cha>='A' && cha<='Z') {
                if(cha+n > 'Z') {
                    answer += (char)(cha-26+n);
                }else {
                    answer += (char)(cha+n);
                }
            }
        }
        return answer;
    }
}