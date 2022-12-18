import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int result = 0;
        int number = 1;
        int totalCount = 1;
        int count = 0;

        while (B >= totalCount) {
            count++;
            
            if (A <= totalCount) {
                result += number;
            }
            
            if (number == count) {
                number+=1;
                count = 0;
            }
            
            totalCount++;
        }
        System.out.println(result);
    }
}