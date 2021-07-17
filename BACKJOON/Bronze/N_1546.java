package Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class N_1546 {

	public static void main(String[] args) {			 
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			
			double arr[] = new double[N];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextDouble();
			}
			
			double sum = 0;
			Arrays.sort(arr);
			
			for(int i = 0; i < arr.length; i++) {
				sum += ((arr[i] / arr[arr.length-1])*100);
			}
			System.out.print(sum/N);
		}
}
