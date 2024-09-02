package ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class A{
	@Override
	public String toString() {
		return "Aclass";
	}
}

public class ArrayList04 {

	public static void main(String[] args) {
		
		//타입 제한 => String
		List<String> list = new LinkedList<String>();
		
//		list.add(10);
//		list.add(new Integer(20));
		list.add("kor");
//		list.add(new A());
		list.add("eng");
		list.add("Math");
		list.add("com");
		
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		list.remove(0);
		
		for(Object obj : list)
			System.out.print(obj + " ");

	}

}
