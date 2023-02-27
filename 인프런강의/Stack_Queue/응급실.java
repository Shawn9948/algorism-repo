import java.util.*;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Main {
    public int solution(int size, int target, int[] arr) {
        int answer = 0;
        Queue<Person> queue = new ArrayDeque<>();
        for (int i = 0; i < size; i++) {
            Person person = new Person(i, arr[i]);
            queue.offer(person);
        }
        while (!queue.isEmpty()) {
            boolean isPass = true;
            Person check = queue.poll();
            for (Person person : queue) {
                if (person.priority > check.priority) {
                    queue.offer(check);
                    isPass = false;
                    break;
                }
            }
            if (isPass) {
                answer++;
                if (check.id == target) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int[] arr = new int[input1];
        for (int i = 0; i < input1; i++) {
            arr[i] = in.nextInt();
        }
        Main main = new Main();
        System.out.println(main.solution(input1, input2, arr));
        return;
    }
}
