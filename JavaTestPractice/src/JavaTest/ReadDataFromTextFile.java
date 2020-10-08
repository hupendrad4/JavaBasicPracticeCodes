package JavaTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {

		System.out.println(
				"********************** Reading File by File reader and Buffered Reader class **************************");

		FileReader fr = new FileReader("D:\\HupenWorkspace\\Testing.txt");
		BufferedReader br = new BufferedReader(fr);
		String readString = " ";
		while ((readString = br.readLine()) != null) {
			System.out.println(readString);
		}
		br.close();

		System.out.println("********************** Reading File by Scanner and file class **************************");

		File fl = new File("D:\\HupenWorkspace\\Testing.txt");

		Scanner sc = new Scanner(fl);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}
}
