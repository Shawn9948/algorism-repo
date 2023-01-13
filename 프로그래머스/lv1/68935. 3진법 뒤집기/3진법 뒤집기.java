class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] ternaryArray = Integer.toString(n, 3).toCharArray();

        for (int i = 0; i < ternaryArray.length/2; i++) {
            char swapStorage =ternaryArray[i];
            ternaryArray[i]= ternaryArray[ternaryArray.length - i - 1];
            ternaryArray[ternaryArray.length - i - 1] = swapStorage;
        }

        String semiResult = "";

        for (int i = 0; i < ternaryArray.length; i++) {
            semiResult += String.valueOf(ternaryArray[i]);
        }

        answer = Integer.parseInt(semiResult, 3);
        return answer;
    }
}