import java.io.*;

public class Main {
    static final int MAX = 80;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        //테스트 케이스 객체 생성
        String[] str = new String[N];

        int count = 1;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();

            if (str[i].contains("O")) {
                char[] cha = str[i].toCharArray();
                for (char e : cha) {
                    if (e == 'O') {
                        sum += count++;
                    } else if (e == 'X') {
                        count = 1;
                    }
                }
            }
            sb.append(sum+"\n");
            sum = 0;
            count = 1;
        }
        System.out.println(sb);
    }
}
