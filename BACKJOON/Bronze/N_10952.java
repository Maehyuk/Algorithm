package Bronze;

import java.util.Scanner;

public class N_10952 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		do {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			
			if(A==0 && B==0) {
				a = false;
			} else {
				System.out.println(A+B);				
			}
			
			
		}while(a);
		
		
	}
}
