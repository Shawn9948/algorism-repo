import java.io.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("-");
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            int tmp = 0;
            String[] split = arr[i].split("\\+"); // 역슬래시 기능 : +만 존재할 시 정규식으로 인식함. \\로 문자열이라고 선언
            for (String s : split) {
                tmp += Integer.parseInt(s);
            }
            if(i == 0) answer += tmp;
            else answer -= tmp;
        }
        System.out.println(answer);
    }
}