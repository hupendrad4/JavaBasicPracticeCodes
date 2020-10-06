package JavaTest;

public  class ParentClass {

	int abc = 10;
	int result = 0;

	public final void addNumber() {
		result = abc + 20;

		System.out.println("The Addition Result is :" + result);
	}
}
