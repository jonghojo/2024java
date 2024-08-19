package ex02;

public class DoWhile예제 {

	public static void main(String[] args) {
		/*
		 * for : 몇번 회전하는지 아는 경우 사용
		 * while : 회전 횟수를 모를 때 사용
		 * for, while : 1번이 거짓일경우 1번도 실행이 안됨
		 * dowhile : 최소한 한번은 실핼
		 */
		int i = 0;
		int sum = 0;
		
		do {
			sum +=i;
			i++;
		}
		while(i<=100);
		
		System.out.println(sum);
		
	}

}
