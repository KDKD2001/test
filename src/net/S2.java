package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class S2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket ss = null;
		Socket socket = null;
		try {
			//1.启动服务器
			ss = new ServerSocket(8888);
			System.out.println("服务器已启动....");
			
			//2.等待客户端连接
			socket = ss.accept();//阻塞式方式，直到客户端连接进来，后续代码才能继续执行
			System.out.println("有新的客户端连接进来........" + socket.getInetAddress() + ":" + socket.getPort());
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));   //字符流  一行一行读取数据
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream())); //字符流  一行一行输出数据
			while(true)
			{
				//5.接收客户端发送的消息
				String message = reader.readLine();
				System.out.println("客户端说：" + message);
				
				//判断客户端是否下线
				if("exit".equals(message))
				{
					System.out.println("----------【公告：客户端已下线】-----------------");
				}
				
				//6.给客户端发送消息
				Scanner scanner = new Scanner(System.in);
				System.out.println("服务端，请输入：");
				String sendMessage = scanner.nextLine();
				
				writer.println(sendMessage);
				writer.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			//8.关闭资源、释放资源
			try {
				if(socket != null)
				{
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(ss != null)
				{
					ss.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
