import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 점의 개수
        int N = Integer.parseInt(br.readLine());
        //점의 좌표를 2차배열에 집어넣는다.
        int[][] position = new int[N][];

        for (int i = 0; i <N; i++) {
            position[i] = new int[2];
            st = new StringTokenizer(br.readLine());
            position[i][0] = Integer.parseInt(st.nextToken());
            position[i][1] = Integer.parseInt(st.nextToken());
        }
        //확인용
        //System.out.println(Arrays.deepToString(position));

        //정렬
        Arrays.sort(position, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0]-o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        //확인용
        //System.out.println(Arrays.deepToString(position));
        for (int i = 0; i < N; i++) {
            sb.append(position[i][0]+" "+ position[i][1] + "\n");

        }
        System.out.println(sb);
    }
}