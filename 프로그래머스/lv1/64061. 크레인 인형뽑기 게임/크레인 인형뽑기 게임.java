import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack();
        
        for(int x : moves){
            for(int i =0; i< board.length; i++){
                if(board[i][x-1] != 0){
                    int num = board[i][x-1];
                    board[i][x-1] = 0;
                    if(stack.size()>0 && stack.peek().equals(num)){
                        stack.pop();
                        answer+=2;
                    }else stack.push(num);
                    break;
                }
            }
        }
        return answer;
    }
}