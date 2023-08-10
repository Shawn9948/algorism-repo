import java.util.*;

class Solution {
    //enter, change, leave
    //uid 1234
    //name
    public String[] solution(String[] record) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        
        for(String x : record){
            String[] command =  x.split(" ");
            switch (command[0]) {
                case "Enter":
                    map.put(command[1], command[2]);
                    break;
                case "Change":
                    map.put(command[1], command[2]);
                    break;
            }        
        }
        for(String x : record){
            String[] command =  x.split(" ");
            String name = map.get(command[1]);
            switch (command[0]) {
                case "Enter":
                    list.add(name + "님이 들어왔습니다.");
                    break;
                case "Leave":
                    list.add(name + "님이 나갔습니다.");
            }        
        }
        
        answer = list.toArray(new String[0]);
        return answer;
    }
}