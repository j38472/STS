package com.zgcxueyuan.myday1;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
		Collection coll = new ArrayList<>();
		int [] a = {1,2};
		coll.add(5);
		coll.add(a);
		coll.add(2);
		coll.add("java1");
		Iterator it = coll.iterator();
		Student stu =(Student) it.next();
		int [] b =(int []) it.next();
		int i = (int) it.next();
		String str = (String)it.next();
		sop(stu);
		sop(b);
		sop(i);
		sop(str);
	}
	public static void sop(Object o) {
		System.out.println(o);
	}
}
