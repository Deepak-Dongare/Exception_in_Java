package Exception;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class m {
	
	public static void main(String[] args) {
		// Using this process to invoke the contructor, 
		// JFileChooser points to user's default directory 
	//	JFileChooser j = new JFileChooser(); 
		JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView()); 
		// Open the save dialog 
		j.showSaveDialog(null); 

	}

}
