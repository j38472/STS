package com.zgcxueyuan.demo1;

import org.junit.Test;

public class StudentTest {

	@Test
	public void test() {
		Student s1 = new Student(10,"����",50);
		Student s2 = new Student(10,"����",50);
		System.out.println(s1.equals(s2));
	}


}
