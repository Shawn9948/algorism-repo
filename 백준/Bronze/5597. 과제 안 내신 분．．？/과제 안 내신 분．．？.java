import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*1부터 30까지 있는 배열을 만든후 그 배열안에 사용자가 입력하는 값을 추가로 적어서 입력한다.
         * 배열을 낮은 순서대로 정렬한뒤 중복되는 숫자를 제거한다. (중복되면 값을 0으로 초기화 시킨다)
         * 0이 아닌 값을 찾아서 출력한다. (즉, 값이 한개만 있는 인덱스를 찾아야하는 게임)*/
        Scanner sc = new Scanner(System.in);

        int[] studentNum = new int[58];

        for (int i = 0; i < 58; i++) {
            if (i < 30)
                studentNum[i] = i + 1;
            else
                studentNum[i] = sc.nextInt();
        }
        sc.close();
        
        // 낮은 순서 배열 정렬
        Arrays.sort(studentNum);
        
        /* 배열 정렬이 잘되었는지 확인용 배열출력
        System.out.println(Arrays.toString(studentNum));*/

        //중복값 제거
        for(int i =0; i<58; i++){
            if( i != 57 && studentNum[i]== studentNum[i+1]) {
                studentNum[i] = 0;
                studentNum[i + 1] = 0;
            } else if (studentNum[57] == studentNum[56]) {
                studentNum[57] = 0;
                studentNum[56] = 0;
            }
        }
        /* 제거가 되었는지 확인용 배열출력
        System.out.println(Arrays.toString(studentNum));*/
        
        //결과값 출력
        for (int e: studentNum
             ) {
            if(e != 0)
                System.out.println(e);
        }
    }
}