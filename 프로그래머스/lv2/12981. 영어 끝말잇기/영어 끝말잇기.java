import java.util.*;

class Solution {
        public  int[] solution(int n, String[] words) {
        // 프로그래머스 영어 끝말잇기 레벨 2
        // 1. 중복값 체크
        // 2. 잘못된 단어 체크
        // 3. 에러가 없으면 0,0 출력


            
        int order = 1;
        int who = 2;
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for (int i = 1; i < words.length; i++) {

            String lastWord = list.get(i - 1);

            // 중복값 체크k
            if (list.contains(words[i])) {
                System.out.println("중복값");
                return new int[]{who, order};
            }
            // 잘못된 단어 체크
            else if (lastWord.charAt(lastWord.length()-1) != words[i].charAt(0)) {
                System.out.println("잘못된 단어");
                return new int[]{who, order};
            } else {

                list.add(words[i]);
            }

            if (who == n) {
                who = 1;
                order++;
            } else {
                who++;
            }
        }
        // 무이상 -> 0,0 리턴
        return new int[]{0,0};
    }
}