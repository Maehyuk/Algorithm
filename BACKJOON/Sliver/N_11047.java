package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        int count = 0 ;
        int p = 1;
        boolean check = true;

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        while(check) {
            if(arr[N-p]<K){
                K -= arr[N-p];
                count++;

            } else if(arr[N-p]>K){
                p++;
            } else if(arr[N-p]==K){
                count++;
                check = false;
            }
        }

        System.out.println(count);


    }
}
