import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int length = nums.length;

        Set<Integer> kinds = new HashSet<>();
        for (int num : nums) {
            kinds.add(num);
        }
        int kindsCount = kinds.size();
        int allowCount = length / 2;
        
        return Math.min(kindsCount, allowCount);
    }
}