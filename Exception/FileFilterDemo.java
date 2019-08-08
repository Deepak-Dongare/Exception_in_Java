package Exception;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileFilterDemo {
  public FileFilterDemo() {
  } 

  public static void main(String[] args) {
    JFileChooser chooser = new JFileChooser();
    chooser.setCurrentDirectory(new File("."));

    chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
      public boolean accept(File f) {
        return f.getName().toLowerCase().endsWith(".")||f.isDirectory();
          //  f.isDirectory();
      }

      public String getDescription() {
        return "GIF Images";
      }
    });

    int r = chooser.showOpenDialog(new JFrame());
    if (r == JFileChooser.APPROVE_OPTION) {
      String name = chooser.getSelectedFile().getName();
      System.out.println(name);
    }
  }
}

