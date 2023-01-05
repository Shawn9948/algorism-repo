import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Map<Integer, Integer> cardMap = new HashMap<>();

        StringTokenizer cardInput = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(cardInput.nextToken());
            cardMap.put(key, cardMap.getOrDefault(key, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());

        StringTokenizer checkCardInput = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(checkCardInput.nextToken());
            Integer value = cardMap.get(key);
            
            if (value == null) {
                sb.append(0 + " ");
            } else {
                sb.append(value+ " ");
            }
        }
        System.out.println(sb);
    }
}
