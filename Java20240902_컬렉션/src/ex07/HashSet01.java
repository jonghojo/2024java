package ex07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet01 {

	public static void main(String[] args) {
		
		//출력 => Iterator
		Set<String> set = new HashSet<String>();
		
		
		set.add("kor");
		set.add("eng");
		set.add("Math");
		set.add("com");
		set.add("kor2");
		
		Iterator<String> itr = set.iterator(); //반복자 획득
		
		while(itr.hasNext()) 
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println("----------------");
		
		
		itr = set.iterator(); //반복자 획득
		while(itr.hasNext()) 
			System.out.print(itr.next() + " ");

	}

}
