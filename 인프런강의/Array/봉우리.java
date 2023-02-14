import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution(int size, int[][] arr) {
        int count = 0;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int target = arr[i][j];
                if (target <= arr[i][j - 1]) {
                } else if (target <= arr[i][j + 1]) {
                } else if (target <= arr[i - 1][j]) {
                } else if (target <= arr[i + 1][j]) {
                } else {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();

        int[][] arr = new int[input1 + 2][input1 + 2];
        for (int i = 1; i <= input1; i++) {
            for (int j = 1; j <= input1; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        Main main = new Main();
        System.out.println(main.solution(input1, arr));
        return;
    }
}
