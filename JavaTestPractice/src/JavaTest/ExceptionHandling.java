package JavaTest;

public class ExceptionHandling {

	public static void main(String[] args) {
			
		addNumber(5,10);
		
	}

	

	public static int addNumber(int a, int b) {
		
		divisionOfNumber(2,3);
		int sum=a+b;
		return sum;
		
	}
	
	
	public static int divisionOfNumber(int a ,int b) {
		
		
		int result= a /0;
		return result;
		
		
	}
}
