import java.util.*;

class Solution {
        public long solution(long n) {
        StringBuilder sb = new StringBuilder();

        String number = String.valueOf(n);

        List<String> numArr = new ArrayList<>();

        for (int i = 0; i < number.length(); i++) {
            numArr.add(String.valueOf(number.charAt(i)));
        }

        Collections.sort(numArr, Comparator.reverseOrder());

        numArr.stream().forEach(sb::append);

        return Long.parseLong(String.valueOf(sb));
    }
}