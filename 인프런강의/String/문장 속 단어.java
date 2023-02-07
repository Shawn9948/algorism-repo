import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public String solution(String str) {
        int min = Integer.MIN_VALUE, pos;
        String answer = "";
        while ((pos = str.indexOf(' ')) != -1) {
            String target = str.substring(0, pos);
            int len = target.length();
            if (len > min) {
                min = len;
                answer = target;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > min) {
            answer = str;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        Main main = new Main();
        System.out.println(main.solution(input1));
    }
}
