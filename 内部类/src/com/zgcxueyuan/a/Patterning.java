package com.zgcxueyuan.a;

/**
 * ͼ����
 * 
 * @author Administrator ͼ�������� ��������֮��ľ���
 */
public class Patterning {
	int i1;
	int i2;

	public int distance(int i, int y) {
		return Math.abs(i-y);
	}
	public static void main(String[] args) {
		Patterning p = new Patterning();
		
		System.out.println(p.distance(4, 6));
	}
}
