import java.io.*;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int i1 = Integer.parseInt(br.readLine());
            arr[i] = i1;
            sum += i1;
        }


        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (flag) break;
            int num = sum - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (num - arr[j] == 100) {
                    arr[j] = 0;
                    arr[i] = 0;
                    flag = true;
                    break;
                }
            }
        }
        Arrays.sort(arr);
        for (int i = 2; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
