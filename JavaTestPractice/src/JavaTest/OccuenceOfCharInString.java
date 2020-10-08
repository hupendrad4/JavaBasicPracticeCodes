package JavaTest;

public class OccuenceOfCharInString {

	public static void main(String[] args) {

		String str = "Testt Jamming For Text Is NotTesting";
		int TotalCount = str.length();

		int TotalCountAfterRemove = str.replace("t", "").length();
		
		int count = TotalCount - TotalCountAfterRemove;

		System.out.println( "Occurent of Count of char t is :"+count);

	}

}
