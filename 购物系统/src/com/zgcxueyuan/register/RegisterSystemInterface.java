package com.zgcxueyuan.register;

import java.io.IOException;
import java.util.Scanner;
/**
 * ��¼����
 * @author Administrator
 *
 */
public class RegisterSystemInterface implements IInterfaceAcceptor {

	public void Interface() throws IOException {
		System.out.println("��ӭʹ��ZOL�������ϵͳ\r\n\n\n" + "*******************************************\r\n\n\n\n"
				+ "	1.�ͻ���Ϣ����\r\n\n\n" + "	2.�������\r\n\n\n" + "	3.�������\r\n\n\n" + " 	4.ע��\r\n\n\n\n"
				+ "********************************************");
		Acceptor();
	}

	/**
	 * ������ �����ĸ������ �ı�����������Ӧ����
	 * @throws IOException 
	 */
	@Override
	public void Acceptor() throws IOException {
		System.out.println("�����������Ľ����ţ�1|2|3|4��");
		Scanner sca = new Scanner(System.in);
		int i = sca.nextInt();
		if (!(i == 1 || i == 2 || i == 3 || i == 4)) {// ������벻��ȷ�ٴε��ñ�����
			Interface();
		} else {// �����ȷ�������Ӧ�Ľ��淽��
			switch (i) {
			case 1://�ͻ���Ϣ�������0.0
				CustomerManagementInterface cm1 = new CustomerManagementInterface();
				cm1.Interface();
				break;
			case 2://����������
				AccountsInterface ai2 = new AccountsInterface();
				ai2.Interface();
				break;
			case 3://�����������
				TrueFeedback tf3 = new TrueFeedback();
				tf3.Interface();
				break;
			case 4://ע������
				LogoutInterface li4 = new LogoutInterface();
				li4.Interface();
				break;
			case 0://������һ��
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
