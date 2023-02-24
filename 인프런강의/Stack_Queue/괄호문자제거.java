import java.util.*;

public class Main {

    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') while (stack.pop() != '(') ;
            else stack.push(x);
        }
        for (Character character : stack) {
            answer += character;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        Main main = new Main();
        System.out.println(main.solution(input1));
        return;
    }
}
