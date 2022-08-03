import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*컬렉션 배열에 집어넣은 뒤 내림차순하여 iterator를 이용하여 출력한다.*/
        List<Integer> list = new ArrayList<>();
        //입력값 받기
        String [] N = br.readLine().split("");
        //list에 Integer타입으로 집어넣는다.
        for (int i = 0; i < N.length; i++) {
            list.add(Integer.valueOf(N[i]));
        }
        //Collections클래스의 sort메서드를 이용하여 reverseOrder()메소드를 이용한다.
        Collections.sort(list,Collections.reverseOrder());
        //Iterator에 담는다.
        Iterator <Integer>  iterator = list.iterator();
        //하나씩 출력한다.
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
     }
}
