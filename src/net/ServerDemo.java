package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerDemo {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("####server####");
		BufferedReader in = null;
		ServerSocket ss = null;
		
	try {
		ss = new ServerSocket(8888);
	
		Socket s =ss.accept();
		
		System.out.println("IP地址"+s.getInetAddress());
		System.out.println("端口号"+s.getPort());
		
		in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String clientStr = in.readLine();
		System.out.println("客户端发送的消息是"+clientStr);
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(ss != null) {
				try {
					ss.accept();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
    }
}
