package com.zgcxueyuan.interfack;

public class AB implements IA,IB{
	@Override
	public void a() {
		System.out.println("这是接口A的方法实现");
	}
	@Override
	public void b() {
		System.out.println("这是接口B的方法实现");
	}
}
