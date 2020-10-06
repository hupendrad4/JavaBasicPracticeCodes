package JavaTest;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {

		// integer array

		int arr1[] = new int[10];

		arr1[0] = 20;
		arr1[2] = 25;
		arr1[5] = 28;
		arr1[3] = 25;
		arr1[9] = 21;
		arr1[4] = 29;
		arr1[7] = 22;
		System.out.println("The Array Elements at 0th :" + arr1[0]);
		System.out.println("The Array Elements at 1th :" + arr1[1]);
		System.out.println("The Array Elements at 2nd :" + arr1[2]);
		System.out.println("The Array Elements at 5th :" + arr1[3]);
		System.out.println("The Array Elements at 3rd :" + arr1[4]);
		System.out.println("The Array Elements at 4th :" + arr1[5]);
		System.out.println("The Array Elements at 5th :" + arr1[6]);
		System.out.println("The Array Elements at 7th :" + arr1[7]);
		System.out.println("The Array Elements at 8th :" + arr1[8]);
		System.out.println("The Array Elements at 9th :" + arr1[9]);
		// System.out.println("The Array Elements at 10th :" +arr1[10]);

		///// ************String Array*******************/////////////

		System.out.println("/************String Array*******************/");

//		String testStudent[]=new String [5];
//		testStudent[0]="Ramesh";
//		testStudent[1]="Suresh";
//		testStudent[3]="Rajesh";
//		testStudent[4]="Lokesh";

		String testStudent[] = { "Ramesh", "Suresh", "0", "Rajesh", "Lokesh" };

		System.out.println("The 1st student Is : " + testStudent[0]);
		System.out.println("The 2nd student Is : " + testStudent[1]);
		System.out.println("The 3rd student Is : " + testStudent[2]);
		System.out.println("The 4th student Is : " + testStudent[3]);
		System.out.println("The 5th student Is : " + testStudent[4]);

		System.out.println("*****************  Sorting an Array ************************");

		System.out.println("***************** Before Sorting an Array ************************");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Printing Array before Sorting :" + arr1[i]);
		}

		System.out.println("*****************  After Sorting an Array ************************");
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Printing Array before Sorting :" + arr1[i]);
		}
	}

}
