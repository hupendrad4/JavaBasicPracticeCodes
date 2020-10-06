package JavaTest;

public class ScannerClass {

	int sum(int x, int y) {

		int z = x + y;
		System.out.println("The Sum :" + z);
		return z;

	}

	int sub(int x, int y) {

		int z = x - y;
		System.out.println("The Sum :" + z);
		return z;

	}

	public static void main(String[] args) {

		ScannerClass T = new ScannerClass();

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Inter First No-");
		int x = sc.nextInt();

		System.out.println("Inter Second No-");
		int y = sc.nextInt();

		if (x > y) {
			T.sum(x, y);

		} else {

			T.sub(x, y);
		}
	}

}
