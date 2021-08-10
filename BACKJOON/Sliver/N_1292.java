package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_1292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int arr[] = new int[2000];

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int index = 0;
		int sum = 0;

		for (int i = 1; i <= 1000; i++) {
			for (int j = 0; j < i; j++) {
				if (index == 1001) {
					break;
				}
				index++;
				arr[index] = i;
			}
		}

		for (int i = A; i <= B; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
