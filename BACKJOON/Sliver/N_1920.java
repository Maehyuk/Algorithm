package Sliver;

import java.util.Arrays;
import java.util.Scanner;

public class N_1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] A = new int[n];
		
		for(int i=0; i< n; i++) {
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		int m = sc.nextInt();
		
		for(int i=0; i<m; i++) {
			int search = sc.nextInt();
			int left = 0;
			int pivot = A.length - 1;
			boolean check = false;
			
			while(left<=pivot) {
				int middle = (left + pivot) / 2;
				int midValue = A[middle];
				if (midValue > search) {
					pivot = middle - 1;
                } else if (midValue < search) {
                    left = middle + 1;
                } else { 
                	check = true;
                    System.out.println(1);
                    break;
                }
			}
            if (!check) {
                System.out.println(0);
            }
		}
		sc.close();
	}
}
