package JavaTest;

public class Swapping2numbers {

	public static void main(String[] args) {

		int x, y, temp;

		x = 50;
		y = 65;

		System.out.println("Before Swapping The Value of X :" + x + " And Y :" + y);
		x = x * y;
		y = x / y;
		x = x / y;

		System.out.println("After Swapping The Value of X :" + x + " And Y :" + y);

	}

}
