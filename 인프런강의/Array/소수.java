import java.util.Scanner;

public class Main {

    public int solution(int num) {
        int count = 1;
        boolean isPrime = true;
        for (int i = 3; i <= num; i++) {
            if (i % 2 == 0) continue;
            for (int j = 3; j <= Math.sqrt(i); j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
            isPrime = true;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input2 = in.nextInt();
        Main main = new Main();
        System.out.println(main.solution(input2));
        return;
    }
}
