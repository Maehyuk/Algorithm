package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N_11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			for (int j = 1; j < K; j++) {
				queue.add(queue.peek());
				queue.remove();
			}
			arr[i] = (int) queue.remove();
		}

		System.out.print("<");
		for (int i = 0; i < N - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print(arr[N - 1] + ">");
	}
}
