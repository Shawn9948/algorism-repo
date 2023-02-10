import java.util.Scanner;

public class Main {

    public String solution(int count){
        String answer = "1 1 2";
        int lastKey = 1;
        int newKey = 2;
        for (int i = 0; i < count-3; i++) {
            int key = lastKey + newKey;
            lastKey = newKey;
            newKey = key;
            answer += " " + (key);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        Main main = new Main();
        System.out.println(main.solution(input1));
        return ;
    }
}
