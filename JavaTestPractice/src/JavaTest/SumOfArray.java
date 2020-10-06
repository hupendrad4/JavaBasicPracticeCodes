package JavaTest;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int arr[] = { 5, 3, 6, 9, 6, 8, 7, 7 };
		int sum = 1;
		int i = 0;
		while (i < arr.length) {
			sum = sum + arr[i];
			i++;
		}
		System.out.println("Sum of Array elements are : "+sum);
	}

}
