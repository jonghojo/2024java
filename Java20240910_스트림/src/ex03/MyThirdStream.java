package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyThirdStream {

	public static void main(String[] args) {
		
		//문자열 길이값 출력 수정불가능
		List<String> list = Arrays.asList("AA", "BBB", "CCCC", "DDDDD", "EEEEEE");
		
		list.stream()
			.map(n -> n.length())//위 문자열에서 문자 갯수를 체크후 갯수를 표기
			.forEach(n -> System.out.print(n + " "));//각각의 갯수별로 나누어서 표기
		
		int count = list.stream()
				.mapToInt(n->n.length())//위에 문자 갯수를 문자에서 정수값으로 치환 후 가져온다
				.sum();
		System.out.println("\n" + count);
		
//		list = new ArrayList<>(list);
//		list.remove(0);
//		for(String str : list)
//			System.out.print(str + " ");
		
	}

}
