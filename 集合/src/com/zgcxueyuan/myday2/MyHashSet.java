package com.zgcxueyuan.myday2;

import java.util.HashSet;

/**
 * 把一个无序重复数组放入HashSet中看那看发生什么
 * @author Administrator
 *
 */
public class MyHashSet {
	public static void main(String[] args) {
		Integer ints [] = {0,0,7,0,2,1,3,1,5,2,4,6,2,1,4,5,4,3,2,1,5}; 
		HashSet hs = new HashSet();
		for (int i = 0; i < ints.length; i++) {
			hs.add(ints[i]);
		}
		System.out.println();
	}
}
