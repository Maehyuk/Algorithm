package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N_2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[8];
        int [] arr2 = new int[8];

        int sum = 0;

        for(int i=0; i<8; i++){
            arr[i] = Integer.parseInt(br.readLine());
            arr2[i] = arr[i];
        }

        Arrays.sort(arr2);

        for(int i=3; i<8; i++){
            sum += arr2[i];
        }
        System.out.println(sum);

        for(int i=0; i<8; i++) {
            for(int j=3; j<8; j++){
                if(arr[i] == arr2[j]){
                    System.out.println(i+1);
                }
            }
        }
    }
}
