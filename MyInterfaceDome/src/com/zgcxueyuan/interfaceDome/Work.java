package com.zgcxueyuan.interfaceDome;

public class Work {
	private IProgress mProgress = null;

	public void setProgress(IProgress progress) {
		mProgress = progress;
	}

	/*
	 * ������
	 */
	public void Workings() {
		// Progress p = new Progress();
		if (mProgress != null) {
			System.out.println("��ʼ");
			for (int i = 0; i <= 10000; i++) {
				if (i % 100 == 0) {
					mProgress.progress((i++ / 10000.0) * 100, 10);
				}
			}
			System.out.println("����");
		}
	}

}
