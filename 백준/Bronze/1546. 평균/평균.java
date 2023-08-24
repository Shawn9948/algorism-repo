
import java.io.*;
import java.util.Arrays;

public class Main {
     public double solution(int n, String m) {
        double answer = 0;
        long max = 1;
        long total = 0;
        long[] arr = Arrays.stream(m.split(" ")).mapToLong(Long::parseLong).toArray();
        for (long l : arr) {
            if(max < l)
                max = l;
            total += l;
        }

        for (long l : arr) {
            answer += (double)l / max * 100;
        }

        answer /= n;
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String m = br.readLine();

        Main main = new Main();
        System.out.println(main.solution(n, m));
    }
}