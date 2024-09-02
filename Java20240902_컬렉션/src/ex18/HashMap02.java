package ex18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Map;

public class HashMap02 {

	public static void main(String[] args) {
		
		
		//key:중복 X value: 중복 O
		//>>> 순차 출력(반복문 , iterator 로 출력???)
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(11, "kim");
		map.put(21, "park");
		map.put(32, "hong");
		map.put(43, "lee");
		map.put(44, "cho");
		map.put(32, "sujin");
		map.put(17, "park");
		
		Set<Integer> set = map.keySet();
		for(Integer n : set)
			System.out.print(n + " ");
		System.out.println();
		
		for(Integer n : set)
			System.out.println(map.get(n));
		System.out.println("--------------");
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println( map.get(itr.next()) );
		}
		
	}

}
