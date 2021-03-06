package com.zgcxueyuan.free;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateUtil {
	/**
	 * 实例化方法： 格式化输出日期 toString () addYear(int n ) addMonth(int n) addDar(int n)
	 * getYear() getMonth() getDay() subtract(Date) 返回天
	 * 
	 * 静态方法 getAge(Date) subtract(Date,Date) toString(Date,String)
	 * 
	 * @return
	 */
	// private int year;
	// private int month;
	// private int day;
	private Date mDate;
	Calendar cal = Calendar.getInstance();

	public DateUtil(Date date) {
		mDate = date;
		cal.setTime(mDate);
	}

	public DateUtil(long millis) {
		mDate = new Date(millis);
		cal.setTimeInMillis(millis);
	}

	public DateUtil(String date) throws ParseException {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		mDate = format.parse(date);
		cal.setTime(mDate);
	}

	public int getAge(Date date) {
		int age = 0;
		if (date.getMonth() > mDate.getMonth()) {
			age += 1;
		} else if (date.getMonth() == mDate.getMonth() && date.getDay() > mDate.getDay()) {
			age += 1;
		}
		age += mDate.getYear() - date.getYear();

		return age;

	}

	@SuppressWarnings("deprecation")
	public void addYear(int n) {
		this.mDate.setYear(this.mDate.getYear() + n);
	}

	@SuppressWarnings("deprecation")
	public void addMonth(int n) {
		this.mDate.setMonth(this.mDate.getMonth() + n);

	}

	@SuppressWarnings("deprecation")
	public void addDay(int n) {
		this.mDate.setDate(getDay() + n);

	}

	public int getYear() {
		return cal.get(Calendar.YEAR);

	}

	public int getMonth() {
		return cal.get(Calendar.MONTH);
	}

	public int getDay() {
		return cal.get(Calendar.DAY_OF_MONTH);
	}

	public int subtract(Date date) {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.DAY_OF_YEAR);
	}

	public String toString() {

		return null;
	}
}
