package com.zgcxueyuan.register;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 修改客户信息界面
 * 之实现了修改名字的方法
 * @author Administrator
 *
 */
public class AlterInformationInteerface implements IInterfaceAcceptor {

	@Override
	public void Interface() throws Exception {
		System.out.println("购物管理系统->客户管理界面->修改客户信息界面");
		Acceptor();
	}

	@Override
	public void Acceptor() throws IOException {
		System.out.println("请问想修改那一部分（1（客户名称）2（生日日期）3（积分）0（返回上一级））");
		Scanner sca = new Scanner(System.in);
		int key = sca.nextInt();
		switch (key) {
		case 1:
			setName();
			break;
		case 2:
			setBirthday();
			break;
		case 3:
			setIntegral();
			break;
		case 0:
			CustomerManagementInterface cmi = new CustomerManagementInterface();
			cmi.Interface();
			break;
		default:
			sca.close();
			break;
		}
	}

	/**
	 * 修改名字
	 * @throws IOException 
	 */
	private void setName() throws IOException {
		System.out.println("请依次输入客户生日与积分(生日与积分之间用逗号分割)及要改变的客户名称");
		Scanner sca = new Scanner(System.in);
		String birthdayIntegral = sca.next();
		String name = sca.next();
		
		BufferedReader bf = new BufferedReader(new FileReader("clientInformation.txt"));//读取缓冲区
		BufferedWriter bw = new BufferedWriter(new FileWriter("clientInformation.txt"));//输出缓冲区
		StringBuilder lines [] = new StringBuilder [lineNumber()];//用于存储读取出来的数据的数组缓冲区
		
		for (int i = 0; i < lines.length; i++) {//将读取到的数据存储到String数组缓冲区中
			lines[i].append(bf.readLine());
		}
		for (int i = 0; i < lines.length; i++) {
			for (int j = 0; j < lines[i].length(); j++) {
				if (lines[i].charAt(j)==',') { // 找到名字后边的逗号的索引
					//把上边的索引后的字符串（生日与积分）与数据源的生日与积分比较 
					if(lines[i].substring(j+1, lines[i].length()).equals(birthdayIntegral)){
						lines[i].delete(0, j);
						lines[i].append(name, j+1, name.length());
					}
				}
			}
		}
		for (int i = 0; i < lines.length; i++) {//写入动作
			bw.write(lines[i].toString());
			bw.newLine();
		}
		//刷新 写入数据缓冲区
		bw.flush();
		//关闭他们的资源
		bf.close();
		bw.close();
		sca.close();
	}
	/**
	 * 修改生日
	 */
	private void setBirthday() {

	}
	/**
	 * 修改积分
	 */
	private void setIntegral() {

	}
	/**
	 * 数据源的行数查询方法
	 * @return 行数
	 * @throws IOException
	 */
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
