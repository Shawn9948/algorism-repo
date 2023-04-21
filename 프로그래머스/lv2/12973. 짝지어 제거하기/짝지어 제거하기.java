import java.util.*;
class Solution
{
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char tmp = 0;
        for (char c : s.toCharArray()) {
            if (tmp == c) {
                stack.pop();
                if (stack.size() != 0) {
                    tmp = stack.peek();
                }else tmp = 0;
            }else {
                stack.add(c);
                tmp = c;
            }
        }
        if (stack.size() == 0) answer = 1;
        return answer;
    }
}