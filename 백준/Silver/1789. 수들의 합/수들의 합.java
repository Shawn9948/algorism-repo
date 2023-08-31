import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        int answer = 0;
        int i = 1;

        while (s - i >= i + 1) {
            s -= i++;
            answer++;
        }

        if (s != 0) {
            answer++;
        }
        System.out.println(answer);
    }
}
