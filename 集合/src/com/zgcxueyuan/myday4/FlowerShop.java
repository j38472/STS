package com.zgcxueyuan.myday4;
import java.util.*;
/**
 * 花店类
 * @author Administrator
 *
 */
public class FlowerShop {
	public static void main(String[] args) {
//		purchase();
		getFlowers();
	}
//	public static void purchase() {
//		Map<Integer, Flower> flow = new HashMap<>();
//		flow.put(001, new Flower("玫瑰", "10"));
//		flow.put(002, new Flower("玫瑰2", "20"));
//		Set<Integer> is =	flow.keySet();
//		for (Integer i : is) {
//			System.out.println(flow.get(i).name);
//		}
//		System.out.println();
//	}
	private static void getFlowers() {
		String [] names = {"玫瑰","月季","风信子", "紫罗兰", "梅花","茉莉花", "栀子花", "桃花", "曼陀罗", "杜鹃花", "迷迭香", "紫罗兰"};
		Map<Integer, Flower> flow = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			flow.put(i, new Flower(names[i],"支" ));
			flow.get(i).id=i;
			flow.get(i).price=i+10;
			flow.get(i).amount=i+1000;
		}
		System.out.println();
	}
	
	
}
