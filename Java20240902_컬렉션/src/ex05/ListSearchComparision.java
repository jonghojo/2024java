package ex05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class A{
	@Override
	public String toString() {
		return "Aclass";
	}
}

public class ListSearchComparision {

	public static void main(String[] args) {
		
		//리스트에 저장할 요소 수
		int size = 10_000_000; // 10 million
		int interations = 1000; // 검색횟수 반복
		
		//난수 생성기
		List<Integer> arrayList = new ArrayList<>(size);
		List<Integer> linkedList = new LinkedList<>();
//		List<Integer> linkedList = new VectorList<>();
		
		//ArrayList 와 LinkedList에 랜덤한 정수 추가
		Random random = new Random();
		for (int i=0; i<size; i++) {
			int value = random.nextInt();
			arrayList.add(value);
			linkedList.add(value);
		}
		
		//ArrayList 검색 테스트
		long startTime = System.nanoTime();
		for(int i=0; i<interations; i++) {
			int index = size / 2;
			arrayList.get(index);
		}
		long endTime = System.nanoTime();
		long arrayListDuration = endTime - startTime;
		
		//LinkedList 검색 테스트
		startTime = System.nanoTime();
		for(int i=0; i<interations; i++) {
			int index = size/2;
			linkedList.get(index);
		}
		endTime = System.nanoTime();
		long linkedListDuration = endTime - startTime;
		
		//결과 출력
		System.out.println("ArrayList 검색 시간:" +
				arrayListDuration + "ns");
		System.out.println("LinkedList 검색 시간" +
				linkedListDuration + "ns");
	}

}
