package Bronze;

import java.util.Scanner;

public class N_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		String temp = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			temp += a.charAt(i);
		}

		String temp2 = "";
		for (int i = b.length() - 1; i >= 0; i--) {
			temp2 += b.charAt(i);
		}

		int ans1 = Integer.parseInt(temp);
		int ans2 = Integer.parseInt(temp2);
		
		if (ans1 > ans2) {
			System.out.println(ans1);			
		} else {
			System.out.println(ans2);			
		}

	}
}
