package com.zgcxueyuan.interfack;

public class C implements IC {

	public static void main(String[] args) {
		C c = new C();
		c.a();
		c.c();
		
	}
	@Override
	public void a() {
		System.out.println("����ǽӿ�A�ķ���ʵ��");
	}

	@Override
	public void c() {
		System.out.println("����ǽӿ�C�ķ���ʵ��");
	}
}
