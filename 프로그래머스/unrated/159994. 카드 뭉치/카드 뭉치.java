class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int lp = 0;
        int rp = 0;
        
        for(int i = 0; i< goal.length; i++){
            String target = goal[i];
            if(lp < cards1.length && cards1[lp].equals(target)) lp++;
            else if(rp < cards2.length && cards2[rp].equals(target)) rp++;
            else return "No";
        }
        return "Yes";
    }
}