package com.bxd.������������������;

/**
 * ������
 * 
 * @author Administrator
 *
 */
public class Consumer implements Runnable {

	private Resource res;

	Consumer(Resource res) {
		this.res = res;
	}

	public void run() {
		while (true) {
			try {
				res.out();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
