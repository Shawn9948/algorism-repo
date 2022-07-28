import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //스택 객체를 생성한후 입력받은 수만큼 스택 객체에 넣어준다.
        //만약 입력받은 수가 0이라면 가장 최근에 입력받은 숫자를 취소해준다.

        /*스택에 입력받은 값을 넣어줄때
        * 만약 입력값이 0이라면 이미 저장되어있는 값을 삭제하고
        * 0을 스택에 저장하지않고 다음 입력값으로 넘긴다.
        * 만약 스택의 사이즈가 0인데 0을 입력 받았다면,
        * 스택의 값을 삭제하지말고 그냥 넘긴다.
        * 남아있는 스택의 요소들의 합을 출력한다. */

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            //요소를 입력할때 만약 입력값이 0이라면 stack에 0을 삽입하지말고 저장되어있는 객체를 삭제할것
            if (input == 0) {
                if (stack.size() == 0) {
                    continue;
                }
                stack.pop();
                continue;
            }
            stack.push(input);
        }
        //스택에 요소가 잘 들어갔는지 확인용
        //System.out.println(stack);

        int sum = 0;
        //스택의 모든값 더하기
        while (stack.size() != 0) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}

