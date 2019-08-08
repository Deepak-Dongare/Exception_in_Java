package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Error {
		
			


	public static void main(String[] args) throws IOException { 
		FileReader file = new FileReader("C:\\test\\a.txt"); 
		
		BufferedReader fileInput = new BufferedReader(file); 
		
		
		// Print first 3 lines of file "C:\test\a.txt" 
	//	for (int i = 0; i < 3; i++) 
			
			System.out.println(fileInput.readLine()); 
		
		fileInput.close(); 
	}
} 

