package com.zgcxueyuan.day2;

import java.util.*;

/**
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) {
		LinkDemo();
	}
	public static void LinkDemo(){
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.addFirst("1");
		ll.addFirst("2");
		ll.addFirst("3");
		ll.addFirst("4");
		ll.addFirst("0");
		ll.removeFirst();
		ll.removeFirst();
		prin(ll);
		ll.clear();
	}
	private static void prin(Object obj) {
		System.out.println(obj);
	}
}
