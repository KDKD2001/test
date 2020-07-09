package file;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			
			try {
				fis = new FileInputStream("e:/person.txt");
				
				ois = new ObjectInputStream(fis);
				
				Object o1 = null;
				
				while((o1=ois.readObject())!=null){
					Person p = (Person)o1;
					System.out.println(p.toString());
				}
				
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(EOFException e) {
				System.out.println("读取成功");
			}catch(IOException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if(fis != null) {
						fis.close();
					}
					if(ois != null) {
						ois.close();
					}
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}


}
