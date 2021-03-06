package com.zgcxueyuan.register;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 查询客户信息界面
 * 只实现了根据名字查询客户信息
 * @author Administrator
 *数据源：clientInformation.txt
 */
public class InquireInformationInteerface implements IInterfaceAcceptor {

	@Override
	public void Interface() throws IOException {
		System.out.println("购物管理系统->客户管理界面->查询客户信息界面");
		Acceptor();
	}

	@Override
	public void Acceptor() throws IOException {
		System.out.println("想要根据名字查询请输入1，返回上一级请输入0");
		Scanner sca = new Scanner(System.in);
		int key = sca.nextInt();
		switch (key) {
		case 0:
			CustomerManagementInterface cmi = new CustomerManagementInterface();
			cmi.Interface();
			break;
		case 1:
			getBirthdayIntegral();
			break;
		default:
			break;
		}
		
		
		//关闭数据流
		sca.close();
	}
	private String getBirthdayIntegral() throws IOException {
		String message = null;//用于存储要返回的客户信息默认为空
		
		System.out.println("请输入要查询客户信息的名字");
		Scanner sca = new Scanner(System.in);
		String name = sca.next();
		
		BufferedReader br = new BufferedReader(new FileReader("clientInformation.txt"));//读取缓冲区
		StringBuilder sb [] = new StringBuilder[lineNumber()];//用于接受数据的数组缓冲区
		//将数据存储到数组中
		for (int i = 0; i < sb.length; i++) {
			sb[i].append(br.readLine());
		}
		for (int i = 0; i < sb.length; i++) {
			for (int j = 0; j < sb[i].length(); j++) {
				if (sb[i].charAt(j)==',') {//首先找到第一个逗号前的 name 
					if (sb[i].substring(0, j).equals(name)) {
						message= sb[i].toString();
					}
				}
			}
		}
		//关闭他们
		sb.clone();
		sca.close();
		br.close();
		
		return message;
		
	}
	
	
	private int lineNumber() throws IOException{
		BufferedReader bf = new BufferedReader(new FileReader("clientInformation.txt"));
		int line = 0 ;
		while (bf.readLine()!=null) {
			line++;
		}
		bf.close();
		return line;
	}

}
