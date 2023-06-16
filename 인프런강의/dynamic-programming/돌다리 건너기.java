import java.util.Scanner;

public class Main {

    public int solution(int n) {
        int lp = 1;
        int rp = 2;
        int tmp = 0;
        while (n > 2) {
            n--;
            tmp = lp + rp;
            lp = rp;
            rp = tmp;
        }
        return lp + rp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main main = new Main();
        int n = in.nextInt();
        System.out.println(main.solution(n));
    }
}
