package com.bxd.生产者消费者;

/**
 * 生产者
 * 
 * @author Administrator
 *
 */
public class Producer implements Runnable{
	private Resource res;

	Producer(Resource res) {
		this.res=res;
	}
	public void run() {
		while (true) {
			res.set("+商品+");
		}
	}
}
