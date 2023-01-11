import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;;

public class Main {
    public static void pyramid(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ".repeat(count - (i + 1)));
            System.out.print("*".repeat(i * 2 + 1));
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        pyramid(count);
    }
}