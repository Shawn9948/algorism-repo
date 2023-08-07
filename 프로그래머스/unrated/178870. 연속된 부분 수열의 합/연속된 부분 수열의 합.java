class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {};
        int minLength = Integer.MAX_VALUE;
        int lp = 0;
        int sum = sequence[lp];
        int rp = 0;

        while (lp <= rp) {
            if (sum == k) {
                if (minLength > rp - lp) {
                    answer = new int[]{lp, rp};
                    minLength = rp - lp;
                }
                sum -= sequence[lp++];
            }
            else if (rp != sequence.length-1 && sum < k) {
                sum += sequence[++rp];
            } else {
                sum -= sequence[lp++];
            }
        }
        return answer;
    }
}