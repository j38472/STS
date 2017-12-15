
public class TestProgress {
    public static void main(String[] args) {
		Worker worker =new Worker();
		WorkerCall call=new WorkerCall();
		worker.setProgress(call);
    	//worker.setProgress(new WorkerCall());
    	worker.working();
	}
}
