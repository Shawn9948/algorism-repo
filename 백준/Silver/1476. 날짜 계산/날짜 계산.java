import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] range = new int[3];
        range[0] = 15;
        range[1] = 28;
        range[2] = 19;
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] target = new int[3];
        for (int i = 0; i < target.length; i++) {
            target[i] = 1;
        }
        int year = 1;
        while (true) {
            if (target[0] == arr[0] && target[1] == arr[1] && target[2] == arr[2]) break;
            year++;
            for (int i = 0; i < target.length; i++) {
                target[i]++;
                if (target[0] > 15) {
                    target[0] = 1;
                }
                if (target[1] > 28) {
                    target[1] = 1;
                }
                if (target[2] > 19) {
                    target[2] = 1;
                }
            }

        }
        System.out.println(year);
    }
}
