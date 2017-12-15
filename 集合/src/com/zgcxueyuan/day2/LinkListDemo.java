package com.zgcxueyuan.day2;

import java.util.*;


/**
 * ģ���ջ �� ģ�� ����
 * @author Administrator
 *
 */
public class LinkListDemo {
	public static void main(String[] args) {
		Queue ll = new Queue();
		ll.myAdd("1");
		ll.myAdd("2");
		ll.myAdd("3");
		prin(ll.myget());
	}
	private static void prin(Object obj) {
		System.out.println(obj);
	}
}
class Queue{
	private LinkedList link;
	Queue(){
		link = new LinkedList();
	}
	public void myAdd(Object obj){
		link.addLast(obj);
	}
	public Object myget(){
		return link.removeLast();
	}
	public boolean isNull(){
		return link.isEmpty();
	}
	
}