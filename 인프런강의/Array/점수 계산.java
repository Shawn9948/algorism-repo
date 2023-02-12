import java.util.Scanner;

public class Main {

    public int solution(int[] arr) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count = 0;
            } else {
                count++;
                answer += count;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] arr = new int[input1];

        for (int i = 0; i < input1; i++) {
            arr[i] = in.nextInt();
        }
        Main main = new Main();
        System.out.println(main.solution(arr));
        return;
    }
}
