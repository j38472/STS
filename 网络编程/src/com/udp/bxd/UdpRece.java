package com.udp.bxd;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 接受端 需求 定义一个应用程序，用于udp接受并处理数据的 思路： 1.定义udp
 * socket服务,通常会监听一个端口。其实就是给这个接受网络应用程序定义数字标识， 方便于明确那些数据过来该应用程序可以处理。
 * 2.定义一个数据包，因为要存储接受到的字节数据，因为数据包对象中有更多的功能可以提取字节数据的不同数据信息。
 * 3.通过socket服务的receive方法将收到的数据存入异定义好的数据包中 4.通过数据包对象的特有功能。将这些不同的数据取出。打印在控制台上
 * 5.关闭数据
 * 
 * @author Administrator
 *
 */
public class UdpRece {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(1000);
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		ds.receive(dp);
		String ip = dp.getAddress().getHostAddress();
		String data = new String(dp.getData(), 0, dp.getLength());
		int port = dp.getPort();
		System.out.println(ip + "::" + data + "::" + port);
		ds.close();
	}

}
