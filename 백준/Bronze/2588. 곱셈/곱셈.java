import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //변수생성
        int N = 0;
        String K = "";

        //입력값 받기
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.next();
        sc.close();

        char[] arr = K.toCharArray();

        for (int i = K.length() - 1; i >= 0; i--) {
            System.out.println(N * (arr[i] - '0'));
        }
        System.out.println(N * Integer.parseInt(K));
    }
}
