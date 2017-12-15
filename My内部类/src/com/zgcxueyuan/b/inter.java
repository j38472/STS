package com.zgcxueyuan.b;

class inter {
	
}
	class Outer{
		//补全代码
		public inter  method(){
			return new inter;
		 }
	}
	class OuterDemo{
		public static void main(String[] args) {
			Outer.method().show();
		}
	}
//要求输出HelloWorld