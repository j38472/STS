package com.bxd.������������������;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ��Դ��
 * 
 * @author Administrator
 *
 */
public class Resource {
	private String name;// ��Ʒ����
	private int count = 1;// ���
	private boolean flag = false;
	private Lock lock = new ReentrantLock();
	private Condition condition_pro = lock.newCondition();
	private Condition condition_con = lock.newCondition();

	public void set(String name) throws InterruptedException{
		lock.lock();
		try {
			while (flag) {
				condition_pro.await();
			}
			this.name = name + "--" + count++;
			System.out.println(Thread.currentThread().getName() + "..������.." + this.name);
			flag = true;
			condition_con.signal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}

	public void out() throws InterruptedException{
		lock.lock();
		try {
			while (!flag) {
				condition_con.await();
			}
			System.out.println(Thread.currentThread().getName() + "..������..........." + this.name);
			flag = false;
			condition_pro.signal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}
}
