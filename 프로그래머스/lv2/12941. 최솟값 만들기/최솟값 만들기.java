import java.util.*;
class Solution
{
public int solution(int[] A, int[] B) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < B.length; i++) {
            list.add(B[i]);
        }
        Arrays.sort(A);
        list.sort(Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
            answer += (A[i] * list.get(i));
        }

        return answer;
    }

}