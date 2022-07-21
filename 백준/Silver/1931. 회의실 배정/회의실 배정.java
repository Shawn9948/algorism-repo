import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;



class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //2차배열로 입력받아 배열의 길이를 입력받는대로 설정
        int N = Integer.parseInt(st.nextToken());
        int [][] argue = new int[N][2];

            //2차 배열에 집언허기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            argue[i][0] = Integer.parseInt(st.nextToken());
            argue[i][1] = Integer.parseInt(st.nextToken());
        }
        // 2차 배열 끝나는 시간순으로 정렬하기
        Arrays.sort(argue, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }

        });

        int count = 0;
        int startTime = 0;
        //만약 시작시간이 starTime보다 크거나 같다면 시작시간은 끝나는시간
        for (int i = 0; i < N; i++) {
            if(startTime <= argue[i][0]){
                startTime = argue[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
