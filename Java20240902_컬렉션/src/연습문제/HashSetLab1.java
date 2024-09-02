package 연습문제;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Map;

public class HashSetLab1 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Set<Integer> set = new HashSet<Integer>();
		
		
		while(true) {
			set.add(random.nextInt(30)+10);
			if(set.size() >= 10) 
				break;
		}
		
		for(int n : set)
			System.out.print(n + " ");
		
	}

}
