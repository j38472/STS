package com.zgcxueyuan.interfaceExercisesOne;

import javax.xml.crypto.Data;

/**
 * ����setData()��getData()�����ԡ��ˡ�����name��sex��birthday��ֵ�ͻ����Щ������ɵ��ַ�����Ϣ��
 * @author Administrator
 *
 */
public interface Person {
	public void setDateName (String name ); 
	public void setDateSex (String sex ); 
	public void setDateBirthday (Data birthday ); 
	public String getDateName (String name ); 
	public String getDateSex (String sex ); 
	public Data getDateBirthday (Data birthday ); 
}
