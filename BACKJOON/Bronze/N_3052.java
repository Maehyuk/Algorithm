package Bronze;

import java.util.Scanner;

public class N_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int count =0;
		
		for(int i=0; i<10; i++) {
			int a = (int) sc.nextInt();
			arr[i] = a%42;
		}
		
		for(int i=0; i<10; i++) {
			boolean A = true;
			for(int j=i+1; j<10; j++) {
				if(arr[i]==arr[j]) {
					A = false;
				}			
			}		
			if(A) {
				count++;
			}
		}	
		System.out.println(count);
	}

}
