package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class N_10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<K; i++) {
			
			int a = Integer.parseInt(br.readLine());
			
			if(a == 0) {
				stack.pop();
			} else {
				stack.push(a);				
			}
		}
		
		int b = 0;

		for(int i=0; i<stack.size(); i++) {
			b += stack.get(i);
		}
		
		System.out.println(b);
	}

}
