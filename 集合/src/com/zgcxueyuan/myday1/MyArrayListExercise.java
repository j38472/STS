package com.zgcxueyuan.myday1;

import java.util.*;

/**
 * 
 * 1、ArrayList 的使用方法练习
 * 创建一个学生类 { id ，name ，grade(成绩) } 
 * 创建ArrayList 并用循环添加10个学生类对象（仿造课堂演示方法添加成绩为30---100的随机值 ）
 * 在 0 3 尾部 位置添加 三个学生对象 使用迭代器右由后向前迭代输出所有元素
 * 分别按照 id 升序、 姓名升序 、按照 成绩降序 排序输出
 * 查找 id 为 5的元素 并将其成绩改为200
 * 查找姓名为 stu8 的学生 并将其成绩改为150
 * 将索引为 2 的元素变更成一个新的对象
 * 删除 id 为偶数的元素
 * 
 * @author Administrator
 *
 */
public class MyArrayListExercise {
	public static void main(String[] args) {
		exercise();
	}
	public static void exercise() {//练习
		ArrayList<Student> al = new ArrayList<Student>();
		for (int i = 0; i < 10; i++) {
			al.add(0,new Student(i,"张"+i,i+(3*10)));
		}
		al.add(0,new Student(121,"李1",90));
		al.add(3,new Student(131,"李2",100));
		ListIterator<Student> it = al.listIterator(4);
		for (int i = 4	; it.hasPrevious(); i--) {
			 Student stu =it.previous();
			System.out.println(stu.id+" "+stu.name+" "+stu.grade);
		}
		
		
		
		
	}
}
