package com.bxd.���ȼ���yield����;

class Demo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 70; i++) {
			System.out.println(Thread.currentThread().toString() +"....."+ i);
			Thread.yield();
		}
	}

}

public class DemoClass {
	public static void main(String[] args) throws InterruptedException {
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		t1.start();
//		t1.setPriority(Thread.MAX_PRIORITY);
		t2.start();
//		t1.join();
		for (int i = 0; i < 8; i++) {
			System.out.println(Thread.currentThread().toString()+"....................." + i);
		}
		System.out.println("main.....over");

	}
}