package com.bxd.生产者消费者升级版;

/**
 * 生产者
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
				res.set("+商品+");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
