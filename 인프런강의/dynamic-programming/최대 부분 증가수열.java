import java.util.Scanner;

public class Main {

    public int solution(int n, int[] arr) {
        int[] dp = new int[n];
        dp[0] = 1;
        int answer = 0;

        for (int i = 1; i < n; i++) {
            int max = 0;
            int point = 1;
            for (int y = 0; y < i; y++) {
                if (arr[y] < arr[i])
                    max = Math.max(dp[y], max);
            }
            point += max;
            dp[i] = point;
        }
        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, dp[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Main m = new Main();
        System.out.println(m.solution(n, arr));
    }
}
