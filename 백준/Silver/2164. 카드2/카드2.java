import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*1부터 N까지 존재하는 큐에서 첫번째 요소를 버리고 두번째 요소는 맨뒤로 보낸다. 이런행위를
        * 반복해서 최후에 남는 요소를 찾아내어야한다. 하지만, 규칙이 존재한다. 홀수번째들은 반드시 사라지고
        * 짝수 번째들은 뒤로 붙는다. 그렇다면 while반복문으로 한개가 남을때까지 반복해주면, 최후의 요소를 찾을수 있을것이다. */

        //입력값 받기
        int N = Integer.parseInt(br.readLine());

        Queue <Integer> queue = new LinkedList<>();
        //1부터 N까지 삭제하기에 용이한 Linkedlist를 사용하여 입력받는다.
        for (int i = 1; i <= N; i++) {
                queue.add((Integer)i);
        }
        //linkedlist에 요소가 1개 남을때까지 반복문을 돈다.
        while (queue.size()!=1){
            queue.poll();

            queue.add(queue.poll());

        }
        System.out.println(queue.peek());
     }
}
