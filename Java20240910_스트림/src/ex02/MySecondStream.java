package ex02;

import java.util.Arrays;

public class MySecondStream {

	public static void main(String[] args) {
		
		//문자열 길이갑 출력
		String[] arr = {"AA", "BBB", "CCCC", "DDDDD", "EEEEEE"};
		
		
//		for(String str : arr) {
//			System.out.print(str.length() + " ");
//		}
		
		Arrays.stream(arr)
			.map(n -> n.length())
			.forEach(n -> System.out.print(n + " "));
		
		int total = Arrays.stream(arr)
				.mapToInt(n->n.length())
				.sum();
		System.out.println("\n" + total);
		
		
	}

}
