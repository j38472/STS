package com.tcp.bxd1;

/**
 * 客户端
 * 通过查阅socket对象，发现在该对象建立时，就可以去链接指定主机
 * 通过tcp是面向链接的，所以在建立socket服务时，
 * 就要有服务端存在，并链接成功，形成通路后，在该通道进行数据的传输
 * @author Administrator
 */
import java.io.*;
import java.net.*;

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 创建Socket服务，并指定要链接的主机和端口
		Socket s = new Socket("192.168.8.100", 10010);
		// 为了发送数据，应该获取socket流中的输出流
		OutputStream os = s.getOutputStream();
		os.write("呵呵呵".getBytes());
		s.close();

	}
}
