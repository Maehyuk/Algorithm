package Bronze;

import java.util.Scanner;

public class N_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		System.out.println(N*(K%10));
		System.out.println(N*(K%100/10));
		System.out.println(N*(K/100));
		System.out.println(N*K);
		


	}

}
