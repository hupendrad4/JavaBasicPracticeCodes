package JavaTest;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number for which a factorial is required :" );
		int num = sc.nextInt();

		long fact = 1;
		int i = 1;
		while (i < num) {
			fact = fact * num;
			num--;
		}
		System.out.println(fact);
	}

}
