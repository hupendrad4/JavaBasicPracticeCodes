package JavaTest;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 8, 9, 4, 5, 3, 7, 6 };

		System.out.println("Array Beofore Sorting: " + Arrays.toString(arr));
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) // Number of Passes
		{
			for (int j = 0; j < len - 1; j++) // Iteration in each path
			{
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

			System.out.println("Array after Sorting: " + Arrays.toString(arr));
		}
	}
}