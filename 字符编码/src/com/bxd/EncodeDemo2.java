package com.bxd;

import java.io.UnsupportedEncodingException;

/**
 * ��ͨ�ı������⣺ ���������½�һ���ı��ļ����汣�桰��ͨ�����ڽ���һ�α��棨���룩�Լ��򿪣����룩����������
 * 
 * @author Administrator
 *
 */
public class EncodeDemo2 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s1 = "��ͨ";
		byte[] b1 = s1.getBytes("gbk");
		for (byte b : b1) {
			System.out.println(Integer.toBinaryString(b & 255));
			//��Ϊ��gbk������С���ͨ����Ӧ�ı����UTF-8Ҳ�ܹ�ʶ��
		}
		// System.out.println(Arrays.toString(b1));
	}
}
