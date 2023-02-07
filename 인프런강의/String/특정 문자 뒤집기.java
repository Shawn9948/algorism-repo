import java.util.Scanner;

public class Main {

    public String solution(String target){
        char[] arr = target.toCharArray();
        int lt = 0;
        int rt = arr.length-1;
        
        while(lt < rt){
            Boolean ltBool = Character.isAlphabetic(arr[lt]);
            Boolean rtBool =  Character.isAlphabetic(arr[rt]);
            if(!ltBool) {
                lt++;
            }else if (!rtBool) {
                rt--;
            } else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        Main main = new Main();
        System.out.println(main.solution(input1));
        return ;
    }
}
