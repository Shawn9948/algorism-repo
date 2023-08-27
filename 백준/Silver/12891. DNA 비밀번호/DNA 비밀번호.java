import java.lang.reflect.Array;
import java.util.*;
import java.io.*;


public class Main {
    static String[] arr;
    static int[] ch;
    static int[] myCh;
    static int correctCh;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main main = new Main();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        arr = br.readLine().split("");
        ch = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        myCh = new int[4];
        correctCh = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 0) {
                correctCh++;
            }
        }

        for (int i = 0; i < p; i++) {
            add(arr[i]);

        }
        if (correctCh == 4) answer++;

        
        for (int i = p; i < s; i++) {
            int j = i - p;
            add(arr[i]);
            remove(arr[j]);
            if (correctCh == 4) answer++;
        }
        System.out.println(answer);
    }

    private static void add(String target) {
        switch (target) {
            case "A":
                myCh[0]++;
                if (myCh[0] == ch[0]) correctCh++;
                break;
            case "C":
                myCh[1]++;
                if (myCh[1] == ch[1]) correctCh++;
                break;
            case "G":
                myCh[2]++;
                if (myCh[2] == ch[2]) correctCh++;
                break;
            case "T":
                myCh[3]++;
                if (myCh[3] == ch[3]) correctCh++;
                break;
        }
    }

    private static void remove(String target) {
        switch (target) {
            case "A":
                if (myCh[0] == ch[0]) correctCh--;
                myCh[0]--;
                break;
            case "C":
                if (myCh[1] == ch[1]) correctCh--;
                myCh[1]--;
                break;
            case "G":
                if (myCh[2] == ch[2]) correctCh--;
                myCh[2]--;
                break;
            case "T":
                if (myCh[3] == ch[3]) correctCh--;
                myCh[3]--;
                break;
        }
    }
}