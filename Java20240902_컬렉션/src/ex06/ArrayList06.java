package ex06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayList06 {

	public static void main(String[] args) {
		
		//출력 => Iterator
		List<String> list = new LinkedList<String>();
		
		
		list.add("kor");
		list.add("eng");
		list.add("Math");
		list.add("com");
		list.add("kor2");
		
		Iterator<String> itr = list.iterator(); //반복자 획득
		
		while(itr.hasNext()) 
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println("----------------");
		
		
		itr = list.iterator(); //반복자 획득
		while(itr.hasNext()) 
			System.out.print(itr.next() + " ");

	}

}
