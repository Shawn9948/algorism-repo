class Solution {
    public int[] solution(String s) {
        int cycleCount = 0;
        int removedCount = 0;
        StringBuilder stringBuilder;
        while (!s.equals("1")) {
            cycleCount++;
            stringBuilder = new StringBuilder();
            for (char x : s.toCharArray()) {
                if (x != '0') {
                    stringBuilder.append('1');
                } else {
                    removedCount++;
                }
            }
            s = Integer.toString(stringBuilder.length(), 2);
        }
        return new int[]{cycleCount, removedCount};
    }
}