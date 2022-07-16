import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //테스트 케이스의 갯수 입력
        int N = Integer.parseInt(br.readLine());

        //변수 생성
        double count = 0;
        int sum = 0;
        int avg = 0;
        double highStudent = 0;

        // 각각의 테스트케이스 입력
        for (int i = 0; i < N; i++) {
            String[] strArr = br.readLine().split(" ");
            //합 구하기
            for (int j = 1; j <= Integer.parseInt(strArr[0]); j++) {
                sum += Integer.parseInt(strArr[j]);
            }
            //평균구하기
            avg = sum / Integer.parseInt(strArr[0]);
            for (int j = 1; j <= Integer.parseInt(strArr[0]); j++) {
                //평균넘는 인원수 구하기
                if (Integer.parseInt(strArr[j]) > avg) {
                    count++;
                }
            }
            //사용한 변수 초기화
            avg = 0;
            sum = 0;
            //평균 넘은 인원수의 비율 구하기
            highStudent = count * 100 / Double.parseDouble(strArr[0]);
            //구하는 값 출력
            sb.append(String.format("%.3f", highStudent) + ("% \n"));
            //사용한 변수 초기화
            count = 0;
            highStudent = 0;
        }
        System.out.println(sb);
    }
}
//2차 시도
