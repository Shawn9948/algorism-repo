import java.util.*;
import java.io.*;


public class Main {
    static long answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        dfs(n, m, 1);

        if (answer == Integer.MAX_VALUE)
            answer = -1;

        System.out.println(answer);
    }

    private static void dfs(long num, long target, long count) {
        if (num > target) {
            return;
        } else if (num == target) {
            answer = Math.min(answer, count);
        } else {
            dfs(num * 2, target, count + 1);
            dfs(Long.parseLong(String.valueOf(num) + 1), target, count + 1);
        }
    }
}