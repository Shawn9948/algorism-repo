import java.util.Scanner;

public class Main {
    public String solution(String target){
        String result = "";
        char[] cha = target.toCharArray();
        for(int i = 0; i<cha.length; i++){
            String t = String.valueOf(cha[i]);
            if(cha[i] >= 97){
            }else{
                result += t.toLowerCase();
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        Main main = new Main();

        System.out.println(main.solution(input1));
    }
}