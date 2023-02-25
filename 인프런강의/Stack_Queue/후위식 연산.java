import java.util.*;

public class Main {

    public int solution(String str) {
        Stack<Integer> intStack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (!Character.isDigit(x)) {
                int p2 = intStack.pop();
                int p1 = intStack.pop();
                intStack.push((curator(x, p1, p2)));
            } else {
                intStack.push(x - '0');
            }
        }
        return intStack.get(0);
    }

    public int curator(char x, int p1, int p2) {
        switch (x) {
            case '+':
                return p1 + p2;
            case '-':
                return p1 - p2;
            case '*':
                return p1 * p2;
            case '/':
                return p1 / p2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        Main main = new Main();
        System.out.println(main.solution(input1));
        return;
    }
}
