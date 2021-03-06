package com.zgcxueyuan.day1;
import java.util.*;
/**
 * 这个是我的第一个集合类
 * @author Administrator
 *
 *add方法的参数类型是Object。以便于接收任意数据类型对象
 *集合中存储的都是对象的引用（地址值）
 *
 *什么是迭代器：
 *其实就是集合的取出元素的方法；
 */
public class CollectionDemo {
	public static void main(String[] args) {
		method_get();
	}
	/**
	 * 取出 iterator
	 */
	public static void method_get(){
		ArrayList al = new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		
		//获取迭代器，用于取出集合中的元素  
		//迭代用for 因为在获取迭代器的时候 这个迭代器是for的局部对象在for运行完之后就会自动释放该资源
		for (Iterator it = al.iterator(); it.hasNext(); ) {
			sop(it.next());
		}
		
		
	}
	/**
	 * 交集
	 */
	public static void base_method_2(){
		ArrayList al1 = new ArrayList();
		al1.add("java1_1");
		al1.add("java1_2");
		al1.add("java1_3");
		al1.add("java1_4");
		ArrayList al2 = new ArrayList();
		al2.add("java1_1");
		al2.add("java2_2");
		al2.add("java1_3");
		al2.add("java2_4");
		//去交集 ， al1中只会保留和al2中相同的元素
//		al1.retainAll(al2);
		//去非交集 ， al1中只会保留和al2中不相同的元素
		al1.removeAll(al2);
		sop(al1);
		sop(al2);
	}
	/**
	 * 增删改查
	 */
	public static void base_method(){

		//创建集合容器，使用Collection接口的子类。ArrayList
		ArrayList al = new ArrayList();
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		
		//获取个数
		sop(al.size());
		//删除元素
		al.remove("java02");
		//清空集合
//		al.clear();
		//判断元素
		sop(al.contains("java01"));
		//判断集合是否为空
		sop(al.isEmpty());
		//打印集合
		sop(al);
	
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
