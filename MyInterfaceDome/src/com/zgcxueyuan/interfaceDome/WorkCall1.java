package com.zgcxueyuan.interfaceDome;

public class WorkCall1 implements IProgress {
	public static void main(String[] args) {
		Work wc = new Work();
		wc.setProgress(new WorkCall1());
		wc.Workings();
	}
	@Override
	public void progress(double percent, int amount) {
		System.out.println("���ȣ�"+percent+"%");
		System.out.println("��������"+amount);
	}

}
