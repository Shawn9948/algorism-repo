import java.util.Scanner;

//정렬하고 기존 배열과 인덱스 값이 다른것을 answer에 넣는다.
public class Main {

    public String solution(int size, int[] arr) {
        String answer = "";
        int[] duplicate = new int[size];
        for (int i = 0; i < size; i++) {
            duplicate[i] = arr[i];
        }
        for (int i = 0; i < size - 1; i++) {
            int j = i;
            while (arr[j] > arr[j + 1]) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    j--;
                }
            }
        }
        for (int i = 0; i < size; i++) if (arr[i] != duplicate[i]) answer += i + 1 + " ";
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
        System.out.println(main.solution(input1, arr));
        return;
    }
}
