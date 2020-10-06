package JavaTest;

import java.util.Scanner;

public class PrimeNumber {

//Number should be >1 
//The number should have only 2 factors 1 and number itself

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = sc.nextInt();
		int count = 0;

		if (num1 > 1) {
			for (int i = 1; i <= num1; i++) {

				if (num1 % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("The Number is Prime Number");
			} else {
				System.out.println("The Number is Not a Prime Number");
			}
		} else {
			System.out.println("The number is not Prime Number");
		}
	}
}
