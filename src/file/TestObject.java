package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("e:/person.txt");
			
			oos = new ObjectOutputStream(fos);
			
			
			Person p1 = new Person("wang",18,"n");
			Person p2 = new Person("li", 34, "n");
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			
			oos.flush();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
