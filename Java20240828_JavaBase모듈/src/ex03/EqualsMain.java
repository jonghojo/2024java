package ex03;

import java.util.HashSet;

class A{
	
	String id;
	int age;
	
	A(String id, int age){
		this.id = id;
		this.age = age;
	}
	//equals 메소드의 재정의
	@Override
	public boolean equals(Object obj) {
		A a = (A)obj;
		return age == a.age;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashcode...............");
		return Integer.hashCode(age);
	}
	
}

public class EqualsMain {

	public static void main(String[] args) {
		
		A a1 = new A("Id1234567", 10);
		A a2 = new A("Id1234", 10);
		A a3 = new A("Id1234", 17);
		
//		System.out.println(a1.equals(a2));
		
		HashSet set = new HashSet();
		
		set.add(a1);
		set.add(a2);
		set.add(a3);
	}

}
