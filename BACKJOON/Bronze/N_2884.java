package Bronze;

import java.util.Scanner;

public class N_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M>=45) {
			System.out.println(H);
			System.out.println(M-45);
		} else if(M<45) {
			if(H==0) {
				System.out.println(23);
			} else {
				System.out.println(H-1);				
			}
			
			System.out.println(60-(45-M));
		}
		
	}

}
