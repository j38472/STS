package com.zgcxueyuan.register;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 判断密码是否 正确 进入界面
 * 
 * @author Administrator
 */
public class RegisterSystem {
	/**
	 *  登录界面 前置输入账号 密码方法
	 */
	public void Import() {
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入账号：");
		String name = sca.next();
		System.out.println("请输入密码");
		String password = sca.next();
		sca.close();
		Judge(name, password);
	}
	/**
	 * 判断账号密码是否正确 
	 * @param mName  账户
	 * @param mPassword 密码
	 */
	private void Judge(String name, String password) {
		FileReader fr = null;//读取目标
		BufferedReader br = null;//缓冲流
		try {
			fr = new FileReader("NamePassword.txt");
			br = new BufferedReader(fr);
			String  myName = br.readLine();
			String  myPassword = br.readLine();
			if (myName.equals(name)&&myPassword.equals(password)) { //如果正确则进入登录界面
				RegisterSystemInterface ri = new RegisterSystemInterface();
				ri.Interface();
			}else {//如果不正确提示密码或者账户不正确并返回上一级
				System.out.println("您输入的账户或者密码不正确！默认返回上一级");
				MainInterface mi = new MainInterface();
				mi.Interface();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(fr!=null)
					//其实关闭缓存区 就是关闭缓冲区中的流对象
					fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(br!=null)
					//其实关闭缓存区 就是关闭缓冲区中的流对象
					br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
}
