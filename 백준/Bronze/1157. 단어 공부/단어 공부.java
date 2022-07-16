import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //문자 입력
        String word = br.readLine().toUpperCase(Locale.ROOT);
        //알파벳은 총 26자리, 26배열 넣기 
        int[] spelling = new int[26];
        //26자리 배열에 문자 아스키값 빼서 몇번 중복되었는지 체크
        for (int i = 0; i < word.length(); i++) {
            spelling[word.charAt(i) - 65]++;
        }
        int max = -1;
        char c = '?';
        //배열 반복문 돌려서 최대 많이 나온 문자 출력 
        for (int i = 0; i < spelling.length; i++) {
            //만약 max값보다 많다면 max값 변동 + 최대 많이 나온 문자로 값 변경 
            if (spelling[i] > max) {
                max = spelling[i];
                c = (char) (i + 65);
            }
            //만약 최대 많이 나온값이 겹친다면 ?문자로 변경 
            else if (spelling[i] == max) {
                c = '?';
            }
        }
        System.out.println(c);
    }
}