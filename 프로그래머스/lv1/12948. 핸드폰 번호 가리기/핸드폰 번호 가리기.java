class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String invertedAnswer = "";
        for(int i = phone_number.length() -1; i >= 0; i--){
            invertedAnswer += i > phone_number.length() -5 ? 
                phone_number.charAt(i) : "*";
        }
        for(int i = invertedAnswer.length() -1; i >= 0; i--){
            answer += invertedAnswer.charAt(i);
        }
        return answer;
    }
}