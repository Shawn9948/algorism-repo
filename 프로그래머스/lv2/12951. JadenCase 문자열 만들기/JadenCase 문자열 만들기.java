class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int init = 0;
        //숫자나 공백을 만나면 초기화
        boolean first = true;
        //공백이면 false
        for (char x : arr) {
            if (x == ' ') {
                first = true;
                sb.append(x);
            }
            else if(Character.isDigit(x)){
                first = false;
                sb.append(x);
            }else {
                if (first) {
                    sb.append(Character.toUpperCase(x));
                    first = false;
                } else {
                    sb.append(Character.toLowerCase(x));
                }
            }
        }
        return sb.toString();
    }
}