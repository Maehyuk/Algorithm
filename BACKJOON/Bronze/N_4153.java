package Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class N_4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[3];
		
		while(true) {
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			if(arr[0] + arr[1] + arr[2] == 0) {
				return;
			}
			
			
			Arrays.sort(arr);
			
			if(Math.pow(arr[2], 2) == Math.pow(arr[1], 2) + Math.pow(arr[0], 2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}

	}

}
