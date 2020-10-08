package JavaTest;

public class ReverseCompleteString {

	public static void main(String[] args) {

		String str1 = "I love India";

		String arr[] = str1.split("\\s");

		String reverseStr = "";

		for (String a : arr) {

			String reverseWord = "";

			for (int i = a.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + a.charAt(i);
			}
			reverseStr = reverseStr + reverseWord + " ";
		}

		
		System.out.println("****************************** Approach 2- String Builder Class************************");
		
		String revereWord="";
		
		
		for(String a:arr)
		{
			StringBuilder sb=new StringBuilder();
			sb.reverse();
			revereWord=revereWord+sb.toString()+"";
		}
		
		
		
		System.out.println(reverseStr);
		System.out.println(revereWord);
	}

}
