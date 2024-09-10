package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class My4thStream {

	public static void main(String[] args) {
		
		List<ToyPriceInfo> list = new ArrayList<ToyPriceInfo>();
		
		list.add(new ToyPriceInfo("GUN", 2000));
		list.add(new ToyPriceInfo("CAR", 5000));
		list.add(new ToyPriceInfo("TEDDY", 3000));
		list.add(new ToyPriceInfo("SHIP", 7000));
		
		//가격 합 총합
		int sum = list.stream()
				.mapToInt(price -> price.getPrice())
				.sum();// => 2000+5000+3000+7000
		
		System.out.println(sum);
		
		//가격 5,000원 이상만 출력
		int total = list.stream()
				.filter(price -> price.getPrice() >= 5000)//5000 이상만 가져온다
				.mapToInt(price -> price.getPrice())
				.sum();
		
		System.out.println(total);
		
	}

}
