import java.util.*;

public class Main {

    public String solution(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char x : str.toCharArray()) {
            if (x == '(') count++;
            else if (x == ')') {
                count--;
                continue;
            }
            if (count == 0) sb.append(x);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        Main main = new Main();
        System.out.println(main.solution(input1));
        return;
    }
}
