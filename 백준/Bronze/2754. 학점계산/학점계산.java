import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        if (word.equals("A+")){
            System.out.println(4.3);
        } else if (word.equals("A0")) {
            System.out.println(4.0);
        } else if (word.equals("A-")) {
            System.out.println(3.7);
        } else if (word.equals("B+")) {
            System.out.println(3.3);
        } else if (word.equals("B0")) {
            System.out.println(3.0);
        } else if (word.equals("B-")) {
            System.out.println(2.7);
        } else if (word.equals("C+")) {
            System.out.println(2.3);
        } else if (word.equals("C0")) {
            System.out.println(2.0);
        } else if (word.equals("C-")) {
            System.out.println(1.7);
        } else if (word.equals("D+")) {
            System.out.println(1.3);
        } else if (word.equals("D0")) {
            System.out.println(1.0);
        } else if (word.equals("D-")) {
            System.out.println(0.7);
        } else if(word.equals("F"))
            System.out.println(0.0);
    }
}
