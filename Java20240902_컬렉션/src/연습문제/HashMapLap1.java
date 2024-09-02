package 연습문제;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapLap1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("kor", 5000);
		map.put("usa", 33000);
		map.put("cn", 140000);
		map.put("jpn", 12000);
		map.put("aus", 2600);
		System.out.println("총 국가의 수 :" + map.size());
		
		Set<String> keyset = map.keySet();
		Iterator<String> keyIterator = keyset.iterator();
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.printf("국가명을 입력하세요 :%s, 인구수를 입력하세요:%d\n", k, v);
		}

	}

}
