package JavaTest;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Numbers :");
		int Number = sc.nextInt();
		int rev = 0;

		while (Number != 0) {
			rev = rev * 10 + Number % 10;
			Number = Number / 10;
		}
		System.out.println("The Reverse of The  Number  Is : " + rev);
	}

}
