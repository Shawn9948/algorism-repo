import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] number = new int[10001];

        for (int i = 0; i < N; i++) {
            number[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        for (int i = 0; i < number.length; i++) {

            while (number[i] > 0) {
                sb.append(i + "\n");
                number[i]--;
            }

        }
        System.out.println(sb);
    }
}