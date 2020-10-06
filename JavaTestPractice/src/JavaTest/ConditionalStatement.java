package JavaTest;

public class ConditionalStatement {

	public static void main(String[] args) {

		
		int marks = 50;
		boolean grade=true;
		
/// ********************* IF Statement ****************************///
		System.out.println("Before the Result ");
		if (marks > 35) {

			System.out.println("The Student Is pass");
			System.out.println("Marks of student " + marks);
		}

		System.out.println("The Student is failed ");
		
		
		
		System.out.println("************************************IF Else statement ************************************");
		
		if (marks > 35) {

			System.out.println("The Student Is pass");
			System.out.println("Marks of student " + marks);
		}
		else {
		System.out.println("The Student is failed ");
		}
		
		
		System.out.println("************************************with Boolean varibale ************************************");
				
         if (!grade) {
			
			System.out.println("The Student Is pass");
		}
		else
		{
			System.out.println("The Student Is failed");
		}
		
		
		
	}

}
