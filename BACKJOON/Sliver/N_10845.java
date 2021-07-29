package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N_10845 {


	public static void main(String[] args) throws IOException {

		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int N = Integer.parseInt(br.readLine());
		int X = 0;
		String input;

		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			input = st.nextToken();

			switch (input) {
				case "push":
					X = Integer.parseInt(st.nextToken());
					queue.add(X);
					break;
				case "pop":
					if(queue.size() == 0) {
						System.out.println(-1);
					} else {
						System.out.println(queue.poll());
					}
					break;
				case "size":
					System.out.println(queue.size());
					break;
				case "empty":
					if(queue.size() == 0) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
					break;
				case "front":
					if(queue.size() == 0) {
						System.out.println(-1);
					}else {
						System.out.println(queue.peek());
					}
					break;
				case "back" :
					if(queue.size() == 0) {
						System.out.println(-1);
					}else {
						System.out.println(X);
					}
					
			}
		}

	}
}