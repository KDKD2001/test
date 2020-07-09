package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class C2 {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			//3.连接服务器
			socket = new Socket("127.0.0.1",8888);//localhost 127.0.0.1表示本机    也可以写具体的IP地址
		
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));           //字符流  一行一行输出数据
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //字符流  一行一行读取数据
			while(true)
			{
				//4.给服务器发送消息
				Scanner scanner = new Scanner(System.in);
				System.out.println("客户端，请输入：");
				String sendMessage = scanner.nextLine();
				
				writer.println(sendMessage);
				writer.flush();
				
				//判断如果客户端输入"exit"，表客户端准备退出
				if("exit".equals(sendMessage))
				{
					break;
				}
				
				//7.接收服务器消息
				String message = reader.readLine();
				System.out.println("服务端说：" + message);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//8.关闭资源、释放资源
			try {
				if(socket != null)
				{
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
