import java.util.*;
import java.io.*;


public class Main {
    static long min = Integer.MAX_VALUE;
    static long max = Integer.MIN_VALUE;
    static long[] arr;
    static int[] cal;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        cal = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        recursion(arr[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    private static void recursion(long target, int index) {
        if (index == arr.length) {
            if (target > max) {
                max = target;
            }
            if (target < min) {
                min = target;
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (cal[i] > 0) {

                cal[i]--;

                switch (i) {
                    case 0:
                        recursion(target + arr[index], index+1);
                        break;
                    case 1:
                        recursion(target - arr[index], index + 1);
                        break;
                    case 2:
                        recursion(target * arr[index], index + 1);
                        break;
                    case 3:
                        recursion(target / arr[index], index + 1);
                        break;
                }
                cal[i]++;
            }

        }


    }
}