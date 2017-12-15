package com.zgcxueyuan.free;

import java.text.ParseException;

public class MainDemo {
	public static void main(String[] args) {
		DateUtil du ;
		try {
			du = new DateUtil("2019-02-10");
			System.out.println(du.getDay());
			du.addDay(20);
			System.out.println(du.getDay());
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
