import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        String[] goal = br.readLine().split(" ");

        int[] coins = new int[Integer.parseInt(goal[0])];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        int cash = Integer.parseInt(goal[1]);
        int i = coins.length-1;
        while(cash!=0){

            if (cash -coins[i]>=0) {
                cash -= coins[i];
                count++;
            } else {
                i--;
            }
        }

        sb.append(count);
        System.out.println(sb);
    }
}
