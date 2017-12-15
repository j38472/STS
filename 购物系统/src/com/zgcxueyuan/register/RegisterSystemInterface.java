package com.zgcxueyuan.register;

import java.io.IOException;
import java.util.Scanner;
/**
 * 登录界面
 * @author Administrator
 *
 */
public class RegisterSystemInterface implements IInterfaceAcceptor {

	public void Interface() throws IOException {
		System.out.println("欢迎使用ZOL购物管理系统\r\n\n\n" + "*******************************************\r\n\n\n\n"
				+ "	1.客户信息管理\r\n\n\n" + "	2.购物结算\r\n\n\n" + "	3.真情回馈\r\n\n\n" + " 	4.注销\r\n\n\n\n"
				+ "********************************************");
		Acceptor();
	}

	/**
	 * 接受器 接受四个界面的 的编号来进入相对应界面
	 * @throws IOException 
	 */
	@Override
	public void Acceptor() throws IOException {
		System.out.println("请输入想进入的界面编号（1|2|3|4）");
		Scanner sca = new Scanner(System.in);
		int i = sca.nextInt();
		if (!(i == 1 || i == 2 || i == 3 || i == 4)) {// 如果输入不正确再次调用本界面
			Interface();
		} else {// 如果正确盗用相对应的界面方法
			switch (i) {
			case 1://客户信息管理界面0.0
				CustomerManagementInterface cm1 = new CustomerManagementInterface();
				cm1.Interface();
				break;
			case 2://购物结算界面
				AccountsInterface ai2 = new AccountsInterface();
				ai2.Interface();
				break;
			case 3://真情回馈界面
				TrueFeedback tf3 = new TrueFeedback();
				tf3.Interface();
				break;
			case 4://注销界面
				LogoutInterface li4 = new LogoutInterface();
				li4.Interface();
				break;
			case 0://返回上一级
				MainInterface mi0 = new MainInterface();
				mi0.Interface();
				break;
			default:
				sca.close();
				break;
			}
		}
		
	
		
	}

	
	
}
