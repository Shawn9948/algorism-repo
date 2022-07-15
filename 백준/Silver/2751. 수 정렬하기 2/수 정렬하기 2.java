import java.io.*;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        TreeSet<Integer> treeSet = new TreeSet<>();
         int N = Integer.parseInt(br.readLine());
        for(int i = 0 ; i<N; i++){
            treeSet.add(Integer.parseInt(br.readLine()));
        }

        while(!treeSet.isEmpty()){
            sb.append(treeSet.pollFirst()+"\n");
        }
        System.out.println(sb);
    }
}