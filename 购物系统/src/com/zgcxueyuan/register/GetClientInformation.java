package com.zgcxueyuan.register;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 获取clientInformation客户信息表的类
 * 暂时是没用的
 * @author Administrator
 *
 */
public class GetClientInformation {
	/**
	 * 根据客户名称查询 生日 ，（逗号分割）与 积分
	 * @throws IOException 
	 */
	public String getBirthdayIntegral(String name) throws IOException {
		Scanner sca = new Scanner(System.in);
		
		FileReader fr = new FileReader("clientInformation.txt");
		BufferedReader bf = new BufferedReader(fr);
		String lines [] = new String [lineNumber()];
		for (int i = 0; i < lines.length; i++) {
			lines[i]=bf.readLine();
		}
		
		fr.close();
		return name;
	}
	/**
	 * 根据客户生日查询 名称 ，（逗号分割）与 积分
	 */
	public String getNameIntegral(String Birthday) {
		return null;
	}
	/**
	 * 根据客户积分查询 名称 ，（逗号分割）与 生日
	 */
	public String getNameBirthday(String Integral) {
		return null;
	}
	/**
	 * 计算客户信息的行数 
	 * @return 行数 
	 * @throws IOException 
	 */
	@SuppressWarnings("unused")
	private int lineNumber() throws IOException{
		FileReader fr = new FileReader("clientInformation.txt");
		BufferedReader bf = new BufferedReader(fr);
		int line = 0 ;
		while (bf.readLine()!=null) {
			line++;
		}
		fr.close();
		return line;
	}
}
