package Sliver;

import java.util.Scanner;
import java.util.Stack;

public class N_9012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			System.out.println(method(sc.next()));
		}
	}

	public static String method(String input) {
		Stack<Character> stack = new Stack<Character>();

		for (int j = 0; j < input.length(); j++) {
			
			char ch = input.charAt(j);

			if (ch == '(') {
				stack.push(ch);
			} 
			
			else if (stack.empty()) {
				return "NO";
			} 
			
			else {
				stack.pop();
			}
		}

		if (stack.empty()) {
			return "YES";
		} 
		else {
			return "NO";
		}

	}

}
