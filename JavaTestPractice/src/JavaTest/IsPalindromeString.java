package JavaTest;

import java.util.Scanner;

public class IsPalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");

		String str1 = sc.next();
		String Org_String = str1;
		String rev = "";

		int len = str1.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str1.charAt(i);
		}

		if (Org_String.equals(rev)) {

			System.out.println(Org_String + " is Palidrome String");
		} else {
			System.out.println(Org_String + " is not Palidrome String ");
		}

	}

}
