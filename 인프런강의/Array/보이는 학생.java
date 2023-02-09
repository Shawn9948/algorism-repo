import java.util.Scanner;

public class Main {

    public int solution(int num, String str){
        int count = 1;
        String [] arr = str.split(" ");
        int max = Integer.parseInt(arr[0]);

        for(int i = 1 ; i<num ; i++){
            int target = Integer.parseInt(arr[i]);
            if(target > max) {
                count++;
                max = target;
            }
        }
        return count;
    }


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int input1 = in.nextInt();
        String shift = in.nextLine();
        String str = in.nextLine();

        Main main = new Main();

        System.out.println(main.solution(input1, str));
        return ;
    }
}
