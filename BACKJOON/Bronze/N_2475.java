package Bronze;

import java.util.Scanner;

public class N_2475 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int pow = 0;
		for(int i=0; i<5; i++) {
			int n = sc.nextInt();
			pow += Math.pow(n, 2);
		}
		
		System.out.println(pow%10);
	}

}
