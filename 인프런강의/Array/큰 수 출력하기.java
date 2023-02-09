import java.util.*;
import java.io.*;

public class Main {

    public String solution(String str) {
        String[] arr = str.split(" ");
        String answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) > Integer.parseInt(arr[i - 1])) {
                answer += " " + arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String str = br.readLine();
        Main main = new Main();
        System.out.println(main.solution(str));
        return;
    }
}