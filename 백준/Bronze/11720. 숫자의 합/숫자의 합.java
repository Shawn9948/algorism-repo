
import java.io.*;
import java.util.Arrays;

public class Main {
    public int solution(int n, String m) {
        int answer = 0;
        int[] array = Arrays.stream(m.split("")).mapToInt(Integer::parseInt).toArray();
        for (int i : array) {
            answer += i;
        }
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