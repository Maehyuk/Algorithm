package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_10828 {

	private static int[] stack;
	private static int size = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int N = Integer.parseInt(br.readLine());

		String input;

		stack = new int[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			input = st.nextToken();

			switch (input) {
				case "push":
					int X = Integer.parseInt(st.nextToken());
					stack[size] = X;
					size++;
					break;
				case "pop":
					if(size == 0) {
						System.out.println(-1);
					} else {
						System.out.println(stack[size-1]);
						size--;
					}
					break;
				case "size":
					System.out.println(size);
					break;
				case "empty":
					if(size == 0) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
					break;
				case "top":
					if(size == 0) {
						System.out.println(-1);
					}else {
						System.out.println(stack[size-1]);
					}
					break;
			}
		}

	}
}