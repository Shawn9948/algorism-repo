import java.util.Scanner;

public class Main {

    public String solution(String str){
        String answer = "No";
        
        String replacedStr = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reversedStr = new StringBuilder(replacedStr).reverse().toString();
        
        if(replacedStr.equals(reversedStr)) answer = "YES";
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        Main main = new Main();
        System.out.println(main.solution(input1));
    }
}
