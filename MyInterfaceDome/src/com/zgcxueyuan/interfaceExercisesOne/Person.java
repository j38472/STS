package com.zgcxueyuan.interfaceExercisesOne;

import javax.xml.crypto.Data;

/**
 * 它有setData()和getData()方法对“人”属性name、sex和birthday赋值和获得这些属性组成的字符串信息。
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
