import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strArr = input.split(" ");
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
