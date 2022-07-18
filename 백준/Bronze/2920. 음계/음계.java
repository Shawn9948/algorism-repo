import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String [] b = br.readLine().split(" ");
        //N입력받기
        int [] a=new int[8];
        String output ="";
        for (int i = 0; i < 8; i++) {
            a[i]=Integer.parseInt(b[i]);
        }

        for (int i = 0; i < 7; i++) {
            if(a[i]==a[i+1]-1){
                output ="ascending";
            }else if(a[i]==a[i+1]+1){
                output = "descending";

            }else{
                output = "mixed";
                break;
            }
        }
        System.out.println(output);
    }
}