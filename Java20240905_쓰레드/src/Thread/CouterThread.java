package Thread;

import static Util.MyLogger.log;

public class CouterThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			log("value :" + (i+1));
			try {
			Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	} 
}
