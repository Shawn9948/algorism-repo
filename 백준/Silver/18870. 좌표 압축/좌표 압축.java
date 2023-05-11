import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        int[] array = set.stream().mapToInt(a -> a).toArray();
        Arrays.sort(array);

        Map<Integer, Integer> map = new HashMap<>();
        int j = 0;
        for (Integer integer : array) {
            Integer value = map.get(integer);   
            if (value != null) {
                map.put(integer, value);
            } else {
                map.put(integer, j);
                j++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb);
    }
}
