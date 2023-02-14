import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution(int size, int[][] arr) {
        int[][] student = new int[size][size];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (arr[j][i] == arr[k][i]) {
                        student[j][k] = 1;
                        student[k][j] = 1;
                    }
                }
            }
        }

        int max = 0;
        int result = 1;
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (student[i][j] == 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                result = i + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[][] arr = new int[input1][5];
        Main main = new Main();
        for (int i = 0; i < input1; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(main.solution(input1, arr));
        return;
    }
}
