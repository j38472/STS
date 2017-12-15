public class WorkCall2 implements IProgress {
	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.setProgress(new WorkCall2());
		worker.working();
	}

	@Override
	public void progress(double percent, int amount) {
		// TODO Auto-generated method stub
		System.out.println("圆形进度" + percent);
		System.out.println("总任务数" + amount);
	}
}
