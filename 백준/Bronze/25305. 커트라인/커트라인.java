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
        int M = Integer.parseInt(st.nextToken());

        int[] grade = new int[N];
         st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            grade[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(grade);

        System.out.println(grade[grade.length - M]);
    }
}



