import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> hear = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            hear.put(name, name);
        }
        HashMap<String, String> result = new HashMap<>();
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (hear.containsKey(name)) {
                result.put(name, name);
            }
        }
        sb.append(result.size() + "\n");
        Object[] mapkey = result.keySet().toArray();
        
        Arrays.sort(mapkey);
        
        for (Object key : mapkey) {
            sb.append(key+"\n");
        }
        System.out.println(sb);
    }
}