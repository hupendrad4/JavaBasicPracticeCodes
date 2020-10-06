package JavaTest;

import java.util.Scanner;

public class CountEvn_OddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");

		int num = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;

		while (num > 0) {
			int reminder = num % 10;
			if (reminder % 2 == 0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
			num = num / 10;
		}
		System.out.println("The Even digit Count is: " + evenCount);
		System.out.println("The Odd digit Count is: " + oddCount);
	}

}
