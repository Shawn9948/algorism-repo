import java.util.Scanner;

//1:가위, 2:바위, 3:보
public class Main {

    public String solution(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        String answer = "B";
        if(intA == intB) answer = "D";
        else if (intA == 1 && intB == 3) answer = "A";
        else if (intA == 2 && intB == 1) answer = "A";
        else if (intA == 3 && intB == 2) answer = "A";

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        in.nextLine();
        String[] A = in.nextLine().split(" ");
        String[] B = in.nextLine().split(" ");

        Main main = new Main();
        for (int i = 0; i < times; i++) {
            System.out.println(main.solution(A[i], B[i]));
        }
        return;
    }
}
