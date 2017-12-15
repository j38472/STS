package com.zgcxueyuan.interfack;

public class C implements IC {

	public static void main(String[] args) {
		C c = new C();
		c.a();
		c.c();
		
	}
	@Override
	public void a() {
		System.out.println("这个是接口A的方法实现");
	}

	@Override
	public void c() {
		System.out.println("这个是接口C的方法实现");
	}
}
