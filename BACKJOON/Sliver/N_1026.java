package Sliver;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class N_1026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A, Collections.reverseOrder());
        Arrays.sort(B);

        for (int i = 0; i < N; i++) {
            sum += A[i] * B[i];
        }

        System.out.println(sum);

        sc.close();

    }

}
