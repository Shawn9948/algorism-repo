import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*char타입 배열에 문자열을 삽입하여 아스키코드로 
         *대문자 소문자 변환시켜주기*/
        
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        //char타입의 배열 생성
        char[] arr = new char[word.length()];
        //char타입 배열에 문자열 집어넣기
        arr = word.toCharArray();
        // char[] arr = word.toCharArray(); 한번에도 가능!
        
        //char타입의 배열 반복문 돌려서 대문자는 소문자로, 소문자는 대문자로 변경하기
        for(int i =0 ; i < arr.length ; i++){
            if(arr[i]>96 && arr[i]<123)
                arr[i]= (char)(arr[i]-32);
            else {
                arr[i]= (char)(arr[i]+32);
            }
        }
        System.out.println(arr);
    }
}
