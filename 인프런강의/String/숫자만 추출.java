import java.util.Scanner;

public class Main {

    public int solution(String str){
        String replacedStr = str.toUpperCase().replaceAll("[^0-9]","");
        return Integer.parseInt(replacedStr);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        Main main = new Main();
        System.out.println(main.solution(input1));
        return ;
    }
}
