package com.zgcxueyuan.register;

import java.util.Scanner;

/**
 * ������
 * 
 * @author Administrator
 *
 */
public class MainInterface implements IInterfaceAcceptor {

	@Override
	public void Interface() {
		System.out.println("��ӭʹ��ZOL�������ϵͳ1.0��\r\n\n\n" + "*******************************************\r\n\n\n\n"
				+ "	1.��¼����\r\n\n\n" + "	2.���Ĺ���Ա����\r\n\n\n" + "	3.�˳���ʽ\r\n\n\n"
				+ "********************************************");
		Acceptor();
	}

	/**
	 * ������ �����ĸ������ �ı�����������Ӧ����
	 */
	@Override
	public void Acceptor() {

		System.out.println("�����������Ľ����ţ�1|2|3��");
		Scanner sca = new Scanner(System.in);
		int i = sca.nextInt();
		if (!(i == 1 || i == 2 || i == 3)) {// ������벻��ȷ�ٴε��ñ�����
			Interface();
		} else {// �����ȷ�������Ӧ�Ľ��淽��
			switch (i) {
			case 1:// ��¼����
				RegisterSystem rs = new RegisterSystem();
				rs.Import();
				break;
			case 2:// 	���Ĺ���Ա����
				ModificationAdministratorPassword map = new ModificationAdministratorPassword();
				map.Interface();
				break;
			case 3:// �˳� 
				break;
			default:
				sca.close();
				break;
			}
		}

	}

}
