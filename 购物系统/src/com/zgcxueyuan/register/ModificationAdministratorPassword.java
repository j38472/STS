package com.zgcxueyuan.register;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 更改管理员密码界面
 * @author Administrator
 *
 */
public class ModificationAdministratorPassword implements IInterfaceAcceptor {

	@Override
	public void Interface() {
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入你想要将账户名更改为：");
		String aS = sca.next();
		System.out.println("请输入你想要将密码更改为：");
		String pW = sca.next();
		FileWriter fw = null;//读取目标
		BufferedWriter bf =null;//写入缓冲流
		try {
			fw = new FileWriter("NamePassword.txt");
			bf = new BufferedWriter(fw);
			bf.write(aS);
			bf.newLine();
			bf.write(pW);
			bf.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(bf!=null)
					//其实关闭缓存区 就是关闭缓冲区中的流对象
					bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(fw!=null)
					//其实关闭缓存区 就是关闭缓冲区中的流对象
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sca.close();
		}
		Acceptor();
	}

	@Override
	public void Acceptor() {
		System.out.println("更改成功。输入0返回上一级。(输入其他数值默认停止该程序)");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch (i) {
		case 0:
			MainInterface mf = new MainInterface();
			mf.Interface();
			break;
		default:
			sc.close();
			break;
		}
		
	}

}
