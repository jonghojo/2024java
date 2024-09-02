package ex13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet02 {

	public static void main(String[] args) {
		
		//TreeSet ==> 자동 정렬(오름차순 정렬)
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("kor");
		set.add("eng");
		set.add("KOR");
		set.add("ENG");
		set.add("MATH");
		set.add("math");
		set.add("abc");
		
		Iterator<String> itr = set.iterator(); //반복자 획득
		
		while(itr.hasNext()) 
			System.out.println(itr.next() + " ");
		
	}

}
