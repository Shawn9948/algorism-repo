import java.util.*;

public class Main {

    public int solution(int size, int target, int[] arr){
        int answer = -1;
        Set<Integer> set = new TreeSet<>();
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){
                    set.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
      
      	List<Integer> list = new ArrayList<>(set);
        Collections.reverse(list);
      
        for (Integer x : list) {
            target--;
            if (target == 0) {
                answer = x;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int[] arr = new int[input1];
        for(int i = 0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }
        Main main = new Main();
        System.out.println(main.solution(input1, input2,arr));
        return ;
    }
}
