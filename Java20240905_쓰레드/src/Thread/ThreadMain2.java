package Thread;

import static Util.MyLogger.log;

class MyRunnable3 implements Runnable{
	private String msg;
	private int time;
	
	public MyRunnable3(String msg, int time) {
		this.msg = msg;
		this.time = time;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
		log(msg);
		Thread.sleep(time);}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class ThreadMain2 {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new MyRunnable3("A", 1000), "ThreadA");
		Thread thread2 = new Thread(new MyRunnable3("B", 500), "ThreadB");
		
		thread1.start();
		thread2.start();
		
	}

}
