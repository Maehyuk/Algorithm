package Bronze;

import java.util.Scanner;

public class N_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 0;
		int arr = 0;
		String sum = sc.next();
		
		if(sum.length() == N ) {
			for (int j = 0; j < sum.length(); j++) {
				arr = (int) sum.charAt(j)-'0';
				answer += arr;
			}
			System.out.println(answer);
		}
	}
}
