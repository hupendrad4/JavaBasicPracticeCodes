package JavaTest;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {

		String Str1 = "Hupendra"; /// 8
		System.out.println("The String is :" + Str1);
		String rev = "";
		int len = Str1.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + Str1.charAt(i);
		}
		System.out.println("The Reverse of The String is :" + rev);

	}

}
