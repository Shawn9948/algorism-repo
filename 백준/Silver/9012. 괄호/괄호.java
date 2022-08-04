import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int T = Integer.parseInt(br.readLine());



         for (int i = 0; i < T; i++) {
            String[] arrStr = br.readLine().split("");
            int A =0;


            for (int j = 0; j < arrStr.length ; j++) {

                if(arrStr[j].equals("(")){
                    A++;
                }else if(arrStr[j].equals(")")) {
                    A--;
                }
                if(A<0){
                    sb.append("NO\n");
                    break;
                }
            }

            if(A==0){
                sb.append("YES\n");
            }else if(A>0) {
                sb.append("NO\n");
            }
        }
        System.out.println(sb);
     }
}