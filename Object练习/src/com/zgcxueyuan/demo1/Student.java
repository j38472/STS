package com.zgcxueyuan.demo1;

public class Student {
	int ID; // 学号
	String Name; // 姓名
	int Age; // 年龄
	
	
	
	// 将s字符串转成student类对象
	public static Student convertToStudent(String s) {
		String[] ret = s.split(",");
		if (ret.length != 3) {
			return null;
		}
		Student stu = new Student(Integer.parseInt(ret[0]), ret[1], Integer.parseInt(ret[2]));
		return stu;

	}

	@Override
	public boolean equals(Object obj) {
		@SuppressWarnings("unused")
		boolean isEquals = false;
		if (obj instanceof Student) {
			isEquals = ((Student) obj).ID == ID && ((Student) obj).Age == Age && ((Student) obj).Name.equals(Name);
		}
		return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student st = (Student) super.clone();
		st.ID = ID;
		st.Name = Name;
		st.Age = Age;
		return st;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ID + "," + Name + "," + Age;
	}

	public Student(int id) {
		ID = id;
	}

	public Student(int id, String name) {
		this(id);
		Name = name;
	}

	public Student(int id, String name, int age) {
		this(id, name);
		Age = age;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

}
