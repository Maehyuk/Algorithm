package Bronze;

import java.util.Scanner;

public class N_1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		sc.close();
		
		String str = (A>B) ? ">" : ((A<B) ? "<" : "==");
		System.out.println(str);
	}

}
