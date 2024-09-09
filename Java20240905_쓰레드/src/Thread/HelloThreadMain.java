package Thread;

public class HelloThreadMain {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + " main() start");
		
		HelloThread helloThread = new HelloThread();
		
		System.out.println(Thread.currentThread().getName() + " start() 호출전");
		helloThread.start();
		System.out.println(Thread.currentThread().getName() + " start() 호출후");
		
		System.out.println(Thread.currentThread().getName() + " main() end");
		
	}

}
