package com.bxd.one;

import java.awt.*;
public class AWTDemo {

	public static void main(String[] args) {
		Frame f = new Frame("my awt");
		f.setSize(500, 400);//窗口的长宽
		f.setLocation(300, 100);//窗口的弹出位置
		f.setVisible(true);//窗口可见
		f.setLayout(new FlowLayout());//流式布局
		Button b = new Button("我是按钮");
		f.add(b);
	}

}
