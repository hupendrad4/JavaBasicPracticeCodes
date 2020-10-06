package JavaTest;

class abc {

	int a = 10;
	int b = 20;
	int result;

	public void addNumber() {
		result = a + b;
	}

}

public class Calculator {

	public static void main(String[] args) {

		abc obj = new abc();

		System.out.println("The Value of a :" + obj.a);
		System.out.println("The Value of b :" + obj.b);
		System.out.println("Before Instantiating method :" + obj.result);
		obj.addNumber();
		System.out.println("After Instantiating add method  :" + obj.result);

	}
}