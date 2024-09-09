package Thread;

import static Util.MyLogger.log;
import static Util.ThreadUtils.sleep;

public class JoinMainv1 {

	public static void main(String[] args) {
		
		log("Start");
		Thread thread1 = new Thread(new Job(), "thread-1");
		Thread thread2 = new Thread(new Job(), "thread-2");
		
		thread1.start();
		thread2.start();
		log("end");
		
	}
	
	static class Job implements Runnable{

		@Override
		public void run() {
			log("작업시작");
			sleep(2000);
			log("작업 끝");
		}
		
	}

}
