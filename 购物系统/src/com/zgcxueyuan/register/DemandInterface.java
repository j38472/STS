package com.zgcxueyuan.register;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * ȫ���ͻ���Ϣ����
 * @author Administrator
 *
 */
public class DemandInterface implements IInterfaceAcceptor {

	public static void main(String[] args) {}

	@Override
	public void Interface() {
		System.out.println("�������ϵͳ->�ͻ��������->ȫ���ͻ���Ϣ����\r\n\n\n"
				+ "��Ա��	����	����\r\n\n\n"
				+ "---------|--------------|--------------\r\n\n");
		
		FileReader fr = null;
		BufferedReader br = null;
		String line = null;
		String str []= new String [lineNumber()];
		int i = 0;
		try {
			fr = new FileReader("clientInformation.txt");
			br = new BufferedReader(fr);
			while ((line=br.readLine())!=null) {
				str[i] = line;
				i++;
			}
			
			for (int j = 0; j < str.length; j++) {
				System.out.println(str[j]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		
		
		
		Acceptor();
	}

	@Override
	public void Acceptor() {
		System.out.println("����0������һ����(����������ֵĬ��ֹͣ�ó���)");
		Scanner sca = new Scanner(System.in);
		int i = sca.nextInt();
		switch (i) {
		case 0:
			CustomerManagementInterface cmi =  new CustomerManagementInterface();
			cmi.Interface();
			break;
		default:
			sca.close();
			break;
		}
	}
	
	private int lineNumber(){
		int i = 0;
		FileReader fr = null;
		BufferedReader br = null;
		String line = null;
		try {
			fr = new FileReader("clientInformation.txt");
			br = new BufferedReader(fr);
			
			while ((line=br.readLine())!=null) {
				i++;
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
		return i;
	}
}
