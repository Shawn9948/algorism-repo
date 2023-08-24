
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
     public int[] solution(int[] arr) {
         int[] dp = new int[arr.length];
         dp[0] = arr[0];
         for(int i = 1; i < dp.length; i++){
             dp[i] = dp[i - 1] + arr[i];
         }
         return dp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Main main = new Main();
        int[] dp = main.solution(arr);

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int lp = Integer.parseInt(st.nextToken());
            int rp = Integer.parseInt(st.nextToken());

            if (lp == 1) {
                sb.append(dp[rp - 1]).append("\n");
            } else {
                sb.append(dp[rp - 1] - dp[lp - 2]).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}