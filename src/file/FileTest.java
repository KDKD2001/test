package file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("e:/789.txt");
		
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f1.getName());
		System.out.println(f1.getPath());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
	}

}
