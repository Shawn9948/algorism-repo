import java.util.*;
import java.io.*;


public class Main {
    static int[][] arr;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            arr[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        }
        int[] start = new int[]{0, 0, 1};
        int[] end = new int[]{N - 1, M - 1, 1};

        answer = bfs(start, end);


        System.out.println(answer);
    }

    private static int bfs(int[] start, int[] end) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(start);
        boolean[][] ch = new boolean[arr.length][arr[0].length];
        ch[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            int point = now[2];

            if (x == end[0] && y == end[1]) {
                return point;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[0].length && !ch[nx][ny]) {
                    if (arr[nx][ny] != 0) {
                        ch[nx][ny] = true;
                        queue.offer(new int[]{nx, ny, point + 1});
                    }
                }
            }
        }
        return -1;
    }
}