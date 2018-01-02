package com.csdn.text;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 创建两个线程，其中一个输出1-52，另外一个输出A-Z。输出格式要求：12A 34B 56C 78D
 * 
 * @author Administrator
 *
 */
public class Demo2 {

	public static void main(String[] args) {
		Resource r = new Resource();
		S s = new S(r);
		Z z = new Z(r);
		Thread ts = new Thread(s);
		Thread tz = new Thread(z);
		ts.setPriority(Thread.MAX_PRIORITY);
		tz.setPriority(Thread.MIN_PRIORITY);
		ts.start();
		tz.start();

	}
}

/**
 * 数字类
 * 
 * @author Administrator
 *
 */
class S implements Runnable {
	private Resource res;

	public S(Resource r) {
		this.res = r;
	}

	@Override
	public void run() {
		while (true) {
			res.ss();
		}
	}

}

/**
 * 字母类
 * 
 * @author Administrator
 *
 */
class Z implements Runnable {
	private Resource res;

	public Z(Resource r) {
		this.res = r;
	}

	@Override
	public void run() {
		while (true) {
			res.zz();
		}
	}

}

/**
 * 资源类
 * 
 * @author Administrator
 *
 */
class Resource {
	private int s = 0;
	private int z = 65;
	private int count = 0;
	private boolean flag = true;
	private Lock lock = new ReentrantLock();
	private Condition condition_s = lock.newCondition();
	private Condition condition_z = lock.newCondition();// throws
														// InterruptedException

	public void ss() {
		lock.lock();
		try {
			while (s < 52) {
				System.out.println(s++);
				++count;
//				if (count == 2) 
				condition_s.await();
				condition_z.signal();
			
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			count = 0;
			lock.unlock();
		}

	}

	public void zz() {
		lock.lock();   
		try {
			while (z < 91) {
				System.out.println((char) z++);
				condition_z.await();
				condition_s.signal();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			lock.unlock();
		}

	}
}
