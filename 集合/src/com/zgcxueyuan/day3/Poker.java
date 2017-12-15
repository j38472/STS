package com.zgcxueyuan.day3;

/**
 * 
 * @author Administrator
 *
 */
public class Poker {
	private String name;// 扑克牌名字，用来对牌排序
	private int code;// 扑克牌序号，用来对牌排序
	public Poker(int code, String name) {
		this.name = name;
		this.code = code;
	}

	// 下方get set 方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public boolean equals(Object p) {
		boolean isEquals = false;
		if (this.name==p) {
			isEquals=true;
		}
		return isEquals;
	}
	public int hashCode(){
		return this.name.hashCode();
	}
}
