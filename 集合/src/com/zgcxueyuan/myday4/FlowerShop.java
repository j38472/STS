package com.zgcxueyuan.myday4;
import java.util.*;
/**
 * ������
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
//		flow.put(001, new Flower("õ��", "10"));
//		flow.put(002, new Flower("õ��2", "20"));
//		Set<Integer> is =	flow.keySet();
//		for (Integer i : is) {
//			System.out.println(flow.get(i).name);
//		}
//		System.out.println();
//	}
	private static void getFlowers() {
		String [] names = {"õ��","�¼�","������", "������", "÷��","����", "���ӻ�", "�һ�", "������", "�ž黨", "�Ե���", "������"};
		Map<Integer, Flower> flow = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			flow.put(i, new Flower(names[i],"֧" ));
			flow.get(i).id=i;
			flow.get(i).price=i+10;
			flow.get(i).amount=i+1000;
		}
		System.out.println();
	}
	
	
}
