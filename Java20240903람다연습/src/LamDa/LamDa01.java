package LamDa;

import java.util.List;
import java.util.function.Predicate;

public class LamDa01 {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = num -> (num%2==0) ? true : false;//람다식

		Predicate<Integer> predicate2 = new Predicate<Integer>() {
				@Override
				public boolean test(Integer t) {
					return (t%2==0) ? true : false;
				}
		};
		
		int num=19;
		
		if(predicate2.test(num)) {
			System.out.println("짝수!");
		}else {
			System.out.println("홀수");
		}

	}

}
