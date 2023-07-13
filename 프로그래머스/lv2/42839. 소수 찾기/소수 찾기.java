import java.util.*;
public class Solution {
    Set<Integer> set = new HashSet();
    boolean[] ch;

    public int solution(String numbers) {
        ch = new boolean[numbers.length()];
        dfs("", numbers);
        return set.size();
    }

    public void dfs(String num, String target) {
        if (num.length() > 0) {
            int prime = Integer.parseInt(num);
            if (isPrime(prime)) set.add(prime);
        }
        for (int i = 0; i < target.length(); i++) {
            if (ch[i]) continue;
            ch[i] = true;
            dfs(num + target.charAt(i), target);
            ch[i] = false;
        }
    }

    public boolean isPrime(int num) {
        if (num == 0 || num == 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}