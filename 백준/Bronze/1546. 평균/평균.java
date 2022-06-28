import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subject = sc.nextInt();
        int [] Score = new int[subject];
        for(int i = 0 ; i< subject; i++){
           Score[i] = sc.nextInt();
        }sc.close();
        Arrays.sort(Score);
        double average =0;
        for (int k:Score
             ) {
           average += k/ (double)Score[subject-1]*100;
        }
        System.out.println(average/subject);
    }
}