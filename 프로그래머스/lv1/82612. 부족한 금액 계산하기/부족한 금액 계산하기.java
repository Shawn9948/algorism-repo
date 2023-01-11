import java.math.BigInteger;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        if(count == 1) {
            answer = price - money > 0 ? price - money : 0;
            return answer;
        }


        BigInteger bigSum = BigInteger.valueOf((price + (price*count)));
        BigInteger multiple = BigInteger.valueOf((count / 2));
        long gaussSum = bigSum.multiply(multiple).longValue();
        
        gaussSum = count % 2 == 0 ? gaussSum : gaussSum + (long) price * ((count/2)+1);
        
        if(gaussSum > money){
            answer = gaussSum - money;
        }

        return answer;
    }
}

