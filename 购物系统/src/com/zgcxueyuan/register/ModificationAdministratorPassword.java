package com.zgcxueyuan.register;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * ���Ĺ���Ա�������
 * @author Administrator
 *
 */
public class ModificationAdministratorPassword implements IInterfaceAcceptor {

	@Override
	public void Interface() {
		Scanner sca = new Scanner(System.in);
		System.out.println("����������Ҫ���˻�������Ϊ��");
		String aS = sca.next();
		System.out.println("����������Ҫ���������Ϊ��");
		String pW = sca.next();
		FileWriter fw = null;//��ȡĿ��
		BufferedWriter bf =null;//д�뻺����
		try {
			fw = new FileWriter("NamePassword.txt");
			bf = new BufferedWriter(fw);
			bf.write(aS);
			bf.newLine();
			bf.write(pW);
			bf.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(bf!=null)
					//��ʵ�رջ����� ���ǹرջ������е�������
					bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(fw!=null)
					//��ʵ�رջ����� ���ǹرջ������е�������
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sca.close();
		}
		Acceptor();
	}

	@Override
	public void Acceptor() {
		System.out.println("���ĳɹ�������0������һ����(����������ֵĬ��ֹͣ�ó���)");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch (i) {
		case 0:
			MainInterface mf = new MainInterface();
			mf.Interface();
			break;
		default:
			sc.close();
			break;
		}
		
	}

}
