import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] xNums = new int[10];
        int[] yNums = new int[10];
        for(char x : X.toCharArray()){
            xNums[x-'0']++;
        }
        for(char y : Y.toCharArray()){
            yNums[y-'0']++;
        }
        for(int i = 9; i >=0; i--){
            while(xNums[i] > 0 && yNums[i] > 0){
                answer.append(i);
                xNums[i]--;
                yNums[i]--;
            }
        }
        if(answer.length() == 0) return "-1";
        else if(answer.charAt(0) == '0') return "0";
        return answer.toString();
    }
}