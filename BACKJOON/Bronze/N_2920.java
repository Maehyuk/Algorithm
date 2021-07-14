package Bronze;

import java.util.Scanner;

public class N_2920 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String arr = sc.nextLine();
		
		sc.close();
		
		if(arr.equals("1 2 3 4 5 6 7 8")) {
			System.out.println("ascending");
		} else if (arr.equals("8 7 6 5 4 3 2 1")) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}