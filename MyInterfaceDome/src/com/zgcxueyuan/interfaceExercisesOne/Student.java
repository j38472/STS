package com.zgcxueyuan.interfaceExercisesOne;

import java.sql.Date;

import javax.xml.crypto.Data;

/**
 * ����Person�ӿ�(�����ˡ�)��
 * ����setData()��getData()�����ԡ��ˡ�����name��sex��birthday��ֵ�ͻ����Щ������ɵ��ַ�����Ϣ��
 * ������Studentʵ��Person�ӿڣ������Լ��ġ�ѧ�������Եĳ�Ա����sID��speciality����ֵ�ͻ������ֵ����ɵ��ַ�����Ϣ��
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
