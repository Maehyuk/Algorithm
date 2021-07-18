package Sliver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class N_1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String arr[] = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
			
		}

		Arrays.sort(arr);
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str1.length() - str2.length();
			}
		});
		
		System.out.println(arr[0]);
		for (int i = 1; i < N; i++) {
			if(!arr[i].equals(arr[i-1])) {
				System.out.println(arr[i]);				
			}
		}

	}

}
