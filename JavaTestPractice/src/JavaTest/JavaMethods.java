package JavaTest;

public class JavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name="Hupen";
		greetingMsg(Name);
		addition(2, 3);
		
		String WarmRegards= greetingMsg(Name);
		System.out.println("Printing the Return Value for The calling method ="+WarmRegards);
        
	}

	public static int addition(int a, int b) {

		int sum = a + b;
		System.out.println("The Sum is :" + sum);
		return sum;

	}
	
	
	
	public static String greetingMsg(String name) {
		
		System.out.println("Hello "+name+", I am Learning Java ");
		return "thanks";
		
	}
	

}
