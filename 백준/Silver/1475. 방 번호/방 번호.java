import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] split = br.readLine().split("");
        int[] check = new int[10];

        for (int i = 0; i < split.length; i++) {
            int i1 = Integer.parseInt(split[i]);
            if (i1 == 6) {
                check[9]++;
            } else {
                check[i1]++;
            }
        }

        int result = 0;
        for (int i = 0; i < 9; i++) {
            if (result < check[i]) 
                result = Math.max(result, check[i]);
        }
        
        int nine = check[9] / 2;
        if (check[9] % 2 == 1) nine++;
        result = Math.max(result, nine);

        System.out.println(result);
    }
}


