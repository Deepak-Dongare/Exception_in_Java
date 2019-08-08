package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class CW61 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			
			JFileChooser j = new JFileChooser(); 
			
		FileReader file = new FileReader("D:\\java 6pm\\HefShine\\test\\a.txt"); 
		BufferedReader fileInput = new BufferedReader(file); 
		try {
			System.out.println(fileInput.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}catch(FileNotFoundException f) {
			
			System.out.println("FileNotFoundExceptio ");
		}
		
	}

}
