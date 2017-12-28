package com.bxd.生产者消费者升级版;

public class MainClass {
	public static void main(String[] args) {
		Resource r = new Resource();
		Producer p = new Producer(r);
		Consumer c = new Consumer(r);
		Thread t1 = new Thread(p);
		Thread t3 = new Thread(p);
		Thread t2 = new Thread(c);
		Thread t4 = new Thread(c);
		t1.start();
		t3.start();
		t2.start();
		t4.start();
	}
}
