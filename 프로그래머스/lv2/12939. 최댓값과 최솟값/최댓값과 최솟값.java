import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String s) {
            String answer = "";
            String[] arr = s.split(" ");

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                list.add(Integer.parseInt(arr[i]));
            }

            Collections.sort(list);

            answer = (String.valueOf(list.get(0))+" "+ String.valueOf(list.get(list.size() - 1)));
            return answer;
        }
    }
