package JavaTest;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		int count = 0;

		boolean flag = false;
		int arr[] = { 2, 2, 4, 5, 6, 3, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {

					System.out.println("Duplicate Element found " + arr[i]);
					count++;
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("Duplicate Element Not Found  ");
		}

		
System.out.println("********************************************** With Hashset Approach*******************************************************************");

		HashSet<Integer> hs = new HashSet();
		boolean flag1 = false; 
		for (Integer ls : arr) {
			if(hs.add(ls)==false) {
				System.out.println("Found Duplicate Elements: "+ls);
				flag1= true;
			}
						
			

		}
		if (flag1==false)
		{
			System.out.println("The Array Does not have Duplicate Element");
		}

	}

}
