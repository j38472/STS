package com.zgcxueyuan.register;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 注销界面
 * 
 * @author Administrator 数据源：clientInformation.txt
 */
public class LogoutInterface implements IInterfaceAcceptor {

	@Override
	public void Interface() throws IOException {
		System.out.println("根据名字注销请输入1，返回登录界面请输入0");
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
		System.out.println("请输入你想要注销账户的名字");
		Scanner sca = new Scanner(System.in);
		String name = sca.next();
		StringBuilder sb[] = new StringBuilder[lineNumber()];
		
		BufferedReader br = new BufferedReader(new FileReader("clientInformation.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("clientInformation.txt"));
		// 将数据存储到数组中
		for (int i = 0; i < sb.length; i++) {
			sb[i].append(br.readLine());
		}
		for (int i = 0; i < sb.length; i++) {
			for (int j = 0; j < sb[i].length(); j++) {
				if (sb[i].charAt(j) == ',') {// 首先找到第一个逗号前的 name
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
		//刷新数据缓冲区
		bw.flush();
		// 关闭资源
		bw.close();
		br.close();
		sb.clone();
		sca.close();
	}

	/**
	 * 数据源的行数查询方法
	 * 
	 * @return 行数
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
