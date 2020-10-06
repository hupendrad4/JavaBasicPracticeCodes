package JavaTest;

import java.util.Scanner;

public class IsPalindromNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int num = sc.nextInt();
		int org_num = num;

		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}

		if (org_num == rev) {

			System.out.println("The Number is Palindrom");
		} else {
			System.out.println("The Number is Not Palindrom");

		}

	}

}
