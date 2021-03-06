package com.zgcxueyuan.register;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 结算界面
 * 
 * @author Administrator 数据源：accountsInterface
 */
public class AccountsInterface implements IInterfaceAcceptor {

	@Override
	public void Interface() throws IOException {
		System.out.println("***************购物清单******************\r\n\n\n" + "	物品	单价	个数	金额\r\n\n" + "	1：商品一\r\n\n"
				+ "	2：折扣\r\n\n" + "	3：金额总计\r\n\n" + "	4：实际交费\r\n\n" + "	5：找零\r\n\n" + "	6：本次购买获得积分\r\n\n\n"
				+ "*****************************************");
		BufferedReader br = new BufferedReader(new FileReader("accountsInterface.txt"));// 读取缓冲区
		StringBuilder sb[] = new StringBuilder[lineNumber()];

		for (int i = 0; i < sb.length; i++) {
			sb[i].append(br.readLine());
		}
		for (int i = 0; i < sb.length; i++) {
			System.out.println(sb[i].toString() + "\r\n\n" + "*****************************************");
		}

		// 关闭数据源
		sb.clone();
		br.close();

		Acceptor();
	}

	@Override
	public void Acceptor() throws IOException {
		System.out.println("关闭该程序输入1 返回上一级输入0");
		Scanner sca = new Scanner(System.in);
		int key = sca.nextInt();
		switch (key) {
		case 0:
			RegisterSystemInterface rsi = new RegisterSystemInterface();
			rsi.Interface();
			break;
		case 1:
			break;
		default:
			sca.close();
			break;
		}
	}

	/**
	 * 数据源的行数查询方法
	 * 
	 * @return 行数
	 * @throws IOException
	 */
	private int lineNumber() throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("accountsInterface.txt"));
		int line = 0;
		while (bf.readLine() != null) {
			line++;
		}
		bf.close();
		return line;
	}

}
