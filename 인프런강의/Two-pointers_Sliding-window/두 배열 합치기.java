import java.util.*;

public class Main {

    public String solution(int[] a, int[] b) {
        String answer = "";
        int ap = 0;
        int bp = 0;

        List<Integer> list = new ArrayList<>();

        while (ap < a.length && bp < b.length) {
            if (a[ap] < b[bp]) {
                list.add(a[ap++]);
            } else if (a[ap] > b[bp]) {
                list.add(b[bp++]);
            } else {
                list.add(a[ap++]);
                list.add(b[bp++]);
            }
        }
        while (ap < a.length) {
            list.add(a[ap++]);
        }
        while (bp < b.length) {
            list.add(b[bp++]);
        }

        for (Integer x : list) {
            answer += x + " ";
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
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
        System.out.println(main.solution(a, b));
        return;
    }
}
