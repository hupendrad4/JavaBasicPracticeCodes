package JavaTest;

public class NestedIf{

	public static void main(String[] args) {

		int num1 = 20;
		int num2 = 20;
		String city = "Pune";

		if (num1 == num2) {
			System.out.println("Print 1st If statement block");
			if (city.equalsIgnoreCase("Dhule")) {
				System.out.println("Print 2nd If statement block");
				System.out.println("Print Inside nested if statement");
			}
		}
		System.out.println("Print the Outside if statement ");
	}

}
