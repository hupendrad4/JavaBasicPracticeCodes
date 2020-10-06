package JavaTest;

import java.util.Scanner;

public class SumOfDigitsInNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		int num = sc.nextInt();
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem; // 4
			num = num / 10;
		}
		System.out.println("The Sum of all the digits are: "+sum);
	}
	    

}
