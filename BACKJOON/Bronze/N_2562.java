package Bronze;

import java.util.Scanner;

public class N_2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[9];
		int max = 0;
		int idx = 0;
		
		for(int i=0; i<9; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		
		for(int j=0; j<arr.length; j++) {
			if(arr[j] > max) {
				max = arr[j];
				idx = j;
			} 
		}
		
		System.out.println(max);
		System.out.println(idx+1);
	}

}
