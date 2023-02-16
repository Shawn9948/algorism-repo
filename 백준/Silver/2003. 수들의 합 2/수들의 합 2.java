import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0, count = 0, lp = 0;

        for (int rp = 0; rp < n; rp++) {
            sum += arr[rp];
            if (sum == m) count++;
            while (sum >= m) {
                sum -= arr[lp++];
                if (sum == m) count++;
            }
        }
        System.out.println(count);
    }
}