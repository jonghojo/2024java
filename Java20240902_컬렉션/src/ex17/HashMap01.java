package ex17;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Map;

public class HashMap01 {

	public static void main(String[] args) {
		
		
		//key:중복 X value: 중복 O
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "kim");
		map.put(2, "park");
		map.put(3, "hong");
		map.put(4, "lee");
		map.put(4, "cho");
		map.put(3, "sujin");
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		
	}

}
