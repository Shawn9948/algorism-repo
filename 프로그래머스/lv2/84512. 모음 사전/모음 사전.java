import java.util.*;
class Solution {
    private static String[] words = {"A", "E", "I", "O", "U"};
    private static int answer = 0;
    private static boolean flag = false;
    
    public int solution(String word) {
        int depth = 0;
        dfs(word, depth, "");    
        return answer-1;
    }
    
    private static void dfs(String word, int depth, String target){
        if(flag) return;
        if(target.equals(word)) flag = true;
        answer++;
        if(depth == 5) return;
        for(int i = 0; i< words.length; i++){
            dfs(word, depth+1, target + words[i]);
        } 
    }
}