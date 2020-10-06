package JavaTest;

public class MissingNumInArray {

	public static void main(String[] args) {

		int i = 0;
		int sum = 0;
		int sumOfRange = 0;
		int arr[] = { 1, 2, 3,4 , 5 ,6,7,9,10};

		while (i < arr.length) {
			sum = sum + arr[i];
			i++;
		}
		for (i = 1; i <= 10; i++) {
			sumOfRange = sumOfRange + i;
		}
		int MissingElement = sumOfRange - sum;
		System.out.println("The Missing Element From the Array Is: " + MissingElement);

		// System.out.println("Sum of Elements in Array: "+sum);

		
		
	}

}
