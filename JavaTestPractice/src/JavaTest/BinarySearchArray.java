package JavaTest;

import java.util.Arrays;

public class BinarySearchArray {

	public static void main(String[] args) {
		// For Binary Search with Array should be in sorted order

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		boolean flag = false;
		int key = 21;
		int l = 0;
		int h = arr.length - 1;

		while (l < h) {

			int m = (l + h) / 2;
			if (arr[m] == key) {
				System.out.println("Element Found");
				flag = true;
				break;
			}
			if (arr[m] < key) {
				l = m + 1;
			}
			if (arr[m] > key) {
				h = m - 1;

			}
		}

		if (flag == false) {
			System.out.println("Element not found");
		}
		
		System.out.println("//******************WithBinarySearchClass***************//");
		
		System.out.println(Arrays.binarySearch(arr, 7));

	}

}
