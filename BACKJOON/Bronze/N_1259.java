package Bronze;

import java.util.Scanner;

public class N_1259 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while (check) {
			int count = 0;

			String num = sc.nextLine();
			char[] arr = new char[num.length()];

			for (int i = 0; i < num.length(); i++) {
				arr[i] = num.charAt(i);

			}

			for (int i = 0; i < num.length() / 2; i++) {
				if(arr[i] == arr[num.length() - (i+1)]) {
					count++;
				} else {
					count += -9999;
				}
			}
			
			if (Integer.parseInt(num) == 0) {
				return;
			} 
			
			if(count<0) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}

			

						

		}
	}
}
