package com.zgcxueyuan.register;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * ��ȡclientInformation�ͻ���Ϣ�����
 * ��ʱ��û�õ�
 * @author Administrator
 *
 */
public class GetClientInformation {
	/**
	 * ���ݿͻ����Ʋ�ѯ ���� �������ŷָ�� ����
	 * @throws IOException 
	 */
	public String getBirthdayIntegral(String name) throws IOException {
		Scanner sca = new Scanner(System.in);
		
		FileReader fr = new FileReader("clientInformation.txt");
		BufferedReader bf = new BufferedReader(fr);
		String lines [] = new String [lineNumber()];
		for (int i = 0; i < lines.length; i++) {
			lines[i]=bf.readLine();
		}
		
		fr.close();
		return name;
	}
	/**
	 * ���ݿͻ����ղ�ѯ ���� �������ŷָ�� ����
	 */
	public String getNameIntegral(String Birthday) {
		return null;
	}
	/**
	 * ���ݿͻ����ֲ�ѯ ���� �������ŷָ�� ����
	 */
	public String getNameBirthday(String Integral) {
		return null;
	}
	/**
	 * ����ͻ���Ϣ������ 
	 * @return ���� 
	 * @throws IOException 
	 */
	@SuppressWarnings("unused")
	private int lineNumber() throws IOException{
		FileReader fr = new FileReader("clientInformation.txt");
		BufferedReader bf = new BufferedReader(fr);
		int line = 0 ;
		while (bf.readLine()!=null) {
			line++;
		}
		fr.close();
		return line;
	}
}
