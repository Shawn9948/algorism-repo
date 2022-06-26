import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        /*킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개*/
        /*배열을 생성하여 값을 저장한뒤 입력값 -(빼기) 원래 있어야하는값을 해서
         *각 인덱스 마다 얼마를 더하거나 빼야하는지 출력한다.  */
        Scanner sc = new Scanner(System.in);
        int K,Q,L,B,N,P;



        int[] whitePiece = new int[6];
        for(int i = 0; i<6; i++){
            whitePiece[i]= sc.nextInt();

            if(i<2)
            whitePiece[i] = 1-whitePiece[i];
            else if (i>=2 && i<5) {
                whitePiece[i]= 2-whitePiece[i];
            } else {
                whitePiece[5] = 8 -whitePiece[5];
            }
        }
        for (int e:whitePiece
             ) {
            System.out.print(e+" ");
        }
    }
}
/*
입력값 - 1 >0
0
<0
결과값이 -이냐 +이냐 해서 지역변수에 저장하고 나중에 한번에 출력*/
