import java.util.*;

public class Main {

    public int solution(int n1, int n2) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        for (int i = 2; i <= n1; i++) {
            queue.add(i);
        }
        int count = 1;
        while (queue.size() > 1) {
            int num = queue.remove();
            if (count % n2 != 0) queue.add(num);
            count++;
        }
        return queue.remove();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        Main main = new Main();
        System.out.println(main.solution(input1, input2));
        return;
    }
}
