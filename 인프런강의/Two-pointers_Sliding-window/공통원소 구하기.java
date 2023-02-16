import java.util.*;

public class Main {

    public String solution(int aSize, int[] a, int bSize, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int ap = 0;
        int bp = 0;
        List<Integer> list = new ArrayList<>();

        while (ap < aSize && bp < bSize) {
            if (a[ap] == b[bp]) {
                list.add(a[ap]);
                ap++;
                bp++;
            } else if (a[ap] > b[bp]) {
                bp++;
            }else ap++;
        }
        
        String answer = "";
        for (int x : list) {
            answer += x + " ";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] a = new int[input1];
        for (int i = 0; i < input1; i++) {
            a[i] = in.nextInt();
        }
        int input2 = in.nextInt();
        int[] b = new int[input2];
        for (int i = 0; i < input2; i++) {
            b[i] = in.nextInt();
        }
        Main main = new Main();
        System.out.println(main.solution(input1, a, input2, b));
        return;
    }
}
