package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N_2164 {


	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue q = new LinkedList();
		boolean check = true;
		
		for(int i=1; i<=N; i++) {
			q.offer(i);
		}
	
		while(check) {
			if(q.size() == 1) {
				check = false;
				System.out.println(q.peek());
			} else {
				q.remove();
				int a = (int) q.peek();
				q.remove(q.peek());
				q.offer(a);
			}
		}
	}
	

}
