import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int [] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        String input = br.readLine();

        int j = 0;
        for (int i = 0; i < input.length(); i++) {
            if(alphabet[input.charAt(i)-97] != -1){
                j++;
            }
            else {
                alphabet[input.charAt(i) - 97] = j;
                j++;
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            sb.append(alphabet[i]+" ");
        }
        System.out.println(sb);
     }
}