package com.zgcxueyuan.interfaceExercisesOne;

import java.sql.Date;

import javax.xml.crypto.Data;

/**
 * 创建Person接口(即“人”)，
 * 它有setData()和getData()方法对“人”属性name、sex和birthday赋值和获得这些属性组成的字符串信息。
 * 创建类Student实现Person接口，并对自己的“学生”属性的成员变量sID、speciality设置值和获得它们值所组成的字符串信息。
 * @author Administrator
 *
 */
public class Student implements Person{
	private String name;
	private String sex;
	private Date birthday;
	@Override
	public void setDateName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDateSex(String sex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDateBirthday(Data birthday) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDateName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDateSex(String sex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Data getDateBirthday(Data birthday) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
