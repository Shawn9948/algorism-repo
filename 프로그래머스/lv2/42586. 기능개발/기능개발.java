import java.util.*;
class Solution {    
    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> speedQueue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i< speeds.length; i++) {
            queue.offer(progresses[i]);
            speedQueue.offer(speeds[i]);
        }
        System.out.println(queue);
        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                int speed = speedQueue.poll();
                int target = queue.poll();
                queue.offer(target+speed);
                speedQueue.offer(speed);
            }

            while (!queue.isEmpty()) {
                if (queue.peek() >= 100) {
                    stack.push(queue.poll());
                    speedQueue.poll();
                } else break;
            }

            if (!stack.isEmpty()) {
                list.add(stack.size());
                stack.clear();
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}