import java.util.*;
import java.util.Scanner;

public class Main {

    public int solution(String str) {
        int result = 0;
        char tmp = 0;
        Stack<Character> stack = new Stack<>();
        for (char s : str.toCharArray()) {
            if(s == '(') {
                stack.push('(');
            }
            else {
                stack.pop();
                if (tmp == '(') {
                    result += stack.size();
                }else {
                    result++;
                }
            }
            tmp = s;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        Main main = new Main();
        System.out.println(main.solution(in.next()));
        return ;
    }
}