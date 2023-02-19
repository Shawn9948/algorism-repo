import java.util.*;

public class Main {

    public char solution(int size, String str){
        Map<Character, Integer> map = new HashMap<>();

        char[] arr = str.toCharArray();
        for(char x : arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        Set<Character> set = map.keySet();
        Iterator<Character> iter = set.iterator();
        char answer = ' ';
        int max = 0;
        while(iter.hasNext()){
            char target = iter.next();
            if(max < map.get(target)){
                max = map.get(target);
                answer = target;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        String input2 = in.next();
        Main main = new Main();
        System.out.println(main.solution(input1, input2));
        return ;
    }
}
