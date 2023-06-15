import java.util.Scanner;

public class Main {

    public int solution(int n) {
        int answer = 0;
        int lp = 1;
        int rp = 2;
        int tmp = 2;
        while (tmp < n) {
            tmp++;
            answer = lp + rp;
            lp = rp;
            rp = answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main main = new Main();
        int n = in.nextInt();
        System.out.println(main.solution(n));
    }
}
