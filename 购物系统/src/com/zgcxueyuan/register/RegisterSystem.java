package com.zgcxueyuan.register;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * �ж������Ƿ� ��ȷ �������
 * 
 * @author Administrator
 */
public class RegisterSystem {
	/**
	 *  ��¼���� ǰ�������˺� ���뷽��
	 */
	public void Import() {
		Scanner sca = new Scanner(System.in);
		System.out.println("�������˺ţ�");
		String name = sca.next();
		System.out.println("����������");
		String password = sca.next();
		sca.close();
		Judge(name, password);
	}
	/**
	 * �ж��˺������Ƿ���ȷ 
	 * @param mName  �˻�
	 * @param mPassword ����
	 */
	private void Judge(String name, String password) {
		FileReader fr = null;//��ȡĿ��
		BufferedReader br = null;//������
		try {
			fr = new FileReader("NamePassword.txt");
			br = new BufferedReader(fr);
			String  myName = br.readLine();
			String  myPassword = br.readLine();
			if (myName.equals(name)&&myPassword.equals(password)) { //�����ȷ������¼����
				RegisterSystemInterface ri = new RegisterSystemInterface();
				ri.Interface();
			}else {//�������ȷ��ʾ��������˻�����ȷ��������һ��
				System.out.println("��������˻��������벻��ȷ��Ĭ�Ϸ�����һ��");
				MainInterface mi = new MainInterface();
				mi.Interface();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(fr!=null)
					//��ʵ�رջ����� ���ǹرջ������е�������
					fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(br!=null)
					//��ʵ�رջ����� ���ǹرջ������е�������
					br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
}
