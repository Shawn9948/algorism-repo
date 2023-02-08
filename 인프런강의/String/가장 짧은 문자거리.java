import java.util.*;

public class Main {

    public String solution(String str, char word){
        String answer = "";
        int count = 1000;
        int [] arr = new int[str.length()];

        for(int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == word) {
                count = 0;
            }
            arr[i] = count;
            count++;
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == word) {
                count = 0;
            }
            arr[i] = Math.min(arr[i], count);
            count++;
        }

        for (int x : arr) {
            answer += x + " ";
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        String wordToChar = in.next();
        char word = wordToChar.charAt(0);
        Main main = new Main();
        System.out.println(main.solution(str, word));
        return ;
    }
}
