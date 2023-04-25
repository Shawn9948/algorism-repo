import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public int solution(int A, int P) {
        List<Long> list = new ArrayList<>();
        list.add((long) A);
        long pow = A;
        while (true) {
            pow = getPow(P, pow);
            if (list.contains(pow))
                break;
            list.add(pow);
        }
        int index = list.indexOf(pow);

        for (int i = list.size() - 1; i >= index; i--) {
            list.remove(list.get(i));
        }
        return list.size();
    }

    private static long getPow(int P, long pow) {
        String[] numbers = String.valueOf(pow).split("");
        pow = 0;
        for (String number : numbers) {
            pow += Math.pow(Double.parseDouble(number), P);
        }
        return pow;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main main = new Main();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        System.out.println(main.solution(A, P));

    }

}