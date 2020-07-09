package file;
import java.io.*;

public class FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			java.io.FileReader fr = new java.io.FileReader("e:/123.txt");
			
			System.out.println((char)fr.read());
			int c;
			while((c=fr.read())!=-1) {
				System.out.println((char) c);
			}
			
			FileWriter fw = new FileWriter("e:/456.txt");
			
			char[] c2 = new char[1024];
			while(fr.read(c2)!=-1) {
				fw.write(c2);
			}
			
			fw.flush();
			
			System.out.println("copy success");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
