class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] clothes = new int[n+2];
        for(int lostPersion : lost){
            clothes[lostPersion]--;
        }
        for(int reservedPerson : reserve){
            clothes[reservedPerson]++;
        }
        
        for(int i = 1; i< clothes.length-1; i++){
            if(clothes[i] == -1){
                if(clothes[i-1] == 1){
                    clothes[i-1]--;
                    answer++;
                }else if(clothes[i+1] == 1){
                    clothes[i+1]++;
                    answer++;
                }
            }else answer++;
        }
        return answer;
    }
}