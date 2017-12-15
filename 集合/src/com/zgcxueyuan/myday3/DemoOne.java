package com.zgcxueyuan.myday3;

import java.util.*;

public class DemoOne {
	public static void main(String[] args) {
		Collection<?  > cl0 = new ArrayList<C>();
		Collection<? super B > cl1 = new ArrayList<A>();
		Collection<? extends A > cl2 = new ArrayList<C>();
		
		//¹Ø±Õ×ÊÔ´
		cl0.clear();
		cl1.clear();
		cl2.clear();
	}
}


class A{}
class B extends A{}
class C extends A {}
