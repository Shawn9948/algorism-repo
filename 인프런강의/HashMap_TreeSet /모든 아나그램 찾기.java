import java.util.*;

public class Main {

    public int solution(String str1, String str2) {
        Map<Character, Integer> firstMap = new HashMap<>();
        int answer = 0;
        if (str1.length() == str2.length()) {
            for (char x : str1.toCharArray()) {
                firstMap.put(x, firstMap.getOrDefault(x, 0) + 1);
            }
            for (char x : str2.toCharArray()) {
                if (!firstMap.containsKey(x) || firstMap.get(x) == 0) return 0;
                firstMap.put(x, firstMap.get(x) - 1);
                if (firstMap.get(x).equals(0)) firstMap.remove(x);
            }
            if (firstMap.size() == 0) return 1;
        }

        Map<Character, Integer> secondMap = new HashMap<>();
        for (char x : str2.toCharArray()) {
            secondMap.put(x, secondMap.getOrDefault(x, 0) + 1);
        }

        boolean isAnagram = true;
        int lp = 0;
        char[] arr = str1.toCharArray();

        for (int rp = 0; rp < str2.length() - 1; rp++) {
            firstMap.put(arr[rp], firstMap.getOrDefault(arr[rp], 0) + 1);
        }

        for (int rp = str2.length() - 1; rp < str1.length(); rp++) {
            firstMap.put(arr[rp], firstMap.getOrDefault(arr[rp], 0) + 1);

            for (char x : firstMap.keySet()) {
                if (!firstMap.get(x).equals(secondMap.get(x))) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) answer++;
            isAnagram = true;

            firstMap.put(arr[lp], firstMap.get(arr[lp]) - 1);
            if (firstMap.get(arr[lp]) == 0) {
                firstMap.remove(arr[lp]);
            }
            lp++;
        }
        return answer;
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
