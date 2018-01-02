package com.csdn.text;

/**
 * ��дһ�����򣬿���3���̣߳���3���̵߳�ID�ֱ�ΪA��B��C��ÿ���߳̽��Լ���ID����Ļ�ϴ�ӡ10�飬
 * Ҫ�����������밴ABC��˳����ʾ���磺ABCABC��.���ε��ơ�
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
