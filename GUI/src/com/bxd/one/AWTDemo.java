package com.bxd.one;

import java.awt.*;
public class AWTDemo {

	public static void main(String[] args) {
		Frame f = new Frame("my awt");
		f.setSize(500, 400);//���ڵĳ���
		f.setLocation(300, 100);//���ڵĵ���λ��
		f.setVisible(true);//���ڿɼ�
		f.setLayout(new FlowLayout());//��ʽ����
		Button b = new Button("���ǰ�ť");
		f.add(b);
	}

}
