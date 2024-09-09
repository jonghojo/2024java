package Thread;

import static Util.MyLogger.log;
import static Util.ThreadUtils.sleep;

public class JoinMainv0 {

	public static void main(String[] args) throws InterruptedException {
		
		log("Start");
		SumTask task1 = new SumTask(1,50);
		SumTask task2 = new SumTask(51,100);
		Thread thread1 = new Thread(task1, "thread-1");
		Thread thread2 = new Thread(task2, "thread-2");
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		log("task1.result = " + task1.result);
		log("task2.result = " + task2.result);
		
		int sumAll = task1.result + task2.result;
		log("task1 + task2 = " + sumAll);
		log("end");
		
	}
	
	static class SumTask implements Runnable{
		int startvalue;
		int endvalue;
		int result=0;
		
		public SumTask(int s, int e) {
			startvalue = s;
			endvalue = e;
			
		}
		
		
		@Override
		public void run() {
			log("작업 시작");
			sleep(2000);
			int sum = 0;
			for(int i=startvalue; i<=endvalue; i++)
				sum += i;
			result = sum;
			log("작업 완료 result = " + result);
		}
		
	}

}
