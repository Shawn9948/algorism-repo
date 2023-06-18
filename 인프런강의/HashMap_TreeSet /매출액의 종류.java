import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    private final Map<Integer, Integer> moneyCount = new HashMap<>();
    public String solution(int n, int k, int[] arr){
        StringBuilder sb = new StringBuilder();
        int lp = 0;
        put(arr[lp]);
        int rp = lp+1;
        while(rp < n){
            put(arr[rp]);
            if((rp-lp) == (k-1)) {
                sb.append((long) moneyCount.keySet().size()).append(" ");
                remove(arr[lp]);
                lp++;
            }
            rp++;
        }
        return sb.toString();
    }

    private void put(int arr) {
        moneyCount.put(arr, moneyCount.getOrDefault(arr, 0) + 1);
    }
    private void remove(int arr) {
        Integer count = moneyCount.get(arr);
        if(count > 1) moneyCount.put(arr, count-1);
        else moneyCount.remove(arr);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i< n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Main m = new Main();
        System.out.println(m.solution(n,k,arr));
    }
}
