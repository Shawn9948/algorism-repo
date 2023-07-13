import java.util.*;
class Solution {
    private Map<Integer, Integer> map = new HashMap<>();
    private int[] arr;
    private int answer = 0;
    private boolean[] ch;
    public int solution(int k, int[][] dungeons) {
        arr = new int[dungeons.length];
        ch = new boolean[arr.length];
        for(int i = 0; i<dungeons.length; i++){
            map.put(dungeons[i][0],dungeons[i][1]);
            arr[i] = dungeons[i][0];
        }
        
        dfs(k, 0);
        return answer;
    }
    
    private void dfs(int k, int deepth){
        for(int i = 0; i < arr.length; i++){
            if(ch[i]) continue;
            if(k < arr[i]) break;
            ch[i] = true;
            dfs(k - map.get(arr[i]), deepth+1);
            dfs(k, deepth);
            ch[i] = false;
        }
        answer = Math.max(answer, deepth);
    }
}

