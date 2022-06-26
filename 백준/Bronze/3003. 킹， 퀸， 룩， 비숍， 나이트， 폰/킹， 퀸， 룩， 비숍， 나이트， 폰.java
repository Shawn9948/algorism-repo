import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        /*킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개*/
        /*배열을 생성하여 값을 저장한뒤 원래 있었던 값 빼기 입력 값을 해서
         *각 인덱스 마다 얼마를 더하거나 빼야하는지 출력한다.  */
        
        Scanner sc = new Scanner(System.in);
        
        //검은 피스 배열 생성
        int[] blackPiece = {1, 1, 2, 2, 2, 8};
        
        //반복문으로 검은피스의 인덱스 빼기 입력값 하기
        for (int i = 0; i < blackPiece.length; i++) {
            blackPiece[i] -= sc.nextInt();
        }
        //검은 피스 배열 출력
        for (int e : blackPiece
        ) {
            System.out.print(e + " ");
        }
    }
}
