package com.tcp.bxd3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 * @author Administrator
 *需求
 *	建立一个文本转换服务器。
 *客户端给服务端发文本，服务端将文本转换成大写的在返回客户端
 *而且客户端可以不断进行文本转换，当客户端输入over时转换结束
 */
public class Server {
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(10020);
		Socket s = ss.accept();
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+".....ocnnected");
		//读取socket读取流中的数据
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
//		BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		String line = null;
		while ((line=bufIn.readLine())!=null) {
			System.out.println(line);
//			bufOut.write(line.toUpperCase());
//			bufOut.newLine();
//			bufOut.flush();
			out.flush();
			out.println(line.toUpperCase());
		}
		s.close();
		ss.close();
		
	}
}
