import java.util.Scanner;

public class Main {

    public int solution(int target, int[] arr) {

        int lp = 0, sum = 0, count = 0;

        for (int rp = 0; rp < arr.length - 1; rp++) {
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
        int[] arr = new int[input1];
        for (int i = 0; i < input1 - 1; i++) {
            arr[i] = i + 1;
        }
        Main main = new Main();
        System.out.println(main.solution(input1, arr));
        return;
    }
}
