import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String nums = br.readLine();
        char [] number = nums.toCharArray();

        System.out.println(num*(number[2]-'0'));
        System.out.println(num*(number[1]-'0'));
        System.out.println(num*(number[0]-'0'));
        System.out.println(num*Integer.parseInt(nums));
    }
}