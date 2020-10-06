package JavaTest;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car bmw = new Car();

		// bmw.increaseSpeed();
		bmw.setColor("red");

		System.out.println("The Color is " + bmw.getColor());

		bmw.setYear(2020);
		System.out.println(bmw.getYear());

		Car toyota = new Car();
		System.out.println(toyota.getYear());
		toyota.setYear(1865);
		System.out.println(toyota.getYear());
	}

}
