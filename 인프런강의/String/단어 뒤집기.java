import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public String solution(String str) {
        String answer = "";
        char[] x = str.toCharArray();
        int lt = 0;
        int rt = x.length - 1;

        while (lt < rt) {
          //핵심 알고리즘 
            char space = x[lt];
            x[lt] = x[rt];
            x[rt] = space;
            lt++;
            rt--;
        }
        answer = String.valueOf(x);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Main main = new Main();

        int times = Integer.parseInt(br.readLine());

        for (int i = 0; i < times; i++) {
            sb.append(main.solution(br.readLine()) + "\n");
        }
        System.out.println(sb);
        return;
    }
}
