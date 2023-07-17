import java.util.Scanner;

public class Main {
    int answer;
    static int weight;

    public int solution(int size, int[] arr) {
        answer = 0;
        dfs(0, arr, 0);
        return answer;
    }

    private void dfs(int index, int[] arr, int sum) {
        if (sum > weight) return;
        if (index == arr.length) {
            answer = Math.max(answer, sum);
        } else {
            dfs(index + 1, arr, sum + arr[index]);
            dfs(index + 1, arr, sum);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        weight = in.nextInt();
        int input2 = in.nextInt();
        int[] arr = new int[input2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        Main m = new Main();
        System.out.println(m.solution(input2, arr));
    }
}
