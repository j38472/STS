package com.zgcxueyuan.b;

class inter {
	
}
	class Outer{
		//��ȫ����
		public inter  method(){
			return new inter;
		 }
	}
	class OuterDemo{
		public static void main(String[] args) {
			Outer.method().show();
		}
	}
//Ҫ�����HelloWorld