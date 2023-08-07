import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String[] units = Integer.toString(n,k).split("0");
        
        for(String unit : units){
            if(unit.length() > 0 && isPrime(Long.parseLong(unit))) 
                answer++;
        }
        
        return answer;
    }
    
    
    private boolean isPrime(long n){
        if(n == 0 || n==1) return false;
        else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) return false;
            }
        }
        return true;
    }
}