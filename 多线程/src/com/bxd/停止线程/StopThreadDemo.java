package com.bxd.ֹͣ�߳�;

public class StopThreadDemo {
	public static void main(String[] args) {
		StopThread st = new StopThread();

		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		
		t1.start();
		t2.start();
		
		int num = 0;
		while (true) {
			if (num++==60) {
				st.changeFlag();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"........"+num);
		}
	}
}
