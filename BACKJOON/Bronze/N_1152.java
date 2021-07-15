package Bronze;

import java.util.Scanner;

public class N_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine().trim();
		String numStr[] = str.split(" ");
		
		if(str.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(numStr.length);
		}
	}

}
