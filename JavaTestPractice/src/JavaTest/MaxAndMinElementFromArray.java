package JavaTest;

public class MaxAndMinElementFromArray {

	public static void main(String[] args) {

		int arr[] = { 20, 19, 65, 45, 98, 78 };
		int max = arr[0];
		int min=  arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}
			else if( min >arr[i]){
				min = arr[i];
			}
		}
		System.out.println("The Max Element from the Array is:" +max);
		System.out.println("The Min Element from the Array is:" +min);
	}

}
