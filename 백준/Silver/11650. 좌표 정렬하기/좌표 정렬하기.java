import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int [] [] coordinate = new int[N][];

        //2차배열에 값 집어넣기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            coordinate[i] =new int[ ]{a,b};
        }

        //정렬해주기
        Arrays.sort(coordinate, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]== o2[0]){
                    return o1[1]-o2[1];
                }
                return o1[0]-o2[0];
            }
        });
        
        //출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                sb.append(coordinate[i][j]+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
