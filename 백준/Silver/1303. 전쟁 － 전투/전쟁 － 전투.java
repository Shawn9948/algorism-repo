import java.util.*;
import java.io.*;


public class Main {
    static String[][] board;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        board = new String[m][n];
        for (int i = 0; i < board.length; i++) {
            board[i] = br.readLine().split("");
        }
        int wPower = 0;
        int bPower = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j].equals("W")) {
                    wPower += (int) Math.pow(bfs(new int[]{i, j}, "W"), 2);
                } else if (board[i][j].equals("B")) {
                    bPower += (int) Math.pow(bfs(new int[]{i, j}, "B"), 2);
                }

            }
        }
        System.out.println(wPower + " " + bPower);
    }

    private static int bfs(int[] index, String target) {
        int power = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(index);
        board[index[0]][index[1]] = "x";

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length && !board[nx][ny].equals("x")) {
                    if (board[nx][ny].equals(target)) {
                        board[nx][ny] = "x";
                        power++;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }

        }
        return power;
    }
}