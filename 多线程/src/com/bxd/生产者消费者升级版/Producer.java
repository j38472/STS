package com.bxd.������������������;

/**
 * ������
 * 
 * @author Administrator
 *
 */
public class Producer implements Runnable {
	private Resource res;

	Producer(Resource res) {
		this.res = res;
	}

	public void run() {
		while (true) {
			try {
				res.set("+��Ʒ+");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
