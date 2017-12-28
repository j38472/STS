package com.bxd.Í£Ö¹Ïß³Ì;

public class StopThread implements Runnable {
	private boolean flag = true;
	public synchronized void run(){
		while(flag){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+"InterruptedException");
			}
			System.out.println(Thread.currentThread().getName()+"run");
		}
	}
	public void changeFlag(){
		flag=false;
	}
}
