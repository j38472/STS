package com.zgcxueyuan.registerDome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;

public class IoDome {
	private static String str = "123";
	public static void main(String[] args) throws Exception {
		
		BufferedReader bre = null;
		OutputStreamWriter pw = null;//����һ����
		
			try {
				bre = new BufferedReader(new FileReader("E:/STS/����ϵͳ/NamePassword.txt"));
				//��ʱ��ȡ����bre���������ļ��Ļ�����
				pw = new OutputStreamWriter(new FileOutputStream("E:/STS/����ϵͳ/NamePassword.txt"),"GBK");
				//ȷ����������ļ��ͱ����ʽ���˹��̴����ˡ�test.txt��ʵ��
			while ((str = bre.readLine())!= null) // �ж����һ�в����ڣ�Ϊ�ս���ѭ��
				{
					if(str.indexOf("�ų�")<0){//�ж��Ƿ���Ҫ����
						pw.write("132");//��Ҫд���ļ������ݣ����Զ��write
						pw.write("132");
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		bre.close();//�ر���
		pw.close();//�ر���
	}
}
