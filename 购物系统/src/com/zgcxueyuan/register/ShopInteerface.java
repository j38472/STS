package com.zgcxueyuan.register;

import java.util.Scanner;

public class ShopInteerface implements IInterfaceAcceptor {

	/**
	 * ����ҳ��
	 * 
	 * @param args
	 */ 
	public static void main(String[] args) {}

	@Override
	public void Interface() {
		System.out.println(
				"�������ϵͳ->�������" + "***************************************\r\n\n\n" + "	1.�˹�Ь\r\n\n" + "	2.�·�\r\n\n"
						+ "	3.����\r\n\n" + "	4.ñ��\r\n\n" + "	5.����\r\n\n\n" + "**************************************");
		Acceptor();
	}

	@Override
	public void Acceptor() {
		System.out.println("��������Ӧ�ı���������Ӧ����Ʒ������0 ������һ����,�س����������棩");
		Scanner sca = new Scanner(System.in);
		
		
	}

}