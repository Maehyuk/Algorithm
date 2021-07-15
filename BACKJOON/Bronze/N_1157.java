package Bronze;

import java.util.Scanner;

public class N_1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		int arr[] = new int[26];

		for (int i = 0; i < input.length(); i++) {
			int target = Character.toUpperCase(input.charAt(i)) - 65;
			arr[target]++;
		}

		int max = -1;
		char ans = '?';

		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ans = (char) (i + 'A');
			} else {
				ans = '?';
			}
		}

		System.out.println(ans);

	}

}
