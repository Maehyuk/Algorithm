package Bronze;

import java.util.Scanner;

public class N_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int count = 0;
			int sum = 0;

			String ans = sc.next();
			
			for(int j=0; j<ans.length(); j++) {
				if (ans.charAt(j) == 'O') {
					count++;
					sum += count;
				} else {
					count = 0;
					sum += 0;
				}
			}

			
			System.out.println(sum);
		}

	}

}
