import java.util.*;
import java.io.*;

public class Main {

    public int solution(int size, int target, int[] arr) {
        int answer = 0;
        //정렬한다.
        for (int i = 1; i < size; i++) {
            int j = i;
            while (arr[j] < arr[j - 1]) {
                int tmp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = tmp;
                if (j != 1) j--;
            }
        }
        //이분 탐색으로 해당 타켓의 인덱스를 구한다.
        int mid = size / 2;
        int lp = 0, rp = size - 1;
        while (lp <= rp) {
            if (arr[mid] == target) {
                answer = mid + 1;
                break;
            }
            if (target > arr[mid]) lp = mid + 1;
            else rp = mid - 1;
            mid = (rp + lp) / 2;


        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input1 = Integer.parseInt(st.nextToken());
        int input2 = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[input1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < input1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Main main = new Main();
        System.out.println(main.solution(input1, input2, arr));
        return;
    }
}
