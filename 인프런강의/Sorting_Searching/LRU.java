import java.util.Scanner;

public class Main {
    public void swap(int[] arr, int targetIndex, int changeIndex) {
        int tmp = arr[targetIndex];
        arr[targetIndex] = arr[changeIndex];
        arr[changeIndex] = tmp;
    }

    public String solution(int cacheSize, int dataCount, int[] arr) {
        int[] area = new int[cacheSize];
        for (int x : arr) {
            boolean isEmpty = true;
            for (int i = 0; i < area.length; i++) {
                if (area[i] == x) {
                    int j = i;
                    while (j > 0) {
                        swap(area, j, j - 1);
                        j--;
                    }
                    isEmpty = false;
                    break;
                }
            }
            if (isEmpty) {
                for (int i = cacheSize - 1; i > 0; i--) area[i] = area[i - 1];
                area[0] = x;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int x : area) sb.append(x).append(" ");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int[] arr = new int[input2];
        for (int i = 0; i < input2; i++) {
            arr[i] = in.nextInt();
        }
        Main main = new Main();
        System.out.println(main.solution(input1, input2, arr));
        return;
    }
}
