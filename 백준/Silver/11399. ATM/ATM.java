import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {


    public static void main(String[] args) throws IOException {
        /*걸리는 시간이 적은 순서로 정렬을 하여 돈을 뽑게 해야한다. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        //시간 배열 선언
        int[] arrTime = new int[N];
        //배열 입력값 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrTime[i] = Integer.parseInt(st.nextToken());
        }
        //시간이 짧은 순으로 오름차순
        Arrays.sort(arrTime);

        int j = 0;
        int end = N;
        int totaltime = 0;
        while (j != N) {
            totaltime += arrTime[j++] * end--;
        }
        System.out.println(totaltime);
    }
}

/*3 1 4 3 2
 * 1 2 3 3 4
 * 1은 다섯번
 * 2는 4번
 * 3은 3번
 * 3은 2번
 * 4는 1번
 * */
