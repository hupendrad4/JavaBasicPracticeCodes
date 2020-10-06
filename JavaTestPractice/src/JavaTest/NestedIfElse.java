package JavaTest;

public class NestedIfElse {

	public static void main(String[] args) {

		int num1 = 101;
		int num2 = 200;
		String city = "Dhule";
		int num3 = 202;

		if (num1 == num2) {
			System.out.println("Print 1st If statement block");

			/*
			 * if (num1 > num3) { System.out.println("num1 is greater than num3"); }
			 */
		} else {
			if (city.equalsIgnoreCase("Dhule")) {
				System.out.println(" Inside 1st else statement block");
				System.out.println(" Inside nested if statement");

				if (num3 > 200) {
					System.out.println("Inside 3rd if condition block");
					System.out.println("num3 is greater than 200");
				} else {
					System.out.println("Inside 2nd else condition block");
					System.out.println("num3 is less than 200");

				}
			}
		}
		System.out.println("Print the Outside if statement ");
	}

}
