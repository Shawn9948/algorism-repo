import java.util.Scanner;

/*
선택정렬 맨앞부터 끝까지 돌면서 최고로 작은 인덱스와 n번째 인덱스를 교환하며 끝까지 가는 정렬방법 n^2
*/
public class Main {

    public void swap(int[] arr, int targetIndex, int changeIndex) {
        int tmp = arr[targetIndex];
        arr[targetIndex] = arr[changeIndex];
        arr[changeIndex] = tmp;
    }

    public String solution(int size, int[] arr) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] arr = new int[input1];
        for (int i = 0; i < input1; i++) {
            arr[i] = in.nextInt();
        }
        Main main = new Main();
        System.out.println(main.solution(input1, arr));
        return;
    }
}
