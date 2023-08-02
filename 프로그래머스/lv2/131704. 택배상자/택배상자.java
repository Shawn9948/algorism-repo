import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int boxNum = 1;
        int index = 0;
        while (index < order.length) {
            int target = order[index];
            if(order[index] > boxNum ){
                stack.push(boxNum);
                boxNum++;
            }else if(order[index] == boxNum){
                answer++;
                index++;
                boxNum++;
            }else{
                while(!stack.isEmpty() && order[index] == stack.peek()){
                    stack.pop();
                    answer++;
                    index++;
                }
                if(index >= order.length || order[index] < boxNum) break;
            }
        }
        return answer;
    }
}