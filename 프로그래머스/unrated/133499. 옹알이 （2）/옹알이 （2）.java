class Solution { 
    public int solution(String[] babbling) {
        String[] pronounce = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for(String x : babbling){
            if(x.contains("ayaaya") || x.contains("yeye") || x.contains("woowoo") || x.contains("mama"))
                continue;
            for(String p : pronounce){
                x = x.replace(p, " ");
            }
            x = x.replace(" ", "");
            if(x.length() == 0) answer++;
        }
        return answer;
    }
}