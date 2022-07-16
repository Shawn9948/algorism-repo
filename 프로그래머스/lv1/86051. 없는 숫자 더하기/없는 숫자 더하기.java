
class Solution {
    public int solution(int[] numbers) {
   
        int total = 45;
        for( int e : numbers){
            total-=e;
        }
        return total;
    }
}