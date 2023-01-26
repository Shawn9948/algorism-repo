import java.util.*;
class Solution {
    public long solution(String t, String p) {
        int tLength = t.length();
        int pLength = p.length();

        List<Long> list = new ArrayList<>();
        for (int i = 0; i <= tLength - pLength; i++) {
            String target = t.substring(i, i+ pLength);
            if (target.charAt(0) > p.charAt(0)) {
                continue;
            }
            list.add(Long.parseLong(target));
        }
        return list.stream().filter(a -> a <= Long.parseLong(p)).count();
    }
}