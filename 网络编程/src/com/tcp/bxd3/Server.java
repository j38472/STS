package com.tcp.bxd3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �����
 * @author Administrator
 *����
 *	����һ���ı�ת����������
 *�ͻ��˸�����˷��ı�������˽��ı�ת���ɴ�д���ڷ��ؿͻ���
 *���ҿͻ��˿��Բ��Ͻ����ı�ת�������ͻ�������overʱת������
 */
public class Server {
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(10010);
		Socket s = ss.accept();
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+".....ocnnected");
		//��ȡsocket��ȡ���е�����
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		String line = null;
		while ((line=bufIn.readLine())!=null) {
			System.out.println(line);
			out.println(line.toUpperCase());
		}
		ss.close();
		s.close();
		
	}
}
