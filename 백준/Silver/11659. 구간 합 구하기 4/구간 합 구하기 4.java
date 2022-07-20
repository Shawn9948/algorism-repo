import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        //A, B입력받기
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        // 누적합 배열을 만들예정 0번째 인덱스는 0으로 설정
        int[] totalSumArr = new int[A + 1];
        String[] stringArr = br.readLine().split(" ");
        int j = 0;
        //누적합 배열에 값 삽입
        for (int i = 1; i <= A; i++) {
            totalSumArr[i] = totalSumArr[i - 1] + Integer.parseInt(stringArr[j]);
            j++;
        }
        
        //누적합 중 B-A = 그 사이의 누적합
        for (int i = 0; i < B; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st2.nextToken());
            int second = Integer.parseInt(st2.nextToken());
            int result = totalSumArr[second] - totalSumArr[first - 1];
            sb.append(result + "\n");
        }
        System.out.println(sb);
    }
}
