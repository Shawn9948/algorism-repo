import java.lang.reflect.Array;
import java.util.*;
import java.io.*;


public class Main {
    static int answer = 0;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main main = new Main();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()) + 2;
        int M = Integer.parseInt(st.nextToken()) + 2;
        int[][] arr = new int[N][M];
        for (int i = 1; i < N - 1; i++) {
            int[] array = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
            for (int j = 1; j < M - 1; j++)
                arr[i][j] = array[j - 1];
        }
        boolean[][] ch = new boolean[N][M];
        ch[1][1] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{1, 1});
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = now[0] + dx[i];
                int y = now[1]+dy[i];
                if (arr[x][y] != 0 && !ch[x][y]) {
                    arr[x][y] = arr[now[0]][now[1]] + 1;
                    ch[x][y] = true;
                    queue.offer(new int[]{x, y});
                }
            }
        }
        answer = arr[N - 2][M - 2];
        System.out.println(answer);
    }
}