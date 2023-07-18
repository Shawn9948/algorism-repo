import java.util.*;

public class Main {
    public int solution(int n, int s, int[] arr) {
        int answer = Integer.MAX_VALUE;
        int lp = 0;
        int rp = 0;
        int total = 0;
        while (lp <= rp) {
            if (total >= s) {
                total -= arr[lp++];
            }
            else if (rp == n) break;
            else {
                total += arr[rp++];
            }
            if (total >= s) {
                answer = Math.min(answer, (rp - lp));
            }
        }
        if (answer == Integer.MAX_VALUE) answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Main m = new Main();
        System.out.println(m.solution(n, s, arr));
    }
}

