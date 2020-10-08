package JavaTest;

public class CountWordsInString {

	public static void main(String[] args) {
		
		
		String str="What2655You797AreDo64ing";
		
		int StrLen=str.length();		
		
		int newStringCount=str.replace("a-zA-Z", "").length();
		
		int count=StrLen-newStringCount;
		System.out.println(count);
	}

}
