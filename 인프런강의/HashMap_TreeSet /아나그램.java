import java.util.*;

public class Main {

    public String solution(String str1, String str2) {
        Map<Character, Integer> map = new HashMap<>();
        char[] firstArr = str1.toCharArray();
        for (char x : firstArr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        char[] secondArr = str2.toCharArray();
        Set<Character> set = map.keySet();
        for (char x : secondArr) {
            if (!set.contains(x)) {
                return "NO";
            }
        }
        Map<Character, Integer> map2 = new HashMap<>();
        for (char x : secondArr) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }
        Iterator<Character> iter = set.iterator();
        while (iter.hasNext()) {
            char target = iter.next();
            if (!map.get(target).equals(map2.get(target))) {
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
