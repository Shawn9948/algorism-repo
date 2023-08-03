class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        if(arr.length == 1) return arr[0];
        else{
            answer = (arr[0] * arr[1]) / getGCD(arr[0], arr[1]);
            for(int i = 2; i < arr.length; i++){
                answer = (answer* arr[i]) / getGCD(answer, arr[i]);
            }
        }
        
        return answer;
    }
    private int getGCD (int a, int b){
        if(a % b == 0) return b; 
        return getGCD(b, a%b);
    }
}