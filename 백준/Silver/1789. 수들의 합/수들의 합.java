import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N개수 입력
        Long S = Long.parseLong(br.readLine());
        //변수 값 초기화

        int count = 0;
        Long i = 1L;

        while (true) {
            //만약 s의 값이 i와 같다면 마지막으로 한번만 더 빼는게 가능하니 count++
            if (S == i) {
                count++;
                break;
            }//만약 s의 값이 i보다 작다면 더이상 뺄수없으니 그대로 출력
            else if (S < i) {
                break;
            }
            S -= i++;
            count++;

        }
        System.out.println(count);
    }
}
