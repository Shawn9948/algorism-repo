import java.util.*;

public class Main {

    String answer = "NO";
    static int n = 0;
    static int total = 0;
    boolean checker = false;

    public void solution(int level, int sum, int[] arr) {
        if (checker)
            return;
        if (total / 2 < sum)
            return;
        if (level == n) {
            if ((total - sum) == sum) {
                checker = true;
                answer = "YES";
            }
        } else {
            solution(level + 1, sum + arr[level], arr);
            solution(level + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        total = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            arr[i] = input;
            total += input;
        }
        Main main = new Main();
        main.solution(0, 0, arr);
        System.out.println(main.answer);
    }
}




