import java.util.Scanner;

public class Main {

    public int solution(int size, int day, int[] arr) {
        int lp = 0, rp = day, max = 0, count = 0;

        for (int i = 0; i < rp; i++) {
            count += arr[i];
        }
        
        while (rp < size) {
            if (max < count) {
                max = count;
            }
            count -= arr[lp++];
            count += arr[rp++];
        }
        return max;
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
