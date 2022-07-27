import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        String[][] arrStr = new String[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arrStr[i][0] = st.nextToken();
            arrStr[i][1] = st.nextToken();
        }
        Arrays.sort(arrStr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0])- Integer.parseInt(o2[0]);
            }
        });
        int j = 0;
        for (int i = 0; i < N; i++) {
            if(j == 2){
                j = 0;
            }
            sb.append(arrStr[i][j++]+" ");
            sb.append(arrStr[i][j++] + "\n");
        }
        System.out.println(sb);

    }
}

