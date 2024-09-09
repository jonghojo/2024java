package Thread;

import static Util.MyLogger.log;

import javax.management.RuntimeErrorException;

public class ThreadStateMain {

	public static void main(String[] args) throws InterruptedException{
		
		Thread thread = new Thread(new MyRunnable(), "myThread");
		log("myThread.state1 = " + thread.getState());//NEW
		log("myThread state()");
		thread.start();
		Thread.sleep(1000);
		log("myThread.state3 = " + thread.getState());//TIMED_WAITING
		Thread.sleep(4000);
		log("myThread.state5 = " + thread.getState());//TIMED_WAITING
		log("main end");
	}
	
	static class MyRunnable implements Runnable{

		@Override
		public void run() {
			try {
				log("start");
				log("myThread.stat2 = " + Thread.currentThread().getState());//RUNNABLE
				log("sleep()start");
				Thread.sleep(3000);
				log("sleep()end");
				log("myThread.stat4 = " + Thread.currentThread().getState());//RUNNABLE
				log("end");
			}catch(InterruptedException e) {
				throw new RuntimeException(e);
			}
			
		}
		
	}

}
