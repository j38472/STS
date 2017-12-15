package com.zgcxueyuan.register;

import java.util.Scanner;

/**
 * 客户管理界面
 * 
 * @author Administrator
 *
 */
public class CustomerManagementInterface implements IInterfaceAcceptor {

	@Override
	public void Interface() {
		System.out.println("购物管理系统->客户管理界面" + "**************************************\r\n\n\n" + "	1.显示客户所有信息\r\n\n"
				+ "	2.添加客户信息\r\n\n" + "	3.修改客户信息\r\n\n" + "	4.查询客户信息\r\n\n\n"
				+ "**********************************************");
	}

	@Override
	public void Acceptor() throws Exception {
		System.out.println("请输入想进入的界面编号（1|2|3|4）或者输入0返回上一级界面");
		Scanner sca = new Scanner(System.in);
		int i = sca.nextInt();
		if (!(i == 1 || i == 2 || i == 3 || i == 4||i==0)) {// 如果输入不正确再次调用本界面
			Interface();
		} else {// 如果正确盗用相对应的界面方法
			switch (i) {
			case 1://显示客户所有信息界面ok
				DemandInterface di = new DemandInterface();
				di.Interface();
				break;
			case 2://添加客户信息界面ok
				AddInformationInterface aii = new AddInformationInterface();
				aii.Interface();
				break;
			case 3://修改客户信息界面(之实现了修改名字的方法)
				AlterInformationInteerface xAlii = new   AlterInformationInteerface();
				xAlii.Interface();
				break;
			case 4://查询客户信息界面(只实现了根据名字查询客户信息)
				InquireInformationInteerface cIii = new InquireInformationInteerface();
				cIii.Interface();
				break;
			case 0://返回上一级界面
				RegisterSystemInterface rsi = new RegisterSystemInterface();
				rsi.Interface();
				break;
			default:
				sca.close();
				break;
			}
		}
		
	}

}
