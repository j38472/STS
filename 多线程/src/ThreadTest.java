
public class ThreadTest {
	public static void main(String[] args) {
		new Thread(){
			public void run(){
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().toString()+".........................Thread"+i);
				}
			}
		}.start();
		Runnable r = new Runnable (){
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().toString()+".......Runnable"+i);
				}
			};
		};
		new Thread(r).start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().toString()+"......."+i);
		}
//		Text1 t1 = new Text1();
//		t1.run();
		new Text1().start();
	}
}
class Text1 extends Thread  {
	public void run (){
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().toString()+"...........................Text"+i);
		}
		
	}
	
}