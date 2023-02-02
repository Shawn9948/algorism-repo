import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int correctCount = 0;
        int zeroCount = 0;
        List<Integer> winList = new ArrayList<Integer>();
        for(int i = 0; i< win_nums.length; i++){
            winList.add(win_nums[i]);
        }
        for(int i = 0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zeroCount++;
                continue;
            }
            if(winList.contains(lottos[i])){
                correctCount++;
            }
        }
        answer[0] = checkRanking(correctCount+zeroCount);
        answer[1] = checkRanking(correctCount);
        return answer;
    }
    public static int checkRanking(int num){
        switch(num){
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3 : return 4;
            case 2 : return 5;
            default : return 6;
        }
    }
}
