package com.csdn.text;

/**
 * 编写一个程序，开启3个线程，这3个线程的ID分别为A、B、C，每个线程将自己的ID在屏幕上打印10遍，
 * 要求输出结果必须按ABC的顺序显示；如：ABCABC….依次递推。
 * 
 * @author Administrator
 *
 */
public class Demo1 {
	public static void main(String[] args) {
//		new B().run();
		Thread tA = new Thread(new A());
		Thread tB = new Thread(new B());
		Thread tC = new Thread(new C());
		for (int i = 0; i < 10; i++) {
			tA.run();
			tB.run();
			tC.run();
			System.out.println();
		}
	}
}

class A implements Runnable {

	@Override
	public void run() {
		Thread.currentThread().setName("A");
		System.out.print(Thread.currentThread().getName());
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}

class B implements Runnable {

	@Override
	public void run() {
		Thread.currentThread().setName("B");
		System.out.print(Thread.currentThread().getName());
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class C implements Runnable {

	@Override
	public void run() {
		Thread.currentThread().setName("C");
		System.out.print(Thread.currentThread().getName());
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
