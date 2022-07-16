
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int [] numarr = new int[10];
        for(int i = 0; i<numbers.length;i++){
            numarr[numbers[i]]++;
        }
        for(int i = 0; i<numarr.length; i++){
            if(numarr[i]==0){
                answer+=i;
            }
        }
        return answer;
    }
}