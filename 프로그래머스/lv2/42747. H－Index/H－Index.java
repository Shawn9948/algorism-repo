import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        /*배열을 돌면서 i보다 큰 인덱스의 수를 구한다. 만약 i와  i보다 큰 인덱스의 수가 같다면, 
        h인덱스에 포함시킨다. */
        
        int count = 0;
        
        Arrays.sort(citations);
        
        int length = citations[citations.length-1];

        //크기가 citations요소의 최대값인 배열 생성
        int [] hIndexList = new int [length+1]; 
        
        for(int i = 0; i<length ; i++){
            for(int j = 0 ; j<citations.length;j++){
                if(i <= citations[j]){
                    count++;
                }
            }
            if(i <= count){
                hIndexList[i] = i;
            }
            count = 0;
        }
        
        Arrays.sort(hIndexList);
        answer = hIndexList[hIndexList.length-1];
         return answer;   
    }
}

// 3 0 6 1 5

/*
0일때 5
1일때 4
2일때 3
3일때 3
4일때 2
5일때 2
6일때 1

*/