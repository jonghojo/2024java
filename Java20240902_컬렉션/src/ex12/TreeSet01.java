package ex12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		
		//TreeSet ==> 자동 정렬(오름차순 정렬)
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(10);
		set.add(8);
		set.add(12);
		set.add(2);
		set.add(19);
		set.add(8);
		set.add(20);
		
		Iterator<Integer> itr = set.iterator(); //반복자 획득
		
		while(itr.hasNext()) 
			System.out.println(itr.next() + " ");
		
	}

}
