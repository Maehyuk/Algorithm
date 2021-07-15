package Bronze;

import java.util.Scanner;

public class N_1032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] str = new String[N];

		for (int i = 0; i < N; i++) {
			str[i] = sc.next();
		}
		
		boolean check = false;


		for (int j = 0; j < str[0].length(); j++) {
			check = false;
			for (int k = 0; k < str.length - 1; k++) {
				if (str[k].charAt(j) != str[k + 1].charAt(j)) {
					check = true;
					break;
				}
			}
			if (check) {
				System.out.print("?");
			} else {
				System.out.print(str[0].charAt(j));
			}
		}

	}
}
