import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //정수입력
        Byte A = sc.nextByte();

        //별 출력
        for(int i = 0 ; i<A;i++)
            for(int j = 0; j<A; j++){
                System.out.print("*");
                if(j==i){
                    System.out.println();
                    break;
                }
            }
    }
}