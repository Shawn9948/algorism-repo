import java.util.Scanner;

public class Main {

    public int solution(int size, int target, int[] arr) {
        int lp = 0, count = 0, sum = 0;

        for (int rp = 0; rp < size; rp++) {
            sum += arr[rp];
            if (sum == target) count++;

            while (sum >= target) {
                sum -= arr[lp++];
                if (sum == target) count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int[] arr = new int[input1];
        for (int i = 0; i < input1; i++) {
            arr[i] = in.nextInt();
        }
        Main main = new Main();
        System.out.println(main.solution(input1, input2, arr));
        return;
    }
}
