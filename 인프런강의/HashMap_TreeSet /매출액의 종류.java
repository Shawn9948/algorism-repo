
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public String solution(int size, int range, int[] arr) {
        StringBuilder sb = new StringBuilder();
        int lp = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < range - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int rp = range - 1; rp < size; rp++) {
            map.put(arr[rp], map.getOrDefault(arr[rp], 0) + 1);
            sb.append(map.size()).append(" ");
            map.put(arr[lp], map.get(arr[lp]) - 1);
            if (map.get(arr[lp]) == 0) map.remove(arr[lp]);
            lp++;
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int range = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Main main = new Main();
        System.out.println(main.solution(size, range, arr));
        return;
    }
}
