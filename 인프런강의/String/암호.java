import java.util.Scanner;

public class Main {
    public String solution(int count, String str) {
        String answer = "";
        String binary = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') binary += "0";
            else binary += "1";

            if ((i + 1) % 7 == 0) {
                answer += (char) Integer.parseInt(binary, 2);
                binary = "";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        String input1 = in.next();
        Main main = new Main();
        System.out.println(main.solution(input, input1));
        return;
    }
}
