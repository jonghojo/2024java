package 연습문제;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapLap2 {
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("재정의................");
		return super.equals(obj);
	}

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		final int MAX = 5;
		Scanner sc = new Scanner(System.in);
		while(map.size() < MAX) {
			System.out.println("나라이름을 입력하세요");
			String nation = sc.nextLine();
			
			System.out.println("인구수를 입력하세요");
			int pup = Integer.parseInt(sc.nextLine());
			
			if(map.containsKey(nation)) {
				System.out.println("나라명" + nation + "는 이미 저장되었습니다.");
				continue;
			}
			map.put(nation, pup);
		}
		
		Set<String> set = map.keySet();
		for(String s : set)
			System.out.println(s + " " + map.get(s));

	}

}
