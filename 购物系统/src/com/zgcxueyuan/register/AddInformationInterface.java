package com.zgcxueyuan.register;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 添加客户信息界面
 * @author Administrator
 *
 */
public class AddInformationInterface implements IInterfaceAcceptor {

	@Override
	public void Interface() {
		System.out.println("购物管理系统->客户管理界面->添加客户信息界面");
		Acceptor();
	}

	@Override
	public void Acceptor() {
		Scanner sca = new Scanner(System.in);
		System.out.println("请分别输入需要添加的客户的会员号 生日 积分");
		String strsName = sca.next();
		String strsBirthday = sca.next();
		String strsIntegral = sca.next();
		String strs = strsName+","+strsBirthday+","+strsIntegral;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("clientInformation.txt",true);
			bw= new BufferedWriter(fw);
			bw.newLine();
			bw.write(strs);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fw!=null)
					//其实关闭缓存区 就是关闭缓冲区中的流对象
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		sca.close();
	}

}
