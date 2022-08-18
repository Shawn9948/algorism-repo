import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        /*-로 문자열을 나누고 그뒤 반복문을 돌려서 +들을 각각 더해주고 그 더해준 값들을 모두 빼준다. 그값이 결과값이다. */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE;

        // - 로 모두 구분해주기
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        while (st.hasMoreTokens()) {
            int temp = 0;
            //-로 구분 된 토큰들중 +가 있다면 +로 나눠주고 없다면 그냥 집어넣어주기
            StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");

            //temp에 값들을 더해주기
            while (st2.hasMoreTokens()) {
                String b1 = st2.nextToken();
                temp += Integer.parseInt(b1);
            }
            if(sum == Integer.MAX_VALUE){
                sum = temp;
            } else {
                //첫번째 숫자 이후로 들어오는 temp값들은 빼주기
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
