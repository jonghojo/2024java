package ex16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Queue01 {

	public static void main(String[] args) {
		
		/*
		 * Queue 는 인터페이스이다. 까라서 객체 생성을 할 수 없다.
		 * Queue 를 사용하기 위해서는 Queue 를 구현하든가, 아니면 구현된 객체를 사용한다.
		 */
		Queue<Integer> qu = new LinkedBlockingQueue<Integer>();
		
		qu.offer(10);
		qu.offer(20);
		qu.offer(30);
		
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		
	}

}
