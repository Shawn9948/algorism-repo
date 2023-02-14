import java.util.Scanner;

public class Main {

    public int solution(int size, int[][] arr) {
        int count = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boolean check = true;
                for (int k = 0; k < dx.length; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < size && ny >= 0 && ny < size && arr[i][j] <= arr[nx][ny]) {
                        check = false;
                        break;
                    }
                }
                if (check) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        Main main = new Main();
        int[][] arr = new int[input1][input1];
        for (int i = 0; i < input1; i++) {
            for (int j = 0; j < input1; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(main.solution(input1, arr));
        return;
    }
}
