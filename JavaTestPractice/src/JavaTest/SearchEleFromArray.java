package JavaTest;

public class SearchEleFromArray {

	public static void main(String[] args) {

		int arr[] = { 10, 40, 30, 20, 50 };
        boolean flag=false;
		int searchEle = 40;
		for (int i = 0; i < arr.length - 1; i++) {
			if (searchEle == arr[i]) {
				System.out.println("The Element Found at Position " + arr[i] + " at " + i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			
		System.out.println("Element not found");
		}
	}
}
