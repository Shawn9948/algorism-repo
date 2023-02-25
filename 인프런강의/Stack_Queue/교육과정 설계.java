import java.util.Scanner;

public class Main {

    public String solution(String str1, String str2) {
        String answer = "NO";
        StringBuilder sb = new StringBuilder();
        for (char x : str2.toCharArray()) {
            if (str1.contains(String.valueOf(x))) sb.append(x);
        }
        String target = sb.toString();
        if (str1.equals(target)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        Main main = new Main();
        System.out.println(main.solution(input1, input2));
        return;
    }
}
