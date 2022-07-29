import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
            int[] answer = {};
            TreeSet <Integer> tree = new TreeSet<>();
            int k = 0;
            for(int i = 0; i<numbers.length; i++){
                for(int j = i+1; j<numbers.length; j++){
                    int result = numbers[i]+numbers[j];
                    answer = Arrays.copyOf(answer,answer.length+1);
                    answer[k] = result;
                    k++;
                }
            }
        Arrays.sort(answer);
        answer = Arrays.stream(answer).distinct().toArray();

        return answer;
    }
}