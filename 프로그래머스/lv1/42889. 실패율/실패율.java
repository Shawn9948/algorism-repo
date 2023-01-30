import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        double stageCount = stages.length;
        double[] totalStages = new double[N];
        Map<Integer, Double> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            map.put(i, 0.0);
        }

        for (int stage : stages) {
            if (stage == N + 1) {

                continue;
            }
            map.put(stage, map.getOrDefault(stage, 0.0) + 1);
        }

        for (int i = 1; i <= N; i++) {
            totalStages[i - 1] = (map.get(i) / stageCount);
            stageCount -= map.get(i);
        }

        for (int i = 1; i <= N; i++) {
            map.put(i, totalStages[i-1]*1000000);
        }
        
        List<Map.Entry<Integer, Double>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                return (int) ((o2.getValue()*1000000000 - o1.getValue()*1000000000));
            }
        });

        int i = 0;
        for(Map.Entry<Integer, Double> entry : entryList) {
            answer[i] = entry.getKey();
            i++;
        }

        return answer;
    }
}