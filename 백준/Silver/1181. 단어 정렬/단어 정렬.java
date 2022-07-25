import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        ArrayList <String> arrayList = new ArrayList<>();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (arrayList.contains(str)) {
                continue;
            }
            arrayList.add(str);
        }
//        System.out.println(arrayList);

       Collections.sort(arrayList,new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               if (o1.length() == o2.length()) {
                   for (int i = 0; i < o1.length(); i++) {
                       if (o1.charAt(i) != o2.charAt(i))
                           return o1.charAt(i) - o2.charAt(i);
                   }
               }

               return o1.length()- o2.length();
           }
       });
        for(String e : arrayList){
            sb.append(e+"\n");
        }
        System.out.println(sb);
    }
}