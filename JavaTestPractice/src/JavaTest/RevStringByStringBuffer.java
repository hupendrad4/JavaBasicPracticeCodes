package JavaTest;

import java.util.Scanner;

public class RevStringByStringBuffer {

	public static void main(String[] args) {
		System.out.println("Enter The number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		StringBuffer rev;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		rev = sb.reverse();
		System.out.println("The Reverse of Number is :" + rev);

	}

}
