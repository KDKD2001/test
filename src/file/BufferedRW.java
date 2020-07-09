package file;
import java.io.*;
public class BufferedRW {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			java.io.FileReader fr = new java.io.FileReader("e:/123.txt");
			br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("e:/456.txt");
			bw = new BufferedWriter(fw);
			
//			System.out.println(br.read());
//			
//		
//			br.reset();
//			
			String str;
		
			while((str = br.readLine()) != null) {
				bw.write(str);
				bw.newLine();
			}
			
			bw.flush();
			
			bw.close();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("文件复制成功");
	}

}
