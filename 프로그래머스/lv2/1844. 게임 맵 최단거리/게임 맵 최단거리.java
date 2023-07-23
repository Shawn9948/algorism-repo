import java.util.*;
class Solution {
    //벽=0, 통로=1
    int answer = -1;
    boolean flag = false;
    boolean[][] ch;
    Queue<Spot> queue = new LinkedList<>();

    static class Spot {
        public Spot(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }

        private int x = 0;
        private int y = 0;
        private int count = 0;
    }

    public int solution(int[][] maps) {
        int[] cal = new int[]{1, -1, 1, -1};
        ch = new boolean[maps.length][maps[0].length];
        queue.offer(new Spot(0, 0, 1));

        while (!queue.isEmpty()) {
            if (flag) break;
            Spot spot = queue.poll();
            if (spot.x >= maps.length || spot.x < 0 || spot.y >= maps[0].length || spot.y < 0)
                continue;
            else if (ch[spot.x][spot.y])
                continue;
            else if (maps[spot.x][spot.y] == 0) {
                continue;
            } else if (spot.x == maps.length - 1 && spot.y == maps[0].length - 1) {
                answer = spot.count;
                flag = true;
            } else {
                for (int i = 0; i < 4; i++) {
                    if (i < 2) {
                        queue.offer(new Spot(spot.x + cal[i], spot.y, spot.count + 1));
                    } else {
                        queue.offer(new Spot(spot.x, spot.y + cal[i], spot.count + 1));
                    }
                }
            }
            ch[spot.x][spot.y] = true;
        }
        return answer;
    }
}