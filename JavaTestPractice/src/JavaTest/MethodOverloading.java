package JavaTest;

public class MethodOverloading {

	public static void main(String[] args) {

		System.out.println("The Addition of two number is : " + addNumbers(2, 5));
		System.out.println("The Addition of three number is :" + addNumbers(2, 5, 6));
		System.out.println("The Addition of four number is : " + addNumbers(2, 5, 6, 8));
	}

// Adding 2 numbers 
	public static int addNumbers(int num1, int num2) {

		int sum = num1 + num2;
		return sum;
	}

	// Adding 3 numbers
	public static int addNumbers(int num1, int num2, int num3) {

		int sum = num1 + num2 + num3;
		return sum;
	}

	// Adding 4 numbers
	public static int addNumbers(int num1, int num2, int num3, int num4) {

		int sum = num1 + num2 + num3 + num4;
		return sum;
	}

}
