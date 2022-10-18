import java.io.IOException;
import java.util.*;

class Solution {
     boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);

            if (element == '(') {
                stack.push(element);
            }
            else {
                if (stack.size() == 0) {
                    return false;
                } else stack.pop();
            }
        }
        
        if (stack.isEmpty()) {
            return answer;
        }
        return false;
    }
}