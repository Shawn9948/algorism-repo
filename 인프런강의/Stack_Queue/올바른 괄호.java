import java.util.*;

public class Main {

    public String solution(String str) {
        char[] arr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char x : arr) {
            if (x == '(') {
                stack.add('y');
            } else {
                if (stack.size() == 0) return "NO";
                stack.pop();
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        Main main = new Main();
        System.out.println(main.solution(input1));
        return;
    }
}
