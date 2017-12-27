package com.bxd;

import java.io.UnsupportedEncodingException;

/**
 * 联通的编码问题： 在桌面上新建一个文本文件上面保存“联通”，在进行一次保存（编码）以及打开（解码）后乱码问题
 * 
 * @author Administrator
 *
 */
public class EncodeDemo2 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s1 = "联通";
		byte[] b1 = s1.getBytes("gbk");
		for (byte b : b1) {
			System.out.println(Integer.toBinaryString(b & 255));
			//因为在gbk编码标中“联通”对应的编码表UTF-8也能过识别
		}
		// System.out.println(Arrays.toString(b1));
	}
}
