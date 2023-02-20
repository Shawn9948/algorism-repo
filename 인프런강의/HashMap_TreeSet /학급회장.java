import java.util.*;

public class Main {

    public String solution(String str1, String str2) {
        Map<Character, Integer> map = new HashMap<>();
        char[] firstArr = str1.toCharArray();
        for (char x : firstArr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : str2.toCharArray()) {
            if (!map.containsKey(x)) {
                return "NO";
            }
        }
        Map<Character, Integer> map2 = new HashMap<>();
        for (char x : str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }
        for (Character key : map.keySet()) {
            if (!map.get(key).equals(map2.get(key))) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        Main main = new Main();
        System.out.println(main.solution(input1, input2));
        return;
    }
}
