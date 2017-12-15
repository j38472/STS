package com.zgcxueyuan.register;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * ע������
 * 
 * @author Administrator ����Դ��clientInformation.txt
 */
public class LogoutInterface implements IInterfaceAcceptor {

	@Override
	public void Interface() throws IOException {
		System.out.println("��������ע��������1�����ص�¼����������0");
		Scanner sca = new Scanner(System.in);
		int key = sca.nextInt();
		switch (key) {
		case 1:
			Acceptor();
			break;
		case 0:
			RegisterSystemInterface rsi = new RegisterSystemInterface();
			rsi.Interface();
			break;
		default:
			sca.close();
			break;
		}
	}

	@Override
	public void Acceptor() throws IOException {
		System.out.println("����������Ҫע���˻�������");
		Scanner sca = new Scanner(System.in);
		String name = sca.next();
		StringBuilder sb[] = new StringBuilder[lineNumber()];
		
		BufferedReader br = new BufferedReader(new FileReader("clientInformation.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("clientInformation.txt"));
		// �����ݴ洢��������
		for (int i = 0; i < sb.length; i++) {
			sb[i].append(br.readLine());
		}
		for (int i = 0; i < sb.length; i++) {
			for (int j = 0; j < sb[i].length(); j++) {
				if (sb[i].charAt(j) == ',') {// �����ҵ���һ������ǰ�� name
					if (sb[i].substring(0, j).equals(name)) {
						sb[i].delete(0, sb[i].length());
					}
				}
			}
		}
		for (int i = 0; i < sb.length; i++) {
			bw.write(sb[i].toString());
			bw.newLine();
		}
		//ˢ�����ݻ�����
		bw.flush();
		// �ر���Դ
		bw.close();
		br.close();
		sb.clone();
		sca.close();
	}

	/**
	 * ����Դ��������ѯ����
	 * 
	 * @return ����
	 * @throws IOException
	 */
	private int lineNumber() throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("clientInformation.txt"));
		int line = 0;
		while (bf.readLine() != null) {
			line++;
		}
		bf.close();
		return line;
	}

}
