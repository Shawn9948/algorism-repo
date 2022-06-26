import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num - 1; i >= 0; i--) {
            for (int j = 0; j < num; j++) {
                if (j < i)
                    System.out.print(" ");
                else if (j >= i) {
                    System.out.print("*");
                }
                if (j == num - 1)
                    System.out.println();
            }
        }
    }
}