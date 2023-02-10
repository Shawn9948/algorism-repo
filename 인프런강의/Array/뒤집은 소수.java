import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public String solution(String[] arr) {
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            String s = new StringBuilder(arr[i]).reverse().toString();

            int target = Integer.parseInt(s);

            if (target != 2 && target % 2 == 0) continue;

            if (target == 1) continue;

            boolean check = isPrime(target);

            if (check) answer += target + " ";
        }

        return answer;
    }

    private boolean isPrime(int target) {
        for (int j = 3; j <= Math.sqrt(target); j+=2) {
            if (target % j == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        String[] arr = new String[input1];
        for (int i = 0; i < input1; i++) {
            arr[i] = in.next();
        }
        Main main = new Main();
        System.out.println(main.solution(arr));
        return;
    }
}
