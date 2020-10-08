package JavaTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
	
		System.out.println("********* Approach 1-File Writer Class ****************");
		
		FileWriter fw =new FileWriter("D:\\HupenWorkspace\\Testing54.txt");
		BufferedWriter bw =new BufferedWriter(fw);
		
		bw.write("I am Hupendra Deore");
		bw.write("I love India");
		bw.write("I stayed at Pune");
		bw.write("I belonged to Dhule");
		bw.write("I am And Engineer");
		
		System.out.println("******Finish*******");
		bw.close();
		
		

	}
	


}
