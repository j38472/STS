package com.udp.bxd;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {
	public static void main(String[] args) throws UnknownHostException {
//		 InetAddress i = InetAddress.getLocalHost();
//		 System.out.println(i);
			InetAddress ia = InetAddress.getByName("www.jingdong.com");
			System.out.println(ia.getHostAddress());
		//www.csdn.net
	}
}
