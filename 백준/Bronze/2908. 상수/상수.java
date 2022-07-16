import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String N = br.readLine();
        StringBuilder sb = new StringBuilder(N);
        String reverseN = sb.reverse().toString();

        String [] compare = reverseN.split(" ");

            if(Integer.parseInt(compare[0]) >Integer.parseInt(compare[1])){
                System.out.println(compare[0]);
        }else {
                System.out.println(compare[1]);
            }
    }
}