package com.udp.bxd;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 需求：通过udp传输方式，将一段文字数据发送出去 思路： 1.建立udpsccket服务 2.提供数据，并将数据封装到数据包中
 * 3.通过socket服务的发送功能，将数据包发出去。 4.关闭资源
 * 
 * 发出端
 */
public class UdpSend {
	public static void main(String[] args) throws Exception {
		demo();
	}

	public static void demo() throws Exception {
		DatagramSocket ds = new DatagramSocket();
		byte[] buf = "ni才".getBytes();
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.8.100"),1000);
		ds.send(dp);
		ds.close();
	}
}
