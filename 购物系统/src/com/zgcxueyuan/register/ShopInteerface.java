package com.zgcxueyuan.register;

import java.util.Scanner;

public class ShopInteerface implements IInterfaceAcceptor {

	/**
	 * 购物页面
	 * 
	 * @param args
	 */ 
	public static void main(String[] args) {}

	@Override
	public void Interface() {
		System.out.println(
				"购物管理系统->购物界面" + "***************************************\r\n\n\n" + "	1.运功鞋\r\n\n" + "	2.衣服\r\n\n"
						+ "	3.裤子\r\n\n" + "	4.帽子\r\n\n" + "	5.外套\r\n\n\n" + "**************************************");
		Acceptor();
	}

	@Override
	public void Acceptor() {
		System.out.println("请输入相应的编号来购买对应的商品（输入0 返回上一界面,回车进入结算界面）");
		Scanner sca = new Scanner(System.in);
		
		
	}

}