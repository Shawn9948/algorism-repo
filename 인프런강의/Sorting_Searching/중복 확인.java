import java.util.*;
//정렬하고 동일한 숫자가 있는지 확인한다.
public class Main {

    public char solution(int size, int[] arr){
        char answer = 'U';
        Arrays.sort(arr);
        for(int i = 0; i< size-1; i++){
            if(arr[i] == arr[i+1]) answer = 'D';
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int[] arr = new int[input1];
        for(int i =0; i< input1; i++){
            arr[i] = in.nextInt();
        }
        Main main = new Main();
        System.out.println(main.solution(input1, arr));
        return ;
    }
}
