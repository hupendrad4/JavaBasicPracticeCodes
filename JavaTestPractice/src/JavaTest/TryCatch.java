package JavaTest;

public class TryCatch {
	public static void main(String[] args) {
		try {
			System.out.println("***Hi All***");
			int a = 45;
			int b = (Integer) null;
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ae) // we can also use superclass
		// as Exception instead of particular exception
		// type ArithmeticException
		{
			System.out.println("***Print When its Arithmetic Exception:number cann't be devided by zero***");
		} catch (NullPointerException ne) {
			System.out.println("***Print When Its Null pointer Exception***");

		} catch (Exception E) {

			System.out.println("***Print When this is other than Arithmatic Exception***");
			E.printStackTrace();
		}
		finally {
			System.out.println("***Ending the Excecution***");
		}
	}
}
