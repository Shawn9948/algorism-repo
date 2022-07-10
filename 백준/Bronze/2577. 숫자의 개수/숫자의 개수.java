import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int result = A * B * C;
        String temp = Integer.toString(result);
        int[] digits = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            digits[i] = temp.charAt(i) - '0';
        }
        int count = 0;
        int[] answer = new int[10];
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < digits.length; j++) {
                if (digits[j] == i) {
                    answer[i] += 1;
                }
            }
            System.out.println(answer[i]);
        }
    }
}

