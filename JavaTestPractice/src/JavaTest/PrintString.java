package JavaTest;

public class PrintString {

	public static void main(String[] args) {
	
		
		String str1="My first Java program";
		System.out.println(str1);
		
		//UpperCase
		String UpperCaseString=str1.toUpperCase();
		System.out.println(UpperCaseString);
		
		//LowerCase
		String LowerCase=str1.toLowerCase();
		System.out.println(LowerCase);
		
		char ch =str1.charAt(4);
		System.out.println(" The Char at Index 4 is :"+ch);
		
     	String ConcatenedString=	str1.concat(" on Eclipse");
		System.out.println("The Complete String :"+ConcatenedString);
		
	    int TheIndex=str1.indexOf( "J");
		System.out.println("The J is at Index :" +TheIndex);
		
		int TheIndexOfString=str1.indexOf("program");
		System.out.println("The Index of String program :"+TheIndexOfString);
		
		int StrLength=str1.length();
		System.out.println("The String Length:"+StrLength);
		
		
		

	}

}
