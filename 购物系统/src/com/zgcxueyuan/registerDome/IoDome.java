package com.zgcxueyuan.registerDome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;

public class IoDome {
	private static String str = "123";
	public static void main(String[] args) throws Exception {
		
		BufferedReader bre = null;
		OutputStreamWriter pw = null;//定义一个流
		
			try {
				bre = new BufferedReader(new FileReader("E:/STS/购物系统/NamePassword.txt"));
				//此时获取到的bre就是整个文件的缓存流
				pw = new OutputStreamWriter(new FileOutputStream("E:/STS/购物系统/NamePassword.txt"),"GBK");
				//确认流的输出文件和编码格式，此过程创建了“test.txt”实例
			while ((str = bre.readLine())!= null) // 判断最后一行不存在，为空结束循环
				{
					if(str.indexOf("排除")<0){//判断是否需要舍弃
						pw.write("132");//将要写入文件的内容，可以多次write
						pw.write("132");
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		bre.close();//关闭流
		pw.close();//关闭流
	}
}
