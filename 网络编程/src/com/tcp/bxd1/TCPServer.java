package com.tcp.bxd1;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 *
 * @author Administrator
 *
 */
public class TCPServer {

	public static void main(String[] args) throws Exception {
//		 1.建立服务端的socket服务。ServerSocket（）；并监听一个端口
		ServerSocket ss = new ServerSocket(10010);
//		 2.获取链接过来的客户端对象通过ServerSokcet的accept方法。没有链接就会等，所以该方法是阻塞式的
		Socket s = ss.accept();
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"##########");
//		获取该对象的读取流来读取发送过来的数据
		InputStream is = s.getInputStream();
		byte [] buf = new byte[1024];
		int len = is.read(buf);
		System.out.println(new String(buf,0,len));
		//关闭客户端
		s.close();
	}

}
