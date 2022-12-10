import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String[] A = br.readLine().split(" ");
        Arrays.sort(A);

        int MCount = Integer.parseInt(br.readLine());
        String[] MNumber = br.readLine().split(" ");

        for (int i = 0; i < MCount; i++) {
            int i1 = Arrays.binarySearch(A, MNumber[i]);
            
            if (i1 >= 0) {
                sb.append(1 + "\n");
            } else {
                sb.append(0 + "\n");
            }
        }
        System.out.println(sb);
    }
}


