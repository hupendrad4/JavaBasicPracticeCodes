package JavaTest;

import java.util.Scanner;

public class ReverseNumByStringBuilder {

	public static void main(String[] args) {
		System.out.println("Enter The number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		StringBuilder rev;
		StringBuilder sb = new StringBuilder(String.valueOf(num));
		rev = sb.reverse();
		System.out.println("The Reverse of Number is :" + rev);

	}

}
