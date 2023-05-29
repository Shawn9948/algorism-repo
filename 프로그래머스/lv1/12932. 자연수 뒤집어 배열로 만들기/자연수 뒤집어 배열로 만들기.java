
class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        char[] targets = String.valueOf(n).toCharArray();
        answer = new int[targets.length];
        int index = targets.length-1;
        for(int i = index; i >= 0; i--){
            answer[index-i] = targets[i] -'0';
        }
        return answer;
    }
}
