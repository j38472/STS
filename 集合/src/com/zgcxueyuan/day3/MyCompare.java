package com.zgcxueyuan.day3;     

import java.util.Comparator;
/**
 * �Զ�������򷽷�
 * @author Administrator
 *
 */
public class MyCompare implements Comparator<Poker>{

	@Override
	public int compare(Poker o1, Poker o2) {
		// TODO Auto-generated method stub
		if (o1.getCode()-o2.getCode()==0) 
			return o1.getName().compareTo(o2.getName());
		return o1.getCode()-o2.getCode();
	}

}
