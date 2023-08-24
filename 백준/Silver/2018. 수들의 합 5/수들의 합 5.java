import java.util.*;
import java.io.*;


public class Main {
    public int solution(int num) {
        int answer = 0;
        int lp = 1;
        int rp = 1;
        int sum = 0;
        while (lp <= rp) {
            if (sum < num) {
                sum += rp;
                if (rp + 1 <= num) {
                    rp++;
                }
                continue;
            } else if (sum == num) {
                answer++;
            }
            sum -= lp++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main m = new Main();
        System.out.println(m.solution(Integer.parseInt(br.readLine())));
    }
}