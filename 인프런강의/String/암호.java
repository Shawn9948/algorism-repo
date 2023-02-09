import java.util.Scanner;

public class Main {

    public String solution(int num, String str){
        String answer = "";
        str = str.replace('*', '0').replace('#', '1');
        for(int i = 0; i< num; i++){
            String target = str.substring(0, 7);
            answer += (char)Integer.parseInt(target,2);
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        String input2 = in.next();
        Main main = new Main();
        System.out.println(main.solution(input1,input2));
        return ;
    }
}
