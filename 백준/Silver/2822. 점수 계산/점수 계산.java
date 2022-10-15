import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;



class Main {


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        List<Integer> score = new ArrayList<>();

        for (int i = 0; i <8; i++) {
            score.add(Integer.parseInt(br.readLine()));
        }

        List<Integer> collect = score.stream().sorted().collect(Collectors.toList());
        
        Integer integer = collect.get(3);

        List<Integer> sortedArr = collect.stream().filter(num -> num >= integer).collect(Collectors.toList());
        
        int sum = 0;

        for (int i = 0; i < sortedArr.size(); i++) {
            sum += sortedArr.get(i);
        }

        sb.append(sum+"\n");

        for (int i = 0; i < score.size(); i++) {
            if (sortedArr.contains(score.get(i))) {
                sb.append(i+1 + " ");
            }
        }

        System.out.println(sb);
    }
}
