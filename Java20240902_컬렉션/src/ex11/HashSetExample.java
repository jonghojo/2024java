package ex11;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 20));
		
		System.out.println("총 객체 수 :" + set.size());
		
	}

}
