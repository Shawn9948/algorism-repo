import java.util.*;

public class Main {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack();
        for (int x : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][x - 1] != 0) {
                    int num = board[i][x - 1];
                    board[i][x - 1] = 0;
                    if (stack.size() > 0 && stack.peek().equals(num)) {
                        stack.pop();
                        answer += 2;
                    } else stack.push(num);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input1 = in.nextInt();
        int[][] boards = new int[input1][input1];
        for (int i = 0; i < input1; i++) {
            for (int j = 0; j < input1; j++) {
                boards[i][j] = in.nextInt();
            }
        }
        int input2 = in.nextInt();
        int[] moves = new int[input2];
        for (int i = 0; i < input2; i++) {
            moves[i] = in.nextInt();
        }
        Main main = new Main();
        System.out.println(main.solution(boards, moves));
        return;
    }
}
