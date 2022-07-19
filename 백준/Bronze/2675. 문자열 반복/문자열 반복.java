import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //T개수 입력
        int T = Integer.parseInt(br.readLine());

        //T개수만큼 반복문 돌리기
        for (int i = 0; i < T; i++) {
            String[] strArr = br.readLine().split("");
            //문자열 각 한개씩
            for (int j = 2; j < strArr.length; j++) {
                //strArr[0]번씩 출력
                for (int k = 0; k < Integer.parseInt(strArr[0]); k++) {
                    sb.append(strArr[j]);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
