package JavaTest;

public class ThrowsClass {

	public static void main(String[] args) {

		abc();
	}

	public static void abc() {
		try {
			System.out.println("***This is ABC method***");
			xyz();

		} catch (Exception E) {
			System.out.println("***The User Created Exception ***");
			E.printStackTrace();
		} // calling method
	}

	public static void xyz() throws Exception {
		int a = 0;
		a = 45 / 0;
		System.out.println("***This is XYZ method***");
		if(true) {
		throw new ArithmeticException();
		
		}
	}
}


