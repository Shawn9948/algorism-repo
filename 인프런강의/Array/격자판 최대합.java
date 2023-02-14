import java.util.Scanner;

public class Main {

    public int solution(int size, int[][] arr) {
        int answer = 0;
        int lCross = 0;
        int rCross = 0;
        for (int i = 0; i < size; i++) {
            lCross += arr[i][i];
            rCross += arr[i][size - i - 1];
        }
        answer = Math.max(lCross, rCross);

        int wMax = 0;
        int lMax = 0;
        for (int i = 0; i < size; i++) {
            int widthSum = 0;
            int lengthSum = 0;
            for (int k = 0; k < size; k++) {
                widthSum += arr[i][k];
                lengthSum += arr[k][i];
            }
            if (wMax < widthSum) wMax = widthSum;
            if (lMax < lengthSum) lMax = lengthSum;
        }
        answer = Math.max(answer, wMax);
        answer = Math.max(answer, lMax);

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[][] arr = new int[input1][input1];
        for (int i = 0; i < input1; i++) {
            for (int j = 0; j < input1; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        Main main = new Main();
        System.out.println(main.solution(input1, arr));
        return;
    }
}
