import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //상근이 카드 입력받기
        int N = Integer.parseInt(br.readLine());
        String[] userDeck = new String[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            userDeck[i] = st.nextToken();
        }
        
        //상근이 카드 map에 집어넣기 
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(userDeck[i],"0" );
        }
        //확인할 카드 입력받기
        int T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        String[] checkDeck = new String[T];
        
        for (int i = 0; i < T; i++) {
            checkDeck[i] = st.nextToken();
        }
        //만약 상근이 카드와 겹친다면 상근이카드 값을 1로 변경 아니라면 0으로 집어넣기
        for (int i = 0; i < T; i++) {
            if(map.containsKey(checkDeck[i])){
                map.replace(checkDeck[i], "1");
            }else {
                map.put(checkDeck[i], "0");
            }
        }
        //확인할 카드 입력받은대로 값을 출력하기
        for (int i = 0; i < T; i++) {
            if (map.containsKey(checkDeck[i])) {
                sb.append(map.get(checkDeck[i])+" ");
            }
        }
        System.out.println(sb);
    }
}