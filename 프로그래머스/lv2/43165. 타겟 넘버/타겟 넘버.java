class Solution {
    private int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    private void dfs(int[] numbers, int target, int sum, int count){
        if(count == numbers.length) {
            if(sum == target) answer++;
            else return;
        }else{
            int num = numbers[count];
            dfs(numbers, target, sum + num, count+1);
            dfs(numbers, target, sum - num, count+1);
        }
    }
}