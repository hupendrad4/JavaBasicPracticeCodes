package JavaTest;

import java.util.Arrays;
import java.util.Collections;

public class ParallelSorting {

	public static void main(String[] args) {

		int arr[] = { 45, 66, 5, 8, 57, 98, 100, 452 };
		System.out.println("******************** Parallel Sort Approach 1 *******************");

		System.out.println("The Array Before Sorting: " + Arrays.toString(arr));
		Arrays.parallelSort(arr);
		System.out.println("The array After Sorting: " + Arrays.toString(arr));
		System.out.println("******************** Sorting array- Approach 2 *******************");

		Arrays.sort(arr);
		System.out.println("The array After Sorting: " + Arrays.toString(arr));
		System.out.println("********************  Sorting array in reverse direction -Approach 3 *******************");

		Integer arr1[] = { 45, 66, 5, 8, 57, 98, 100, 452 };
		Arrays.sort(arr1);
		Arrays.sort(arr1, Collections.reverseOrder()); // {To run Reverse for collection does not work on primitive
														// datatypes, we have to covert User defined type}
		System.out.println("The array After Sorting: " + Arrays.toString(arr1));

	}

}
