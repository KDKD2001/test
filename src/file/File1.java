package file;

import java.io.*;

public class File1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		File fis = new File("E:/123.txt");
		InputStream is = new FileInputStream(fis);
		InputStreamReader str = new InputStreamReader(is,"UTF-8");
		BufferedReader br = new BufferedReader(str);
		String st=null;
		while ((st=br.readLine())!=null) {
			String s=st;
			System.out.println(s);
		}br.close();

	}

}
