import java.math.BigInteger;

class Solution {
    public long solution(long price, long money, long count) {
        long answer = 0;

        if(count == 1) {
            answer = price - money > 0 ? price - money : 0;
            return answer;
        }

        long gaussSum = (price + (price*count)) * (count / 2);
        
        gaussSum = count % 2 == 0 ? gaussSum : gaussSum + (long) price * ((count/2)+1);
        
        if(gaussSum > money){
            answer = gaussSum - money;
        }

        return answer;
    }
}

