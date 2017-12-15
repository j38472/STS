
public class Worker {

	private IProgress mProgress = null;

	public void setProgress(IProgress progress) {
		mProgress = progress;
	}

	public void working() {
		for (int i = 0; i < 1000; i++) {
			// ��һЩ����
			// System.out.println( "�����" +((i+1)/1000.0)*100+"%" );
			if (mProgress != null)
				mProgress.progress(((i + 1) / 1000.0) * 100, 1000);
		}
	}

}
