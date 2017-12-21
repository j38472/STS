package com.zgcxueyuan.bxd2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 发送端
 * 
 * @author Administrator
 *
 */
public class UdpSend {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 键盘录入
																					// 缓冲区
		String line = null;
		while ((line = br.readLine()) != null) {// 在键盘录入信息不为空时循环
			if ("886".equals(line))// 当录入的信息是886是停止
				break;
			byte buf[] = line.getBytes();// 缓冲区
			// 通讯链接
			DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.8.100"), 10001);
			ds.send(dp);// 发送包
		}
		ds.close();
		br.close();
	}

}
