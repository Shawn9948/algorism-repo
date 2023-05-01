import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    Map<Integer, Boolean> isChecked = new HashMap<>();

    public int solution(int size, int[] students) {
        int count = size;
        for (int i = 0; i < size; i++) {
            ArrayDeque<Integer> stack = new ArrayDeque<>();
            count -= dfs(students, i, stack);
        }
        return count;
    }

    public int dfs(int[] students, int number, ArrayDeque<Integer> stack) {
        int target = students[number] - 1;
        if (Boolean.TRUE.equals(isChecked.getOrDefault(number, false)))
            return 0;
        isChecked.put(number, true);
        stack.addLast(number);
        if (Boolean.TRUE.equals(isChecked.getOrDefault(target, false))) {
            while (!stack.isEmpty()) {
                if (target == stack.peekFirst())
                    break;
                stack.poll();
            }
            return stack.size();
        }
        return dfs(students, target, stack);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            int size = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Main main = new Main();
            sb.append(main.solution(size, arr)).append("\n");
        }
        System.out.println(sb);
    }
}

