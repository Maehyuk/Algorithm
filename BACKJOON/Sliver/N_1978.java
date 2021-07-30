package Sliver;

import java.io.IOException;
import java.util.Scanner;

public class N_1978 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;

		for (int i = 0; i < N; i++) {
			boolean check = true;
			int arr = sc.nextInt();

			if (arr == 1) {
				continue;
			}
			for (int j = 2; j < arr; j++) {
				if (arr % j == 0) {
					check = false;
					break;
				}
			}

			if (check) {
				count++;
			}
		}

		System.out.println(count);

	}
}
