package com.udp.bxd3;

import java.net.DatagramSocket;
/**
 * �������
 * 	�н������ݵĲ����з����ݲ���
 * 	����������ͬʱ����
 * 	�Ǿ���Ҫ�õ����̼߳���
 * 	һ�����𷢣�һ��������
 * @author Administrator
 *	��Ϊ�պͷ��Ķ����ǲ�һ�µ� ����Ҫ��������run����
 *	��������������Ҫ��װ����ͬ������
 */



public class ChatDemo {

	public static void main(String[] args) throws Exception{
		DatagramSocket dsSend = new DatagramSocket();
		DatagramSocket dsRece = new DatagramSocket(10001);
		
		new Thread(new Send(dsSend)).start();
		new Thread(new Rece(dsRece)).start();
	}

}
