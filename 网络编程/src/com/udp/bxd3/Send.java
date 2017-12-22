package com.udp.bxd3;

import java.io.*;
import java.net.*;

/**
 * ��
 * 
 * @author Administrator
 *
 */
public class Send implements Runnable {
	private DatagramSocket ds;

	public Send(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line=null;
			while ((line=br.readLine())!=null) {
				byte [] buf = line.getBytes();
				DatagramPacket dp = new DatagramPacket(buf, buf.length,InetAddress.getByName("192.168.8.100"),10001);
				ds.send(dp);
			}
		} catch (Exception e) {
			throw new RuntimeException("���Ͷ˷���ʧ�ܣ�");
		}
	}
}
