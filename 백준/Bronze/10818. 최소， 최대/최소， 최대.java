import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //배열 생성
        int[] numArr = new int[N];
        int max = -1000000;
        int min = 1000000;
        for (int i = 0; i < N; i++) {
            numArr[i] = sc.nextInt();
            if (max < numArr[i])
                max = numArr[i];
            if (min > numArr[i])
                min = numArr[i];
        }

        System.out.println(min + " " + max);

    }
}
