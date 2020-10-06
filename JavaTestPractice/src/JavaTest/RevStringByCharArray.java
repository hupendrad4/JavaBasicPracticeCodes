package JavaTest;

public class RevStringByCharArray {

	public static void main(String[] args) {

		String str1 = "Deore";
		String rev = "";

		char arr[] = str1.toCharArray();
		System.out.println("The String array is " + str1);
		int len = arr.length;
		System.out.println("Array Length is : " + len);

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + str1.charAt(i);

		}
		System.out.println("The Reverse String is :" + rev);

	}

}
