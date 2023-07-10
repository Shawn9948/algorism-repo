import java.util.*;
class Solution {
    private Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;
        
       for(int i = 0; i< numbers.length(); i++){
           dfs("", numbers);
       }
        for(int x : set){
            if(isPrimary(x)) answer++;
        }
        return answer;
    }
    
    private void dfs(String comb, String others) {
        if (!comb.equals(""))
            set.add(Integer.valueOf(comb));
        for (int i = 0; i < others.length(); i++)
            dfs(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
    }

    private boolean isPrimary(int x) {
        if (x == 0 || x == 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}