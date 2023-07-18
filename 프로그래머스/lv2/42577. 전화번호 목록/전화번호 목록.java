import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<Integer, List<String>> map = new HashMap();
        int startNumber = 0;
        for(int i =0; i<phone_book.length; i++){
            startNumber = phone_book[i].charAt(0) - '0';
            List<String> list = map.getOrDefault(startNumber, new ArrayList<String>());
            list.add(phone_book[i]);
            map.put(startNumber, list);
        } 
        
        for(List<String> list : map.values()){
            if(!answer) break;
            Collections.sort(list);
            for(int i = 0; i<list.size()-1; i++){
                    if(list.get(i+1).startsWith(list.get(i))) {
                        answer = false;
                        break;
                    }
                }
            }
        return answer;
    }
}