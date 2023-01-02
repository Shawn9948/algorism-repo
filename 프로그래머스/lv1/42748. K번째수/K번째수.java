import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        int count = 0;
        
        while (count < commands.length) {
            List<String> list = new ArrayList<>();
            List<Integer> fixList = new ArrayList<>();
            
            for (int j = 0; j < array.length; j++) {
                list.add(String.valueOf(array[j]));
            }
            
            for (int i = commands[count][0]-1; i < commands[count][1]; i++) {
                fixList.add(array[i]);
            }
            
            Collections.sort(fixList);
            
            answer = Arrays.copyOf(answer, answer.length + 1);
            answer[answer.length-1] = fixList.get(commands[count][2] - 1);
            
            count++;
        }
        return answer;
    }
}