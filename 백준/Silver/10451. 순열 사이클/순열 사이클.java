import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public int solution(int size, int[] numbers) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] != 0) {
                dfs(numbers, i);
                result++;
            }
        }
        return result;
    }

    public void dfs(int[] numbers, int index) {
        if (numbers[index] != 0) {
            int nextTarget = numbers[index]-1;
            numbers[index] = 0;
            dfs(numbers, nextTarget);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main main = new Main();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int loopCount = Integer.parseInt(br.readLine());

        while (--loopCount >= 0) {
            int size = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            sb.append(main.solution(size, arr)).append("\n");
        }
        System.out.println(sb);
    }
}