import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int min=0;
        int max = 0;
        if(N<M){
            min = N;
            max = M;
        }else if(N>M){
            min = M;
            max = N;
        }
        else{
            System.out.println(0);
            return;
        }
        int maxCount =0;
        int minCount = 0;
        int lastCount = 0;
        while (max>0){
            max-=4;
            maxCount++;
        }
        maxCount--;
        max+=4;

        while(min>0){
            min-=4;
            minCount++;
        }
        min+=4;
        minCount--;

        if(min>max){
            lastCount+=min-max;
        } else if (max > min) {
            lastCount+= max-min;
        }else{

        }
        lastCount+= maxCount-minCount;
        System.out.println(lastCount);
    }
}

