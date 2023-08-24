import java.util.*;
import java.io.*;


public class Main {
    public int solution(int num) {
        int answer = 0;
        int[] arr = new int[num];
        for (int i = 1; i <= num; i++) {
            arr[i - 1] = i;
        }
        int lp = 0;
        int rp = 0;
        int sum = 0;
        while (lp <= rp) {
            if (sum < num) {
                sum += arr[rp];
                if (rp + 1 != num) {
                    rp++;
                }
                continue;
            } else if (sum == num) {
                answer++;
            }
            sum -= arr[lp++];
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main m = new Main();
        System.out.println(m.solution(Integer.parseInt(br.readLine())));
    }
}