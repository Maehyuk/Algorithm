package Bronze;

import java.util.Scanner;

public class N_2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(N+" * "+i+" = "+(N*i));
		}
	}

}
