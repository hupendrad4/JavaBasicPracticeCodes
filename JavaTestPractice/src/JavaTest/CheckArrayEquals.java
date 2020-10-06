package JavaTest;

import java.util.Arrays;

public class CheckArrayEquals {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 1, 2, 3, 4, 6,5 };

		System.out.println(Arrays.equals(arr1, arr2));
                             // OR
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {

				if (arr1[i] != arr2[i]) {
					System.out.println("The Arrays are Not equals");
				}

			}

		} else {
			System.out.println("AS the length does not equals the arrays are not same");
		}

	}

}
