class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        int big = 0;
        int small = 0;

        if(sizes[0][0]> sizes[0][1]){
            big = sizes[0][0];
            small = sizes[0][1];
        }else {
            big = sizes[0][1];
            small = sizes[0][0];
        }

        int bigNum;
        int smallNum;
        for (int i = 1; i < sizes.length; i++) {
            if(sizes[i][0]> sizes[i][1]){
                bigNum = sizes[i][0];
                smallNum = sizes[i][1];
            }else {
                bigNum = sizes[i][1];
                smallNum = sizes[i][0];
            }

            if (big < bigNum) {
                big = bigNum;
            }
            if (small < smallNum) {
                small = smallNum;
            }
        }

        answer = big * small;
        return answer;
    }
}