package com.udp.bxd2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * ���ܶ�
 * 
 * @author Administrator
 *
 */
public class UdpRece {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(10001);// �����˿�1000
		while (true) {// ��ν���
			byte[] buf = new byte[1024];// ���ܻ�����
			DatagramPacket dp = new DatagramPacket(buf, buf.length);// �������ݳ���
			ds.receive(dp);// �հ�
			String ip = dp.getAddress().getHostAddress();
			String data = new String(dp.getData(), 0, dp.getLength());
			int port = dp.getPort();
			System.out.println(ip + "::" + data + "::" + port);
		}
	}
}
