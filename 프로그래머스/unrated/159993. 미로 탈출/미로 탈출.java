import java.util.*;

class Solution {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static String[][] arr;
    
    public int solution(String[] maps) {
        int answer = 0;
        int [] S = new int[2];
        int [] L = new int[2];
        
        arr = new String[maps.length][maps[0].length()];
        for(int i = 0; i<arr.length; i++){
            arr[i] = maps[i].split("");
            
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j].equals("S")) S = new int[] {i, j};
                if(arr[i][j].equals("L")) L = new int[] {i, j};
            }
        }
        
        int first = bfs(S, "L");
        int second = bfs(L, "E");
        
        if(first== -1 || second == -1) return -1;
        return first + second;
    }
    
    private int bfs (int[] start, String target){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {start[0], start[1], 0});
        boolean[][] ch = new boolean[arr.length][arr[0].length];
        ch[start[0]][start[1]] = true;
        
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            
            int x = now[0];
            int y = now[1];
            int count = now[2];
            
            if(arr[x][y].equals(target)){
                return count;
            }
            
            for(int i = 0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >=0 && ny>= 0 && nx<arr.length && ny < arr[0].length && !ch[nx][ny]){
                    if(!arr[nx][ny].equals("X")){
                        ch[nx][ny] = true;
                        queue.offer(new int[] {nx,ny, count+1});
                    }
                }
            }
        }
        return -1;
   }
}