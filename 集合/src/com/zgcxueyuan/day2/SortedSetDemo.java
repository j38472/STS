package com.zgcxueyuan.day2;
import java.util.*;
/**
 * set µÄ³õ´Î½Ó´¥
 * 
 * @author Administrator
 *
 */
public class SortedSetDemo {
	public static void main(String[] args) {
		TreeSet ts =  new TreeSet();
		ts.add("1");
		ts.add("3");
		ts.add("4");	
		ts.add("2");
		ts.add("222");
		ts.add("22");
		ts.add("11111");
		sop(ts);
		Iterator i= ts.iterator();
		
		ts.clear();
	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
