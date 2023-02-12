import java.util.*;

public class Main {

    public String solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int x : arr) {
            list.add(x);
        }
        Collections.sort(list, Comparator.reverseOrder());

        Map<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int x : list) {
            map.put(x, map.getOrDefault(x, count));
            count++;
        }
        String answer = "";

        for (int x : arr) {
            answer += map.get(x) + " ";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] arr = new int[input1];
        for (int i = 0; i < input1; i++) {
            arr[i] = in.nextInt();
        }
        Main main = new Main();
        System.out.println(main.solution(arr));
        return;
    }
}
