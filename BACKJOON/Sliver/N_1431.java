package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class N_1431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =  Integer.parseInt(br.readLine());

        String arr[] = new String[N];

        for(int i=0; i<N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String s1, String s2){

                if(s1.length()<s2.length()) {
                    return -1;
                }
                else if(s1.length()==s2.length()) {
                    if(add(s1)==add(s2)) {
                        return s1.compareTo(s2);
                    }
                    else {
                        return Integer.compare(add(s1), add(s2));
                    }
                }
                else {
                    return 1;
                }

            }
        });



        for(String i : arr) {
            System.out.println(i);
        }
    }

    public static int add(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
                sum+=s.charAt(i)-'0';
            }
        }
        return sum;
    }


}
