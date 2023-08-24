import java.util.*;
import java.io.*;


public class Main {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lp = 0;
        int rp = arr.length - 1;

        while (lp < rp) {
            int target = arr[lp] + arr[rp];
            if (target == m) {
                answer++;
                lp++;
            } else if (target < m) {
                lp++;
            } else {
                rp--;
            }
        }
        return answer;
    }
//1 2 3 4 5 7
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main main = new Main();
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(main.solution(n, m, arr));
    }
}