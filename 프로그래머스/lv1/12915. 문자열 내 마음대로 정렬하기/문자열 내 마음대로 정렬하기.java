import java.util.*;
class Solution {
    public static String[] solution(String[] strings, int n)  {
        Arrays.sort(strings);
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(n) - o2.charAt(n);
            }
        });
        return strings;
    }
}