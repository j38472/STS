package com.zgcxueyuan.myday4;
/**
 * �ʻ���
 * @author Administrator
 *
 */
public class Flower {
	int id = 0 ; //id
	int price = 0; // �۸�
	int amount = 0 ; // ����
	String name = null; //����
	String units = null;//��λ��֧ �� ����
	/**
	 * 
	 * @return ���� �۸�/��λ
	 */
	public String NamePriceunits (){
		return name+" "+price +"/"+units; 
	}
	public Flower() {
	}
	public Flower(String name) {
		this.name = name;
	}
	public Flower(String name , String units) {
		this(name);
		this.units=units;
	}
	
	//�·�Ϊget set  ����
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
}
