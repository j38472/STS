package com.zgcxueyuan.register;

import java.util.Scanner;

/**
 * 主界面
 * 
 * @author Administrator
 *
 */
public class MainInterface implements IInterfaceAcceptor {

	@Override
	public void Interface() {
		System.out.println("欢迎使用ZOL购物管理系统1.0版\r\n\n\n" + "*******************************************\r\n\n\n\n"
				+ "	1.登录界面\r\n\n\n" + "	2.更改管理员密码\r\n\n\n" + "	3.退出方式\r\n\n\n"
				+ "********************************************");
		Acceptor();
	}

	/**
	 * 接受器 接受四个界面的 的编号来进入相对应界面
	 */
	@Override
	public void Acceptor() {

		System.out.println("请输入想进入的界面编号（1|2|3）");
		Scanner sca = new Scanner(System.in);
		int i = sca.nextInt();
		if (!(i == 1 || i == 2 || i == 3)) {// 如果输入不正确再次调用本界面
			Interface();
		} else {// 如果正确盗用相对应的界面方法
			switch (i) {
			case 1:// 登录界面
				RegisterSystem rs = new RegisterSystem();
				rs.Import();
				break;
			case 2:// 	更改管理员密码
				ModificationAdministratorPassword map = new ModificationAdministratorPassword();
				map.Interface();
				break;
			case 3:// 退出 
				break;
			default:
				sca.close();
				break;
			}
		}

	}

}
