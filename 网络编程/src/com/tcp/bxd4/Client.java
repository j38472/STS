package com.tcp.bxd4;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 客户端
 * 
 * @author Administrator
 *
 *         传输文件
 */
public class Client {
	public static void main(String[] args) throws IOException, Exception {
		Socket s = new Socket("192.168.8.100", 10020);
		BufferedReader bufr = new BufferedReader(new FileReader("E:\\demo.txt"));
		PrintWriter out = new PrintWriter(s.getOutputStream(), true);
		// DataOutputStream dos = new DataOutputStream(s.getOutputStream());
//		long time = System.currentTimeMillis();
		out.println("over");
		// dos.writeLong(time);
		String line = null;
		while ((line = bufr.readLine()) != null) {
			out.println(line);
		}
		out.println("over");
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = bufIn.readLine();
		System.out.println(str);
		bufr.close();
		s.close();
	}
}
