package com.zgcxueyuan.a;

/**
 * 图形类
 * 
 * @author Administrator 图形有两点 计算两点之间的距离
 */
public class Patterning {
	int i1;
	int i2;

	public int distance(int i, int y) {
		return Math.abs(i-y);
	}
	public static void main(String[] args) {
		Patterning p = new Patterning();
		
		System.out.println(p.distance(4, 6));
	}
}
