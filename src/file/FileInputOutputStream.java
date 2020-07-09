package file;

import java.io.*;

public class FileInputOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("e:/123.txt");
		
		try {
			FileInputStream fis = new FileInputStream(f1);
			
			System.out.println(fis.read());
			System.out.println((char)fis.read());
			
			byte b[] = new byte[fis.available()];
			fis.read(b);
			
			for(byte b1:b) {
				System.out.println((char)b1);
			}
			
			FileOutputStream fos = new FileOutputStream("e:/135.txt",true);
			
			fos.write(b);
			fos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
