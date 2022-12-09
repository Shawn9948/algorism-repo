import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    /*
        push X: 정수 X를 스택에 넣는 연산이다.
        pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        size: 스택에 들어있는 정수의 개수를 출력한다.
        empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
        top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
         */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        List<Integer> stack = new ArrayList<>();

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] order = br.readLine().split(" ");
            switch (order[0]) {
                case "push":
                    push(stack, Integer.parseInt(order[1]));
                    break;
                case "pop":
                    System.out.println(pop(stack));
                    break;
                case "size":
                    System.out.println(size(stack));
                    break;
                case "empty":
                    System.out.println(empty(stack));
                    break;
                case "top":
                    System.out.println(top(stack));

            }
        }
    }

    private static void push(List<Integer> stack, Integer x) {
        stack.add(x);
    }

    private static Integer pop(List<Integer> stack) {
        if (stack.size() == 0) {
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    private static Integer size(List<Integer> stack) {
        return stack.size();
    }

    private static Integer empty(List<Integer> stack) {
        if (stack.size() == 0) {
            return 1;
        }
        return 0;
    }

    private static Integer top(List<Integer> stack) {
        if (stack.size() == 0) {
            return -1;
        }
        return stack.get(stack.size() - 1);
    }
}
