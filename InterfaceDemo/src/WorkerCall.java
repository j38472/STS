
public class WorkerCall implements IProgress {

	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.setProgress(new WorkerCall());
		worker.working();

	}

	@Override
	public void progress(double percent, int amount) {
		// TODO Auto-generated method stub
		System.out.println("控制台" + percent);
		System.out.println("总任务数" + amount);
	}

}
