import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = (sc.nextInt() % 42);
        }
        sc.close();
        Arrays.sort(nums);
        //System.out.println(Arrays.toString(count));
        int count = 1;
        for (int i = 0; i < 10; i++) {
            if (i != 9 && nums[i] != nums[i + 1])
                count +=1;
        }
        System.out.println(count);
    }
}

