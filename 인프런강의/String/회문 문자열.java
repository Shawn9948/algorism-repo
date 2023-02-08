import java.util.Scanner;

public class Main {

    public String solution(String word){
        String answer = "NO";
        char[] arr = word.toLowerCase().toCharArray();
        int lt = 0;
        int rt = arr.length-1;
        
        while(lt < rt){
            if(arr[lt] != arr[rt]){
                return answer;
            }
            lt++;
            rt--;
        }
        answer = "YES";
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        Main main = new Main();
        System.out.println(main.solution(input1));
    }
}
