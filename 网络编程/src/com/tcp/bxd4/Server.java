package com.tcp.bxd4;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 * @author Administrator
 *传输文件
 */
public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(10020);
		Socket s = ss.accept();
		String ip = s.getInetAddress().getHostAddress();
		System.out.println("ip::"+ip);
//		DataInputStream dis = new DataInputStream(s.getInputStream());
//		long over = dis.readLong();
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter out = new PrintWriter(new FileWriter("E:\\demo1.txt"),true);
	
		String line= null;
		while ((line = bufIn.readLine())!=null) {
//			if ("over".equals(line)) {
//				break;
//			}
			out.println(line);
			
		}
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		pw.println("成功");
		out.close();
		s.close();
		ss.close();
	}
}
