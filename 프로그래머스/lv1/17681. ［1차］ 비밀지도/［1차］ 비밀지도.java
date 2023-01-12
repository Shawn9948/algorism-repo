import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        //배열을 돌리면서 이진수로 바꾼 후 이진수로 변환된 수를 문자열로 변환후
        //0이라면 공백 1이라면 #으로 새로운 문자열에 입력한다.
        // 그뒤 그 문자열을 결과 배열에 입력한다.
        int size = n;
        String[] answer = new String[size];

        for (int i = 0; i < n; i++) {
            String arr1Binary = Integer.toBinaryString(arr1[i]);
            String arr2Binary = Integer.toBinaryString(arr2[i]);

            List<String> secretMap1 = findSecret(arr1Binary, size);
            List<String> secretMap2 = findSecret(arr2Binary, size);

            String semiResults = "";
            for (int j = 0; j < n; j++) {
                if (secretMap1.get(j).equals("#")  || secretMap2.get(j).equals("#")) {
                    semiResults += "#";
                } else {
                    semiResults += " ";
                }
            }
            answer[i] = semiResults;

        }

        return answer;
}
    private static List<String> findSecret(String arrBinary,int size) {
        if (arrBinary.length() != size) {
            String filZero = "";
            for (int i = 0; i < size - arrBinary.length(); i++) {
                filZero += "0";
            }
            arrBinary = filZero + arrBinary;
        }
        return arrBinary.chars().mapToObj(arr1Char -> {
            return arr1Char == '0' ? " " : "#";
        }).collect(Collectors.toList());
    }
}