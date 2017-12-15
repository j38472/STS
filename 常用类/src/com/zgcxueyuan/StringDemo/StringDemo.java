package com.zgcxueyuan.StringDemo;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
//		s1与s2的区别？
//		s1有一个对象  	“abc”是一个对象
//		s2有两个对象   	 new 是一个对象   “abc”是一个对象
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def");
//		sb.insert(2, "123");
		sb.delete(2, 3);
		System.out.println(sb+""+sb.length());
		StringBuilder sb1 = new StringBuilder("abcdef");
		String str=sb1.substring(3, 4);
		System.out.println("----------------------");
		System.out.println(str);
	}

}
