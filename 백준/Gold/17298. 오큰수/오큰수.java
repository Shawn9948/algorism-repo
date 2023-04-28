import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public String solution(int size, int[] numbers) {
        int top = -1;
        int[] stack = new int[numbers.length];

        for (int i = 0; i < size; i++) {
            while (top != - 1 && numbers[stack[top]] < numbers[i]) {
                numbers[stack[top]] = numbers[i];
                top--;
            }
            top++;
            stack[top] = i;
        }
        for(int i = top; i >= 0; i--) {
            numbers[stack[i]] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            sb.append(number).append(' ');
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main main = new Main();
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(main.solution(count, arr));
    }
}