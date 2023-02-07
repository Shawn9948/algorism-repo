import java.util.Scanner;
  
public class Main {
  
  public String solution(String str){
    String [] arr = str.split("");
       	String answer = arr[0];
    for(int i = 1; i<arr.length; i++){
     	if(!answer.contains(arr[i])){
         answer += arr[i]; 
        }
    }
    return answer;
  }
  
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input1 = in.next();
	Main main = new Main();
    System.out.println(main.solution(input1));
    return ;
  }
}
