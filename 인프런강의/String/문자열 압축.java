import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String result = "";
        char[] arr = str.toCharArray();
        int count = 1;
        
        for (int i = 0; i < arr.length - 1; i++) {
            
            if (arr[i] == arr[i + 1]) count++;
            
            else {
                if (count != 1) result += Character.toString(arr[i]) + count;
            
                else result += Character.toString(arr[i]);
         
                count = 1;
            }
        }

        result += Character.toString(arr[arr.length - 1]);

        if (count != 1) result += String.valueOf(count);

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        Main main = new Main();
        System.out.println(main.solution(input1));
        return;
    }
}
