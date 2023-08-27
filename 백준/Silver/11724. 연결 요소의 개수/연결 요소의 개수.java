import java.lang.reflect.Array;
import java.util.*;
import java.io.*;


public class Main {
    static int answer = 0;
    static boolean[] ch;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main main = new Main();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N + 1][N + 1];
        ch = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        for (int i = 1; i < arr.length; i++) {
            if (!ch[i]) {
                dfs(arr, i);
                answer++;
            }
        }

        System.out.println(answer);
    }

    private static void dfs(int[][] arr, int index) {
        ch[index] = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[index][i] == 1) {
                arr[index][i] = 0;
                arr[i][index] = 0;
                dfs(arr, i);
            }
        }
    }
}