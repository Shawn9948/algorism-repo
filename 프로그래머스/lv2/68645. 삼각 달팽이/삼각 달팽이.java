class Solution {
public int[] solution(int n) {
        int[] answer = {};
        int[][] board = new int[n][];
        //배열 판 만들기
        int lastNum = 0;

        for (int i = 0; i < n; i++) {
            board[i] = new int[i + 1];
            lastNum += i + 1;
        }
        int x = 0;
        int y = 0;
        int count = 1;
        // formation 1=아래로, 2=오른쪽, 3=대각선
        int formation = 1;
        while (count < lastNum+1) {
            if (formation > 3) formation = 1;
            if (formation == 1) {
                board[x++][y] = count++;
                if (x == n || board[x][y] != 0) {
                    x -= 1;
                    y += 1;
                    formation += 1;
                }
            } else if (formation == 2) {
                board[x][y++] = count++;
                if (y == n || board[x][y] != 0) {
                    x -= 1;
                    y -= 2;
                    formation += 1;
                }
            } else {
                if (formation == 3) {
                    board[x--][y--] = count++;
                    if (board[x][y] != 0) {
                        x += 2;
                        y += 1;
                        formation += 1;
                    }
                }
            }

        }
        answer = new int[count-1];
        int index = 0;
        for (int[] ints : board) {
            for (int anInt : ints) {
                answer[index++] = anInt;
            }
        }
            return answer;

    }
}