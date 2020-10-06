package JavaTest;

public class CountEvenOddElementsFromArray {

	public static void main(String[] args) {
		int arr[] = { 5, 3, 6, 9, 6, 8, 7, 7 };
		int i = 0;
		int eve_count = 0;
		int odd_count = 0;
		while (i < arr.length) {
			if (arr[i] % 2 == 0) {
				eve_count++;
			} 
			else {
				odd_count++;
			}	
			i++;
		}
		System.out.println("The count of Even elements are : "+eve_count);
		System.out.println("The count of Odd elements are : "+odd_count );
	}

}
