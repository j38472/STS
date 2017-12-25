package com.tcp.bxd2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
/**
 * 演示tcp的传输的客户端的服务端的互访
 * @param args 客户端
 * 需求：
 *	客户端给服务端发送数据，服务端收到后，给客户端反馈数据；
 *
 */
	public static void main(String[] args) throws Exception{
		//建立socket服务。指定要链接主机和端口。
		Socket s = new Socket("192.168.8.100",10010);
		//获取socket流中的输出流。数据写到该流中。通过网络发给服务端
		OutputStream out = s.getOutputStream();
		out.write("abcd".getBytes());
		//获取socket流中的输入流，将服务端反馈的数据获取到，并打印。
		InputStream in = s.getInputStream();
		byte [] buf = new byte [1024];
		int len = in.read(buf);
		System.out.println(new String(buf,0,len));
		//关闭资源
		s.close();
	}

}
