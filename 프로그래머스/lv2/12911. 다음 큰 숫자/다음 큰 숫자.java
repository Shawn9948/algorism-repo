class Solution {
public  int solution(int n) {
        int answer = 0;
        String s = Integer.toBinaryString(n);

        int oneCount = 0;

        oneCount = getOneCount(s, oneCount);


        String nextS = "";
        int findCount = 0;

        while (oneCount != findCount) {

            findCount = 0;
            n++;

            nextS = Integer.toBinaryString(n);

            findCount = getOneCount(nextS, findCount);
            
        }

        return Integer.parseInt(nextS, 2);
    }

    private static int getOneCount(String s, int oneCount) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                oneCount++;
            }
        }
        return oneCount;
    }

}