import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                sum += i;
                min = Math.min(i, min);
            }
        }

        String answer = sum == 0 ? "-1" : sum + "\n" + min;
        System.out.println(answer);

    }

    private static boolean isPrime(int i) {
        if (i == 0 || i == 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}