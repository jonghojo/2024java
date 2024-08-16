package ex01;

public class FotEx1 {

	public static void main(String[] args) {
		// FOR 반복문
		int sum = 0;
		
		//시작값에서 끝까지 반복한다. 1 ~ 100 반복한다고 할때 
		//      초기값 끝값    증가값(감소)
//		for(int i=0; i<=10; i++) {
//			sum += i; // 문장
//			//초기값 -> 끝값 -> 문장 -> 증가 -> 반복
//		}
//		
//		System.out.println("sum = " + sum);
		
//		for(int i=0; i<=150; i++)
//			sum += i;
//		System.out.println("sum =" + sum);
		
		for(int i=0; i<=20; i=i+2)
			sum += i;
		
		System.out.println("sum =" + sum);

	}

}
