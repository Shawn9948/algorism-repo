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
        int [][] classes = new int[N][5];
        //2차 배열 생성
        for (int i = 0; i < classes.length; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 5; j++) {
                classes[i][j]= Integer.parseInt(st.nextToken());
            }
        }
//        System.out.println(Arrays.deepToString(classes));

        int [][] freind = new int[N][N];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if(classes[j][i]==classes[k][i]){
//                        System.out.println(j+" "+i +" /"+ k+" "+i);
                        freind[j][k]=1;
                        freind[k][j]=1;
                    }
                }
            }
        }
//        System.out.println(Arrays.deepToString(freind));
        int max = 0;
        int result = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if(freind[i][j] == 1){
                    count++;
                }
            }
            if(count>max){
                max = count;
                result = i;
            }
        }
        System.out.println(result+1);
    }
}